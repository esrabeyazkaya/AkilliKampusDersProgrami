import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DosyaVeriDepolama {
    public static void programiDosyayaYaz(List<DersProgrami> liste, String dosyaAdi) {
        try (FileWriter writer = new FileWriter(dosyaAdi)) {
            for (DersProgrami p : liste) {
                writer.write(p.toString() + "\n");
            }
            System.out.println("Veriler başarıyla '" + dosyaAdi + "' dosyasına kalıcı olarak kaydedildi.");
        } catch (IOException e) {
            System.out.println("Dosya yazma hatası: " + e.getMessage());
        }
    }
}