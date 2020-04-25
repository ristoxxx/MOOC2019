package tietokantaJDBC;

public class Ostos {
	private String nimi;
	private long rivi;
	
	public Ostos(String nimi) {
		this.nimi = nimi;
		this.rivi = 0;
	}
	
	public Ostos(String nimi,long rivi) {
		this.nimi = nimi;
		this.rivi = rivi;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public long getRivi() {
		return rivi;
	}
	public void setRivi(int rivi) {
		this.rivi = rivi;
	}
	
}
