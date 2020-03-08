public class YhdenTavaranLaatikko extends Laatikko {

    private Tavara tavara;

    public YhdenTavaranLaatikko() {
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavara != null) {
            return;
        }

        this.tavara = tavara;
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return this.tavara != null && this.tavara.equals(tavara);
    }
}