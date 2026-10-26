public class Derslik {
    private String derslikKodu;
    private int kapasite;
    private boolean akilliTahtaVarMi;

    public Derslik(String derslikKodu, int kapasite, boolean akilliTahtaVarMi) {
        this.derslikKodu = derslikKodu;
        this.kapasite = kapasite;
        this.akilliTahtaVarMi = akilliTahtaVarMi;
    }

    public String getDerslikKodu() { return derslikKodu; }
    public int getKapasite() { return kapasite; }
    public boolean isAkilliTahtaVarMi() { return akilliTahtaVarMi; }
}