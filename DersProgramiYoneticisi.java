import java.util.ArrayList;
import java.util.List;

public class DersProgramiYoneticisi {
    private List<DersProgrami> programListesi = new ArrayList<>();

    // Çakışma Kontrol Algoritması
    public boolean dersAta(Ders ders, Derslik derslik, String gun, String saatDilimi) {
        for (DersProgrami p : programListesi) {
            if (p.getGun().equalsIgnoreCase(gun) && p.getSaatDilimi().equalsIgnoreCase(saatDilimi)) {
                // Derslik çakışması kontrolü
                if (p.getDerslik().getDerslikKodu().equalsIgnoreCase(derslik.getDerslikKodu())) {
                    System.out.println("HATA: Bu derslik seçilen gün ve saatte dolu!");
                    return false;
                }
                // Öğretim elemanı çakışması kontrolü
                if (p.getDers().getOgretimElemani().getId().equalsIgnoreCase(ders.getOgretimElemani().getId())) {
                    System.out.println("HATA: Öğretim elemanının bu saatte başka bir dersi var!");
                    return false;
                }
            }
        }
        programListesi.add(new DersProgrami(ders, derslik, gun, saatDilimi));
        System.out.println("Başarılı: Ders başarıyla programlandı.");
        return true;
    }

    public List<DersProgrami> getProgramListesi() {
        return programListesi;
    }
}