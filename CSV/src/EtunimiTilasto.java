/**
 *
 * @author Evermore
 **/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EtunimiTilasto {
	public static void main(String[] args) {
		TiedostonLukija lukija = new TiedostonLukija("etunimet.csv");
		List<String> rivit = lukija.lueRivit();
		
		Map<String, Integer> nimet = new HashMap<>();
		for (String rivi: rivit) {
			rivi = rivi.replaceAll(" ", "");			
			String[] palat = rivi.split(";");
			Integer result = nimet.putIfAbsent(palat[0], Integer.valueOf(palat[1]));
			
			if(result!=null){
				nimet.put(palat[0], Integer.valueOf(palat[1]) + result);
			}
				
		}
		Scanner syote = new Scanner(System.in);
		while (true) {
        System.out.print("Anna etunimi: ");
        String haettava = syote.nextLine();
        Integer hakuTulos = nimet.get(haettava);
        if (haettava.contains("lopeta")) {
        	break;
        }else if (hakuTulos == null) {
        	hakuTulos = 0;        	
        	System.out.println(haettava +": " + hakuTulos + " kappaletta");
        }else {
        	System.out.println(haettava +": " + hakuTulos + " kappaletta");
        }
		}
		//System.out.println(kaannokset);
	}
}
//else{
//	System.out.println("Successfully inseerted to the database");
//}
//kaannokset.put(palat[0], Integer.valueOf(palat[1]));		
//rivit.add(foobar.replaceAll(" ", ""));
//List<String> muut = new ArrayList<>();
//muut.add(foobar);
//System.out.println(Integer.valueOf(palat[1]));
// System.out.println(foobar);
// rivit.add(x);
//String foobar = muut.get(1);
//foobar = foobar.replaceAll(" ", "");
//System.out.println(palat[0]);
//System.out.println(palat[1]);
//System.out.println(palat[2]);
//String maara = rivit[1];
//rivit.get(1) = rivit.get(1).replaceAll(" ", "");
//rivit.get(1).replaceAll(" ", "");
//rivit.get(1).add(rivit.get(1).toUpperCase());
//rivit.get(1).   //("moi");