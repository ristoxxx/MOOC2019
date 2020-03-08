
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia); 

        return uusi;
    }
    
    public boolean vahemman(Raha verrattava) {
        if (this.euroa + 0.1 * this.senttia < verrattava.euroa + 0.1 * verrattava.senttia) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public Raha miinus(Raha vahentaja) {
            Raha nolla = new Raha(0, 0);
        
   //     if (this.vahemman(vahentaja)) {
            if (this.senttia < vahentaja.senttia) {
                if (this.euroa - 1 - vahentaja.euroa < 0) {
                    return nolla;
                } else {
                    Raha vahemman = new Raha(this.euroa - 1 - vahentaja.euroa, this.senttia + 100 - vahentaja.senttia);
                    return vahemman;
                }
            } else {
                if (this.euroa - vahentaja.euroa < 0) {
                    return nolla;
                } else {
                    Raha vahemman = new Raha(this.euroa - vahentaja.euroa, this.senttia - vahentaja.senttia);
                    return vahemman;
                }
            }
//        } else {
//            Raha nolla = new Raha(0, 0);
 //           return nolla;
   //     }
        
    }


}
