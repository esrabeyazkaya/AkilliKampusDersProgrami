Akıllı Kampüs Ders Programı (Smart Campus Course Scheduling System)

Bu proje, Nesneye Yönelik Programlama (NYP) dersi kapsamında geliştirilmiş; derslik ve öğretim elemanlarının çakışma olmadan otomatik olarak planlanmasını sağlayan nesne yönelimli bir konsol uygulamasıdır.

👥 Proje Ekip Bilgileri (proje_takimi.txt)

Esra Beyazkaya - 1250505070 - Model ve Algoritma Geliştirme

Hüda Nur Sel - 1250505012 - Mimari ve Tasarım Kalıpları

Gülcan Yaman - 1250505076 - Test ve Dokümantasyon

🔗 GitHub Deposu: https://github.com/esrabeyazkaya/AkilliKampusDersProgrami

🏗️ Proje Mimarisi ve Sınıf Yapısı

Projede en az 8 anlamlı sınıf, kalıtım (inheritance), soyutlama (abstraction), kapsülleme (encapsulation) ve çok biçimlilik (polymorphism) ilkeleri uygulanmıştır:

Kullanici (Abstract Class): Temel kullanıcı özelliklerini barındıran soyut sınıf.

OgretimElemani (Inheritance): Kullanici sınıfından türetilen, unvan ve bölüm bilgisi tutan sınıf.

Ders: Dersin kodu, adı, kredisi ve dersi veren öğretim elemanı bilgilerini tutar.

Derslik: Dersliğin kodu, kapasitesi ve teknik imkanlarını (akıllı tahta vb.) barındırır.

DersProgrami: Atanan ders, derslik, gün ve saat dilimi eşleştirmesini tutar.

DersProgramiYoneticisi (Algoritma): Çakışma kontrol algoritmasını barındırır. Aynı derslikte veya aynı hoca üzerinde aynı saatte çakışma olup olmadığını denetler.

DosyaVeriDepolama (Kalıcılık): Verilerin konsol hafızasında kalmayıp harici bir metin dosyasına (ders_programi_cikti.txt) kalıcı olarak yazılmasını sağlar.

Main (Konsol Arayüzü): Uygulamanın çalıştırıldığı ana sınıftır.

⚙️ Kurulum ve Çalıştırma Rehberi

Projeyi yerel bilgisayarınızda derleyip çalıştırmak için şu adımları izleyebilirsiniz:

Depoyu klonlayın veya zip olarak indirin:

git clone https://github.com/esrabeyazkaya/AkilliKampusDersProgrami.git


Proje klasörünün içine terminal/komut satırı ile gidin.

Java dosyalarını derleyin:

javac *.java


Programı çalıştırın:

java Main
