import java.util.ArrayList;
import java.util.Scanner;
public class Pelaaja {
	
	private final String nimi;
    private Integer kokonaispisteet;
    private ArrayList<Integer> heitot; 
    private Scanner lukija = new Scanner(System.in);

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.setKokonaispisteet(0);
        this.heitot = new ArrayList<>(); 
    }

    public void pelaa() {
    	System.out.print("Anna pelaajan " + this.nimi + " pisteet: ");
    	int pisteet = Integer.valueOf(lukija.nextLine());
    	//Integer pisteet = 5;//Integer.valueOf(lukija.nextLine()) 
    	this.kokonaispisteet = this.getKokonaispisteet() + pisteet;
    	this.heitot.add(pisteet);
    }

    public Integer getKokonaispisteet() {
		return kokonaispisteet;
	}

	public void setKokonaispisteet(Integer kokonaispisteet) {
		this.kokonaispisteet = kokonaispisteet;
	}

	public String getNimi() {
		return nimi;
	}

	@Override
    public String toString() {
        return this.nimi +" Heitot: "+ this.heitot +" Kokonaispisteet: "+ this.kokonaispisteet;
    }
}