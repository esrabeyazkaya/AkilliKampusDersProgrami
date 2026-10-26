public abstract class Kullanici {
    private String id;
    private String adSoyad;
    private String eposta;

    public Kullanici(String id, String adSoyad, String eposta) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.eposta = eposta;
    }

    public String getId() { return id; }
    public String getAdSoyad() { return adSoyad; }
    public String getEposta() { return eposta; }

    public abstract void bilgiGoster();
}