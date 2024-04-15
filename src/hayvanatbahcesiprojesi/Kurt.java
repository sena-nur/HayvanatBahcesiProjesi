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
public class Kurt extends Hayvan {

    public Kurt(int x, int y, Cinsiyet cinsiyet) {
        super(x, y, Cins.KURT, cinsiyet, 3);
        Hayvan.hayvanlar.add(this);
    }

    @Override
    public void avlan(Hayvan av) {
        if (av instanceof Koyun || av instanceof Tavuk || av instanceof Horoz) {
            av.hayatta = false;
            hayvanlar.remove(av);
        }
    }

    @Override
    public int avlanmaMenzili() {
        return 4;
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
        
        Hayvan yeniHayvan = (new Kurt(yeniX, yeniY, rastgeleCinsiyet()));
        return yeniHayvan;
    } 
}

