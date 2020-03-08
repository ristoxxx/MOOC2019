
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
    }
    
    public static List<Integer> positiiviset(List<Integer> luvut) {
        ArrayList<Integer> positiiviset = luvut.stream()    
                .filter(luku -> luku >= 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return positiiviset;

    }

}
