
package hayvanatbahcesiprojesi;

import enums.Cins;
import enums.Cinsiyet;

public class Tavuk extends Hayvan {

    public Tavuk(int x, int y, Cinsiyet cinsiyet) {
        super(x, y, Cins.TAVUK, cinsiyet, 1);
        Hayvan.hayvanlar.add(this);
    }

    @Override
    public void avlan(Hayvan av) {
        // Tavuk avlanamaz.
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


