
public class Kortti implements Comparable<Kortti> {

    private int arvo;
    private Maa maa;

    public Kortti(int arvo, Maa maa) {
        if (arvo < 2 || arvo > 14) {
            throw new IllegalArgumentException("Kortin arvon tulee olla väliltä 2...14.");
        }

        this.arvo = arvo;
        this.maa = maa;
    }

    @Override
    public String toString() {
        String kortinArvo = "" + arvo;
        if(arvo == 11) {
            kortinArvo = "J";
        } else if (arvo == 12) {
            kortinArvo = "Q";
        } else if (arvo == 13) {
            kortinArvo = "K";
        } else if (arvo == 14) {
            kortinArvo = "A";
        }
        
        return maa + " " + kortinArvo;
    }

    public int getArvo() {
        return arvo;
    }

    public Maa getMaa() {
        return maa;
    }
    
    
    public int compareTo(Kortti kortti) {
        if (this.arvo == kortti.getArvo() && this.maa.ordinal() == kortti.getMaa().ordinal()) {
                return 0;
        }    
            if ((this.maa.ordinal() * 100) + this.getArvo() < (kortti.getMaa().ordinal() * 100) + kortti.getArvo()) {
                return -1;
            } else { 
                return 1;
            }
//       if (this.arvo > kortti.getArvo()) {
//           return 1;
//       } else {
//            return -1;
//       }        
    }
}
