
package hayvanatbahcesiprojesi;

import enums.Cinsiyet;

public class HayvanatBahcesiTest {

    
    public static void main(String[] args) {
        
        HayvanatBahcesi bahcesi = new HayvanatBahcesi();

        bahcesi.koyunEkle(15, 15);
        bahcesi.inekEkle(5, 5);
        bahcesi.tavukEkle(10);
        bahcesi.kurtEkle(5, 5);
        bahcesi.horozEkle(10);
        bahcesi.aslanEkle(4, 4);
        bahcesi.avciEkle();
        for (int i = 0; i < 1000; i++) {
            for (Hayvan hayvan : bahcesi.hayvanlar) {
                hayvan.hareketEt();
                hayvan.avlanmaKontrolEt();
                hayvan.ure();
                hayvan.hayvanSayisi();            
            }
            
        }
       
    }
}
    
    

