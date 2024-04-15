
package hayvanatbahcesiprojesi;

import enums.Cinsiyet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HayvanatBahcesi {
    
    private int alanGenisligi=500;
    private int alanYuksekligi=500;
    final List<Hayvan> hayvanlar;
    
     public HayvanatBahcesi() {
        this.hayvanlar = new ArrayList<>();
    }
    
     //test classı için hayvan ekleme methodları
     
    public void koyunEkle(int erkekSayisi, int disiSayisi) {
        for (int i = 0; i < erkekSayisi; i++) {
            Hayvan yeniHayvan=new Koyun(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Koyun(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            }
            hayvanlar.add(yeniHayvan);
        }
        for (int i = 0; i < disiSayisi; i++) {
            Hayvan yeniHayvan=new Koyun(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Koyun(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            }
            hayvanlar.add(yeniHayvan);
        }
    }

    public void inekEkle(int erkekSayisi, int disiSayisi) {
       for (int i = 0; i < erkekSayisi; i++) {
            Hayvan yeniHayvan=new Inek(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Inek(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            }
            hayvanlar.add(yeniHayvan);
        }
        for (int i = 0; i < disiSayisi; i++) {
            Hayvan yeniHayvan=new Inek(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Inek(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            }
            hayvanlar.add(yeniHayvan);
        }
    }

    public void kurtEkle(int erkekSayisi, int disiSayisi) {
        for (int i = 0; i < erkekSayisi; i++) {
            Hayvan yeniHayvan=new Kurt(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Kurt(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            }
            hayvanlar.add(yeniHayvan);
        }
        for (int i = 0; i < disiSayisi; i++) {
            Hayvan yeniHayvan=new Kurt(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Kurt(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            }
            hayvanlar.add(yeniHayvan);
        }
    }

    public void tavukEkle(int disiSayisi) {
        for (int i = 0; i < disiSayisi; i++) {
            Hayvan yeniHayvan=new Tavuk(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Tavuk(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            }
            hayvanlar.add(yeniHayvan);
        }
    }

    public void horozEkle(int erkekSayisi) {
        for (int i = 0; i < erkekSayisi; i++) {
            Hayvan yeniHayvan=new Horoz(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Horoz(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            }
            hayvanlar.add(yeniHayvan);
        }
       
    }

    public void aslanEkle(int erkekSayisi, int disiSayisi) {
        for (int i = 0; i < erkekSayisi; i++) {
            Hayvan yeniHayvan=new Aslan(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Aslan(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.ERKEK);
            }
            hayvanlar.add(yeniHayvan);
        }
        for (int i = 0; i < disiSayisi; i++) {
            Hayvan yeniHayvan=new Aslan(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            while(yeniHayvan.hayvanVarMi(yeniHayvan.rastgeleKonumX(), yeniHayvan.rastgeleKonumY()) !=null) {
                yeniHayvan=new Aslan(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.DISI);
            }
            hayvanlar.add(yeniHayvan);
        }
    }
    
    public void avciEkle() {
     
            Hayvan yeniCanli=new Avcı( rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.BELİRTİLMEMİS);
            while(yeniCanli.hayvanVarMi(yeniCanli.rastgeleKonumX(), yeniCanli.rastgeleKonumY()) !=null) {
                yeniCanli=new Avcı(rastgeleKonumX(), rastgeleKonumY(), Cinsiyet.BELİRTİLMEMİS);
            }
            hayvanlar.add(yeniCanli);
        }
        
    
    
    public int rastgeleKonumX() {
        return new Random().nextInt( alanGenisligi + 1);
    }

    public int rastgeleKonumY() {
        return new Random().nextInt(alanYuksekligi+ 1);
    }

    
    
 }
    
    
    

