/**
 *
 * @author Evermore
 */
import java.util.ArrayList;

public class Muutoshistoria {
    private ArrayList<Double> historia;
    
    
    public Muutoshistoria() {
        this.historia = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        this.historia.add(tilanne);
    }
    
    public void nollaa() {
        this.historia.clear();
    }
    
    public double minArvo() {
        double min = historia.get(0);
        for (double mini : historia) {
            if (mini < min) {
                min = mini;
            }
        }
        return min;
        
    }
    
    public double maxArvo() {
        double max = 0;
        for (double maxi : historia) {
            if (maxi > max) {
                max = maxi;
            }
        }
        return max;
    }
    
    public double keskiarvo() {
        double maara = this.historia.size();
        double summa = 0.0;
            for (double luku : historia) {
                summa = summa + luku;
            }
        return summa / maara;
    }
        
    @Override
    public String toString() {
        return this.historia.toString();     
    }
}
