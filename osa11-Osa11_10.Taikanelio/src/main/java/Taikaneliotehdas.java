
public class Taikaneliotehdas {
    public Taikanelio luoTaikanelio(int koko) {


        Taikanelio nelio = new Taikanelio(koko);
        int x = koko / 2;
        int y = 0;

        int luku = 1;
        int lukuja = koko * koko;

        while (luku <= lukuja) {
            nelio.asetaArvo(x, y, luku);

            // onko oikealla yläpuolella oleva paikka vapaana
            // haetaan paikka
            int kandidaattiY = y - 1;
            int kandidaattiX = x + 1;

            if (kandidaattiY < 0) {
                kandidaattiY += koko;
            }

            if (kandidaattiX >= koko) {
                kandidaattiX %= koko;
            }

            // jos paikka on vapaana, tehdään siirto sinne
            if (nelio.annaArvo(kandidaattiX, kandidaattiY) == 0) {
                x = kandidaattiX;
                y = kandidaattiY;
            } else {
                // paikka ei ole vapaana, siirrytään "alas"
                y++;
                if (y >= koko) {
                    y = 0;
                }
            }

            luku++;

        }

        return nelio;
    }

}
