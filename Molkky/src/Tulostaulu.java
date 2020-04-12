import java.util.ArrayList;

public class Tulostaulu {
	private ArrayList<Pelaaja> pelaajat;
	
	public Tulostaulu() {
		//this.nimi = nimi;
		this.pelaajat = new ArrayList<>();
	}
	
	public void lisaaPelaaja(Pelaaja pelaaja) {
		this.pelaajat.add(pelaaja);
	}

	
	public ArrayList<Pelaaja> getPelaajat() {
		return pelaajat;
	}

	public void setTulokset(ArrayList<Pelaaja> tulokset) {
		this.pelaajat = tulokset;
	}
}