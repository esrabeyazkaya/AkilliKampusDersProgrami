public class DersProgrami {
    private Ders ders;
    private Derslik derslik;
    private String gun;
    private String saatDilimi;

    public DersProgrami(Ders ders, Derslik derslik, String gun, String saatDilimi) {
        this.ders = ders;
        this.derslik = derslik;
        this.gun = gun;
        this.saatDilimi = saatDilimi;
    }

    public Ders getDers() { return ders; }
    public Derslik getDerslik() { return derslik; }
    public String getGun() { return gun; }
    public String getSaatDilimi() { return saatDilimi; }

    @Override
    public String toString() {
        return gun + " [" + saatDilimi + "] -> " + ders.getDersAdi() + 
               " (" + ders.getOgretimElemani().getAdSoyad() + ") | Derslik: " + derslik.getDerslikKodu();
    }
}