# HayvanatBahcesiProjesi

Bu proje 500x500 boyutunda bir alanda hayvan ekosistemini simüle etmektedir. Koyun, inek, tavuk, horoz, kurt, aslan ve avcı gibi çeşitli hayvan türleri bu ekosistem içerisinde etkileşim içindedir. Her hayvanın hareket, avlanma ve üreme gibi kendine özgü davranışları vardır.

## Features 
-  Hayvanlar çiftlikte random olarak x ve y yönünde hareket edebilir.
-  Aynı konumda iki hayvan aynı anda bulunamaz.
-  Avlanma:Yırtıcı hayvanlar (kurtlar, aslanlar, avcılar) yakındaki avları (koyun, inek, tavuk vb.) avlarlar.
-  Üreme: Hayvanlar yakın olduklarında üreyebilirler ve bu da yeni yavruların doğmasına yol açar.
-  Yeni yavruların cinsiyeti ve konumları randomdur. 
-  Simülasyon sonuçları : Her hayvan türünün zaman içindeki popülasyonunu gösterir.

## Project Structure

`HayvanatBahcesiTest.java:`  Simülasyonu yöneten ana sınıf.

`HayvanatBahcesi.java:`Main class için hayvanat bahçesine hayvan eklenmesine yardımcı sınıf.
`(Hayvan.java:)` Hayvanların ortak özelliklerini ve davranışlarını temsil eden soyut sınıf.

`Hayvan alt sınıfları (Koyun.java, Kurt.java, Aslan.java vb.:` Kendine özgü davranışlarıyla belirli hayvan türlerini temsil eden sınıflar.

`README.md:` Projeye genel bir bakış ve kullanım talimatlarını sağlayan bu dosyadır.
![image](https://github.com/sena-nur/HayvanatBahcesiProjesi/assets/80694577/b466892d-4f65-4a70-ae4f-ef17bc3682fb)

