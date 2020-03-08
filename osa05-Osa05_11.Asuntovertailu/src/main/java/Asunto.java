
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public int getNeliohinta() {
        return neliohinta;
    }

    public int getNelioita() {
        return nelioita;
    }    
    
    public boolean suurempi(Asunto verrattava) {
        int eka = this.getNelioita();
        int toka = verrattava.getNelioita();
        
        if (eka > toka) {
            return true;
        }
        
        if (toka < eka) {
            return false;
        }
        
        else {
            return false;
        }
    }
    
//    public boolean vanhempiKuin(Henkilo verrattava) {
        // 1. Verrataan ensin vuosia
//        int omaVuosi = this.getSyntymapaiva().getVuosi();
//        int verrattavanVuosi = verrattava.getSyntymapaiva().getVuosi();

//        if (omaVuosi < verrattavanVuosi) {
//            return true;
//        }

//        if (omaVuosi > verrattavanVuosi) {
//            return false;
//        }
    
    
    
    public int hintaero(Asunto verrattava) {
        int ekaNeliot = this.getNelioita();
        int ekaNeliohinta = this.getNeliohinta();
        int tokaNeliot = verrattava.getNelioita();
        int tokaNeliohinta = verrattava.getNeliohinta();
        
        if (ekaNeliot*ekaNeliohinta > tokaNeliot*tokaNeliohinta) {
            return ekaNeliot*ekaNeliohinta - tokaNeliot*tokaNeliohinta ;
        }
        
        if (ekaNeliot*ekaNeliohinta < tokaNeliot*tokaNeliohinta) {
            return tokaNeliot*tokaNeliohinta - ekaNeliot*ekaNeliohinta;
        }
        
        else {
            return -1;
        }
        
        
        
          
        
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        int ekaNeliot = this.getNelioita();
        int ekaNeliohinta = this.getNeliohinta();
        int tokaNeliot = verrattava.getNelioita();
        int tokaNeliohinta = this.getNeliohinta();
       
        
        if (ekaNeliot*ekaNeliohinta > tokaNeliot*tokaNeliohinta) {
            return true;
        }
        
        if (ekaNeliot*ekaNeliohinta < tokaNeliot*tokaNeliohinta) {
            return false;
        }
        
        else {
            return false;
        }
    }

}
