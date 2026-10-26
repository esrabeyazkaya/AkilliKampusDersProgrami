public class OgretimElemani extends Kullanici {
    private String unvan;
    private String bolum;

    public OgretimElemani(String id, String adSoyad, String eposta, String unvan, String bolum) {
        super(id, adSoyad, eposta);
        this.unvan = unvan;
        this.bolum = bolum;
    }

    public String getUnvan() { return unvan; }
    public String getBolum() { return bolum; }

    @Override
    public void bilgiGoster() {
        System.out.println("Öğretim Elemanı: " + unvan + " " + getAdSoyad() + " (" + bolum + ")");
    }
}