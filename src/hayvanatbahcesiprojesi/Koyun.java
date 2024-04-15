
package hayvanatbahcesiprojesi;

import enums.Cins;
import enums.Cinsiyet;

public class Koyun extends Hayvan {

    public Koyun(int x, int y, Cinsiyet cinsiyet) {
        super(x, y, Cins.KOYUN, cinsiyet, 2);
        Hayvan.hayvanlar.add(this);
        
    }
    
    @Override
    public void avlan(Hayvan av) {
        //Avlanamaz 
    }

    @Override
    public int avlanmaMenzili() {
       return 0;
    }
    @Override
    public Hayvan yeniHayvanUret() {
        int yeniX = (int) rastgeleKonumX();
        int yeniY = (int) rastgeleKonumY();
        Hayvan sonuc = hayvanVarMi(yeniX, yeniY);

        while (sonuc != null) {
            yeniX = (int) rastgeleKonumX();
            yeniY = (int) rastgeleKonumY();
            sonuc = hayvanVarMi(yeniX, yeniY);
           // Güncellenmiş konum için burada başka bir hayvan bulunup
           // bulunmadığını tekrar kontrol yapıyoruz
        }

        //yoksa yeni hayvanımız üredi 
        Hayvan yeniHayvan = new Koyun(yeniX, yeniY, rastgeleCinsiyet());
        return yeniHayvan;
    }
}
