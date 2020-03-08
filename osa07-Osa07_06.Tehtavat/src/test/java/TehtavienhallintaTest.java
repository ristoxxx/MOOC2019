
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/**
 *
 * @author Evermore
 */
public class TehtavienhallintaTest {
    
//    public TehtavienhallintaTest() {
        
        @Test            
        public void tehtavalistaAlussaTyhja() {        
        Tehtavienhallinta hallinta = new Tehtavienhallinta();        
        assertEquals(0, hallinta.tehtavalista().size());
        }
        
        @Test
        public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
        }
    
        @Test
        public void lisattyTehtavaLoytyyTehtavalistalta() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
        }
        
        @Test
        public void tehtavanVoiMerkataTehdyksi() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Uusi tehtävä");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertTrue(hallinta.onTehty("Uusi tehtävä"));
        }
        
        @Test
        public void tehdyksiMerkkaamatonEiOleTehty() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Uusi tehtava");
        hallinta.merkkaaTehdyksi("Uusi tehtava");
        assertFalse(hallinta.onTehty("Joku tehtava"));
        }
        
        @Test
        public void poistettuOnPoistettu() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Eka tehtava");
        hallinta.poista("Eka tehtava");
        assertFalse(hallinta.tehtavalista().contains("Eka tehtävä"));
        }
    
}