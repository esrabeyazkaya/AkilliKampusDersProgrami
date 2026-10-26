public class Main {
    public static void main(String[] args) {
        DersProgramiYoneticisi yonetici = new DersProgramiYoneticisi();

        // Güncellenmiş Test Verileri (Selçuk Yazar ve Perşembe 09:00-12:00)
        OgretimElemani hoca1 = new OgretimElemani("H01", "Selçuk Yazar", "selcuk.yazar@Kirklareli.edu.tr", "Doç. Dr.", "Yazılım Mühendisliği");
        Ders ders1 = new Ders("BYM101", "Nesneye Yönelik Programlama", 4, hoca1);
        Derslik derslik1 = new Derslik("D-201", 60, true);

        // Ders Atama (Perşembe 09:00-12:00)
        yonetici.dersAta(ders1, derslik1, "Perşembe", "09:00-12:00");

        // Kalıcı Veri Kaydetme
        DosyaVeriDepolama.programiDosyayaYaz(yonetici.getProgramListesi(), "ders_programi_cikti.txt");
    }
}