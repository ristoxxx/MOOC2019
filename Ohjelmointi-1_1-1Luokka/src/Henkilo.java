public class Henkilo {
    private String nimi;
    private String osoite;
    
    public Henkilo(String hloNimi, String hloOsoite) {
    	this.nimi = hloNimi;
        this.osoite = hloOsoite;
    }

	@Override
    public String toString() {
        return this.nimi + "\n" + "  " + this.osoite;
    }
    
}
