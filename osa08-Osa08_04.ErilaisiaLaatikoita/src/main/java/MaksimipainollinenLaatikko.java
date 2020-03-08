
import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko {

    private ArrayList<Tavara> tavarat;
    private int maksimipaino;

    public MaksimipainollinenLaatikko(int tilavuus) {
        this.maksimipaino = tilavuus;
        this.tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavaroidenPaino() + tavara.getPaino() > this.maksimipaino) {
            return;
        }

        this.tavarat.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return this.tavarat.contains(tavara);
    }

    private int tavaroidenPaino() {
        int paino = 0;
        for (Tavara tavara : this.tavarat) {
            paino = paino + tavara.getPaino();
        }

        return paino;
    }
}