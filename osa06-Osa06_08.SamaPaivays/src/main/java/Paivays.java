
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi
                && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        
        
        if (this.vuosi == verrattava.vuosi
                && this.kuukausi == verrattava.kuukausi
                && this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

    public int erotusVuosissa(Paivays verrattava) {
        if (aiemmin(verrattava)) {
            return verrattava.erotusVuosissa(this);
        }

        int vuosiPois = 0;

        if (this.kuukausi < verrattava.kuukausi) {
            vuosiPois = 1;
        } else if (this.kuukausi == verrattava.kuukausi && this.paiva < verrattava.paiva) {
            vuosiPois = 1;
        }

        return this.vuosi - verrattava.vuosi - vuosiPois;
    }

    @Override
    public boolean equals(Object object) {
        
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }
        
        Paivays verrattava = (Paivays) object;
        
        if (this.vuosi == verrattava.vuosi
                && this.kuukausi == verrattava.kuukausi
                && this.paiva == verrattava.paiva) {
            return true;
        }

        return false;
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.paiva;
        hash = 53 * hash + this.kuukausi;
        hash = 53 * hash + this.vuosi;
        return hash;
    }
}
