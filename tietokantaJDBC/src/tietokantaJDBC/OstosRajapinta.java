package tietokantaJDBC;
import java.util.List;

public interface OstosRajapinta {

	    public List<Ostos> listaa();

		public String lisaa(String nimi) ;

		public String poista(String nimi) ;
	    
		public String tyhjenna();
}
