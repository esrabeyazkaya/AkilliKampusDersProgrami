public class Ders {
    private String dersKodu;
    private String dersAdi;
    private int kredi;
    private OgretimElemani ogretimElemani;

    public Ders(String dersKodu, String dersAdi, int kredi, OgretimElemani ogretimElemani) {
        this.dersKodu = dersKodu;
        this.dersAdi = dersAdi;
        this.kredi = kredi;
        this.ogretimElemani = ogretimElemani;
    }

    public String getDersKodu() { return dersKodu; }
    public String getDersAdi() { return dersAdi; }
    public int getKredi() { return kredi; }
    public OgretimElemani getOgretimElemani() { return ogretimElemani; }
}