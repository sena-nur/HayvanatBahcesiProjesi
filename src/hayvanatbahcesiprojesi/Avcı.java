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
public class Avcı extends Hayvan {

    public Avcı(int x, int y, Cinsiyet cinsiyet) {
        super(x, y, Cins.AVCI, cinsiyet, 8);
        Hayvan.hayvanlar.add(this);//her oluşan hayvan listeye eklenir
    }

    @Override
    public void avlan(Hayvan av) {
        av.hayatta = false;
        hayvanlar.remove(av); //avlanan hayvan listeden remove edilir
    }

    @Override
    public int avlanmaMenzili() {
        return 8;
    }


    @Override
    public Hayvan yeniHayvanUret() {
    // Avcılar üremez, bu yüzden null veya geçerli olmayan bir Hayvan nesnesi döndürebiliriz
    return null; 
}
}
