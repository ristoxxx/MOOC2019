
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KirjatTiedostosta {
    
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        
        
        
        // testaa metodia täällä

    }
    
    public static List<Kirja> lueKirjat(String tiedosto) {
        List<Kirja> kirjat = new ArrayList<>();
        try {
            // luetaan tiedosto "presidentit.txt" riveittäin
            Files.lines(Paths.get(tiedosto))
                // pilkotaan rivi osiin ";"-merkin kohdalta
                .map(rivi -> rivi.split(","))
                // poistetaan ne pilkotut rivit, joissa alle 2 osaa
                // (haluamme että rivillä on aina nimi ja syntymävuosi)
                .filter(palat -> palat.length >= 2)
                // luodaan palojen perusteella henkilöitä
                .map(palat -> new Kirja(palat[0], Integer.valueOf(palat[1]), Integer.valueOf(palat[2]), palat[3]))
                // ja lisätään henkilöt lopulta listalle
                .forEach(kirja -> kirjat.add(kirja));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        return kirjat;
    }
}
