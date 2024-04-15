
package hayvanatbahcesiprojesi;

import enums.Cins;
import enums.Cinsiyet;

public class Inek extends Hayvan {

    public Inek(int x, int y, Cinsiyet cinsiyet) {
        super(x, y, Cins.INEK, cinsiyet, 2);
        hayvanlar.add(this);
    }

   
     @Override
    public void avlan(Hayvan av) {
        // Inek avlanamaz.
    }

    @Override
    public int avlanmaMenzili() {
        return 0;
    }


    @Override
    public Hayvan yeniHayvanUret() {
        int yeniX = (int)rastgeleKonumX();
        int yeniY= (int) rastgeleKonumY();
        Hayvan sonuc = hayvanVarMi(yeniX, yeniY);
        while (sonuc != null) {
            yeniX = rastgeleKonumX();
            yeniY = rastgeleKonumY();
            sonuc = hayvanVarMi(yeniX, yeniY);
        }
        
        Hayvan yeniHayvan = (new Inek (yeniX, yeniY, rastgeleCinsiyet()));
        return yeniHayvan;
    } 

   
    }
    

