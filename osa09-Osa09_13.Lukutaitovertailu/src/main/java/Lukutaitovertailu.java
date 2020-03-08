
import java.io.IOException;
import static java.lang.Double.compare;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        List<Tilasto> tilastot = new ArrayList<>();
        try {
            Files.lines(Paths.get("lukutaito.csv"))
                .map(rivi -> rivi.split(","))
                .filter(palat -> palat.length >= 2)
                .map(palat -> new Tilasto(palat[2].substring(0, palat[2].length() - 4), palat[3], Integer.valueOf(palat[4]), Double.valueOf(palat[5]))) 
                .forEach(Tilasto -> tilastot.add(Tilasto));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        tilastot.stream().sorted((h1, h2) -> {
        return compare(h1.getProsentti(), h2.getProsentti());
        }).forEach(h -> System.out.println(h.toString()));
        
        
    }

    
}
