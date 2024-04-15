/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hayvanatbahcesiprojesi;

import enums.Cins;
import enums.Cinsiyet;

/**
 *
 * @author Sena
 */
public class Aslan extends Hayvan {

    public Aslan(int x, int y, Cinsiyet cinsiyet) {
        super(x, y, Cins.ASLAN, cinsiyet, 4);
        Hayvan.hayvanlar.add(this);
    }

    @Override
    public void avlan(Hayvan av) {
        if (av instanceof Koyun || av instanceof Inek) {
            av.hayatta = false;
            hayvanlar.remove(av);
        }
    }
    
 @Override
    public int avlanmaMenzili() {
        return 5;
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
        
        Hayvan yeniHayvan = (new Aslan (yeniX, yeniY, rastgeleCinsiyet()));
        return yeniHayvan;
    } 
}
