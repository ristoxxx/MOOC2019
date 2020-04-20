package lempinimetPunaMusta;
/**
*
* @author Evermore
**/
import java.util.Map;
import java.util.TreeMap;

public class Lempinimet {
	public static void main(String[] args) {
		//http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=3274405
		//TiedostonLukija lukija = new TiedostonLukija("etunimet.csv");
		//List<String> rivit = lukija.lueRivit();
		
		Map<String, String> nimet = new TreeMap<>();
		nimet.put("Teemu", "The Finnish Flash");
		nimet.put("Jari", "Litti");
		nimet.put("Kaisa-Leena", "Kappa");
		System.out.println(nimet);
		System.out.print(0);
		}
}
//Teemu	The Finnish Flash
//Jari	Litti
//Kaisa-Leena	Kappa