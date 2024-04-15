
package hayvanatbahcesiprojesi;

import enums.Cins;
import enums.Cinsiyet;


public class Horoz extends Hayvan {

    public Horoz(int x, int y, Cinsiyet cinsiyet) {
        super(x, y, Cins.HOROZ, cinsiyet, 1);
        Hayvan.hayvanlar.add(this);
    }

    @Override
    public void avlan(Hayvan av) {
        // Horoz avlanamaz.
    }

    @Override
    public int avlanmaMenzili() {
        return 0;
    }

    @Override
    public Hayvan yeniHayvanUret() {
        Cinsiyet yeniYavruCinsiyet = rastgeleCinsiyet();
        int yeniX = (int)rastgeleKonumX();
        int yeniY= (int) rastgeleKonumY();
        //cinsiyet erkekse rastgele hayvan olmayan konumda yeni horoz üremiş olur
        if(yeniYavruCinsiyet== Cinsiyet.ERKEK) {
            
            Hayvan sonuc = hayvanVarMi(yeniX, yeniY);
            while (sonuc != null) {
                yeniX = rastgeleKonumX();
                yeniY = rastgeleKonumY();
                sonuc = hayvanVarMi(yeniX, yeniY);
            }
            Hayvan yeniHayvan = (new Horoz(yeniX, yeniY, yeniYavruCinsiyet));
            return yeniHayvan;
        }
        //cinsiyet dişiyse rastgele hayvan olmayan konumda yeni tavuk üremiş olur
        else{
            Hayvan sonuc = hayvanVarMi(yeniX, yeniY);
            while (sonuc != null) {
                yeniX = rastgeleKonumX();
                yeniY = rastgeleKonumY();
                sonuc = hayvanVarMi(yeniX, yeniY);
            }
            Hayvan yeniHayvan = (new Tavuk(yeniX, yeniY, yeniYavruCinsiyet));
            return yeniHayvan;
        }
        
        
        
    }
}
