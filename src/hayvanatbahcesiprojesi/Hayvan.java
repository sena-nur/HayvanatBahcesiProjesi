
package hayvanatbahcesiprojesi;
//cins ve cinsiyeti enom olarak tuttum
import enums.Cins;
import enums.Cinsiyet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract  class Hayvan {
    private int x;
    private int y;
    private Cins cins;
    private Cinsiyet cinsiyet;
    private int adimUzunlugu;
    public boolean hayatta;
    private static final int ALAN_GENISLIGI = 500;
    private static final int ALAN_YUKSEKLIGI = 500;
    public static List<Hayvan> hayvanlar = new ArrayList<>();

    public Hayvan(int x, int y, Cins cins, Cinsiyet cinsiyet, int adimUzunlugu) {
        this.x = x;
        this.y = y;
        this.cins = cins;
        this.cinsiyet = cinsiyet;
        this.adimUzunlugu = adimUzunlugu;
        this.hayatta = true;
        
        
    }
    public void hareketEt() {  
    int yeniX = x;
    int yeniY = y;
    int yon = rastgeleYon();
    
    // Yeni konumu belirleme
    //alan taşma kontrölü
    if (yon == 0){
        yeniX = x + adimUzunlugu;
        if (yeniX > 500){
            yeniX = x - adimUzunlugu;
        }
    }
    else if (yon == 1){
        yeniX = x - adimUzunlugu;
        if ( yeniX < 0 ){
            yeniX = x + adimUzunlugu;
        }
    }
    else if ( yon==2 ) {
        yeniY = y + adimUzunlugu;
        if (yeniY > 500){
            yeniY = y - adimUzunlugu;
        }
    }
    else if ( yon == 3) { 
        yeniY = y - adimUzunlugu;
        if ( yeniY < 0) {
            yeniY = y + adimUzunlugu;
        }
    }

    // Yeni konumda başka bir hayvan varsa, tekrar konumlandırma yapılması
    while (hayvanVarMi(yeniX, yeniY)!=null) {
        
        // Yön ve adım uzunluğunu yeniden belirleme
        yon = rastgeleYon();
        if (yon == 0) {
            yeniX = x + adimUzunlugu;
            if (yeniX > 500){
                yeniX = x - adimUzunlugu;
            }
        } else if (yon == 1) {
            yeniX = x - adimUzunlugu;
            if ( yeniX < 0 ){
                yeniX = x + adimUzunlugu;
            }
        } else if (yon == 2) {
            yeniY = y + adimUzunlugu;
            if (yeniY > 500){
                yeniY = y - adimUzunlugu;
            }
        } else {
            yeniY = y - adimUzunlugu;
            if ( yeniY < 0) {
                yeniY = y + adimUzunlugu;
            }
        }
    }

    // Eski konumdaki hayvanı listeden kaldırma
    Hayvan eskiKonumdakiHayvan = hayvanVarMi(x, y);
    if (eskiKonumdakiHayvan != null) {
    // Geçici bir liste oluşturma
    List<Hayvan> geciciListe = new ArrayList<>(hayvanlar);
    
    // Geçici listeden elemanı kaldırıyoruz
    geciciListe.remove(eskiKonumdakiHayvan);
    
    // Ana listeyi güncelleriz
    hayvanlar = geciciListe;
}

    // Yeni konuma hayvanı yerleştirme
    x = yeniX;
    y = yeniY;
    hayvanlar.add(this); // Hayvanı listeye ekleme
}

    
    public void avlanmaKontrolEt() {
    //avlanabilen hayvanlar için kontrol    
    for (Hayvan av : new ArrayList<>(hayvanlar)) {
        if (av.hayatta && av != this && mesafeHesapla(av) <= avlanmaMenzili() && av.getCins() != this.cins) {
            if (!(this instanceof Koyun || this instanceof Inek || this instanceof Tavuk || this instanceof Horoz)) {
                avlan(av);
            }
            else 
                continue;
        }
    }
}
 
    
    public Cinsiyet rastgeleCinsiyet() {
    return new Random().nextBoolean() ? Cinsiyet.ERKEK : Cinsiyet.DISI;
}
    
    protected void ure() {
        List<Hayvan> yeniDoganlar = new ArrayList<>();

        for (Hayvan hayvan : new ArrayList<>(hayvanlar)) {
            if (hayvan.isHayatta()) {
                for (Hayvan es : new ArrayList<>(hayvanlar)) {
                    if (es.isHayatta() && es != hayvan && mesafeHesapla(es) <= ureMenzili()) {
                        // Tavuk ve Horoz çiftleşme kontrolü
                        if ((hayvan instanceof Tavuk && es instanceof Horoz) || (hayvan instanceof Horoz && es instanceof Tavuk)) {
                            Hayvan yeniHayvan = yeniHayvanUret();
                            if (yeniHayvan != null) {
                                yeniDoganlar.add(yeniHayvan);

                            }

                        }
                        //diğer hayvanlar için kontrol
                        else if (es.getCins() == hayvan.getCins() && es.getCinsiyet() != hayvan.getCinsiyet()) {
                            Hayvan yeniHayvan = yeniHayvanUret();
                            if (yeniHayvan != null) {
                                yeniDoganlar.add(yeniHayvan);

                            }

                        }
                    }
                }
            }
        }
        hayvanlar.addAll(yeniDoganlar);
    }
    //abstract methodlar
    public abstract void avlan(Hayvan av);
    public abstract int avlanmaMenzili();
    public int ureMenzili()  {
        return 3; //hepsi için aynı
    }
    public abstract Hayvan yeniHayvanUret();
    
  
    public int mesafeHesapla(Hayvan hayvan) {
        int xMesafe = Math.abs(this.x - hayvan.x);
        int yMesafe = Math.abs(this.y - hayvan.y);
        
        // Diagonal mesafe hesaplama 
        int mesafe = (int) Math.sqrt(Math.pow(xMesafe, 2) + Math.pow(yMesafe, 2));
        return mesafe;
    }

    public int rastgeleYon() {
        return new Random().nextInt(4);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Cins getCins() {
        return cins;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public boolean isHayatta() {
        return hayatta;
    }
    
   public int rastgeleKonumX() {
       
        return new Random().nextInt(ALAN_GENISLIGI + 1);
    }

    public int rastgeleKonumY() {
        return new Random().nextInt(ALAN_YUKSEKLIGI + 1);
    }
    
    
    // o konumda başka bir hayvan var mı kontrolü

    public Hayvan hayvanVarMi(int x, int y) {
        for (Hayvan hayvan : hayvanlar) {
            if (hayvan.getX() == x && hayvan.getY() == y) {
                return hayvan;
            }
        }
        return null;
    }
   
    
    @Override
    public String toString() {
        return "Hayvan{" +
                "x=" + x +
                ", y=" + y +
                ", cins=" + cins +
                ", cinsiyet=" + cinsiyet +
                ", adimUzunlugu=" + adimUzunlugu +
                ", hayatta=" + hayatta +
                '}';
    }
    
    //simülasyon boyunca hayvan sayıları
    public void hayvanSayisi() {
        int koyunSayisi = 0, inekSayisi = 0, tavukSayisi = 0, kurtSayisi = 0, horozSayisi = 0, aslanSayisi = 0, avciSayisi = 0;
        for (Hayvan hayvan : hayvanlar) {
            if (hayvan instanceof Koyun) {
                koyunSayisi++;
            } else if (hayvan instanceof Inek) {
                inekSayisi++;
            } else if (hayvan instanceof Tavuk) {
                tavukSayisi++;
            } else if (hayvan instanceof Kurt) {
                kurtSayisi++;
            } else if (hayvan instanceof Horoz) {
                horozSayisi++;
            } else if (hayvan instanceof Aslan) {
                aslanSayisi++;
            } else if (hayvan instanceof Avcı) {
                avciSayisi++;
            }
        }

        System.out.println("Koyun Sayısı: " + koyunSayisi);
        System.out.println("İnek Sayısı: " + inekSayisi);
        System.out.println("Tavuk Sayısı: " + tavukSayisi);
        System.out.println("Kurt Sayısı: " + kurtSayisi);
        System.out.println("Horoz Sayısı: " + horozSayisi);
        System.out.println("Aslan Sayısı: " + aslanSayisi);
        System.out.println("Avcı Sayısı: " + avciSayisi);
    }



     
}
