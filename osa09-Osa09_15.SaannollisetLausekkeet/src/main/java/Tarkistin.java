

public class Tarkistin {
    
    public boolean onViikonpaiva(String merkkijono) {
        if (merkkijono.matches("ma|ti|ke|to|pe|la|su")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean kaikkiVokaaleja(String merkkijono) {
        if (merkkijono.matches("[a|e|i|o|u|å|ö|ä]*")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean kellonaika(String merkkijono) {
        if (merkkijono.matches("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]") && !merkkijono.matches("[2][4-9]:[0-5][0-9]:[0-5][0-9]")) {
                return true;
        } else {
            return false;
        }

    }

}
