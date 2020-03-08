package schelling;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Eriytymismalli {

    private Taulukko taulukko;

    private double prosAlueestaKaytossa;
    private int tyytyvaisyysraja;
    private int ryhmienLukumaara;

    private boolean kaynnissa;

    public Eriytymismalli(int leveys, int korkeus, int tyytyvaisyysraja, int ryhmienLukumaara, double prosAlueestaKaytossa) {
        this.taulukko = new Taulukko(leveys, korkeus);

        this.tyytyvaisyysraja = tyytyvaisyysraja;
        this.ryhmienLukumaara = ryhmienLukumaara;
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;

        this.kaynnissa = false;
    }

    public void kaynnista() {
        this.kaynnissa = true;
    }

    public void sammuta() {
        this.kaynnissa = false;
    }

    public boolean onKaynnissa() {
        return this.kaynnissa;
    }

    public void asetaRyhmienLukumaara(int ryhmia) {
        this.ryhmienLukumaara = ryhmia;
    }

    public void asetaProsAlueestaKaytossa(double prosAlueestaKaytossa) {
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;
    }

    public void asetaTyytyvaisyysRaja(int tyytyvaisyysraja) {
        this.tyytyvaisyysraja = tyytyvaisyysraja;

    }

    public void alusta() {
        tyhjennä();
        arvoAlkuarvot();
    }

    public void tyhjennä() {
        for (int x = 0; x < taulukko.getLeveys(); x++) {

            for (int y = 0; y < taulukko.getKorkeus(); y++) {

                

                    this.taulukko.aseta(x, y, 0);

                }
            }
    }
    
    public void arvoAlkuarvot() {
        Random arpoja = new Random();

        for (int x = 0; x < taulukko.getLeveys(); x++) {

            for (int y = 0; y < taulukko.getKorkeus(); y++) {

                // Random-luokan metodi nextDouble palauttaa satunnaisen luvun
                // nollan ja yhden välillä
                double satunnainenLukuNollanJaYhdenValilla = arpoja.nextDouble();

                // jos 100*arvo on pienempi kuin prosAlueestaKaytossa, paikkaan
                // asetetaan arvo
                if (100 * satunnainenLukuNollanJaYhdenValilla < prosAlueestaKaytossa) {
                    int ryhma = 1 + arpoja.nextInt(ryhmienLukumaara);

                    this.taulukko.aseta(x, y, ryhma);

                }
            }
        }
    }

    public Taulukko getData() {
        return this.taulukko;
    }

    public void setData(Taulukko taulukko) {
        this.taulukko = taulukko;
    }

    public ArrayList<Piste> tyhjatPaikat() {
        ArrayList<Piste> tyhjat = new ArrayList<>();
        for (int x = 0; x < taulukko.getLeveys(); x++) {

            for (int y = 0; y < taulukko.getKorkeus(); y++) {
                int piste = taulukko.hae(x, y); 
                if (piste == 0) {
                    Piste uusi = new Piste(x, y);
                    tyhjat.add(uusi);
                }

//                    this.taulukko.aseta(x, y, ryhma);

                }
            }
        // Luo täällä lista, missä on kaikki tyhjät paikat piste-olioina.
        // Tyhjissä paikoissa on arvo 0

        return tyhjat;
    }

    public void paivita() {
        ArrayList<Piste> tyytymattomat = haeTyytymattomat();

        if (tyytymattomat.isEmpty()) {
            return;
        }

        Collections.shuffle(tyytymattomat);

        while (!tyytymattomat.isEmpty()) {
            Piste tyytymaton = tyytymattomat.remove(0);

            ArrayList<Piste> tyhjat = tyhjatPaikat();
            Collections.shuffle(tyhjat);

            Piste tyhja = tyhjat.get(0);

            int tyytymattomanRyhma = this.taulukko.hae(tyytymaton.getX(), tyytymaton.getY());

            this.taulukko.aseta(tyhja.getX(), tyhja.getY(), tyytymattomanRyhma);
            this.taulukko.aseta(tyytymaton.getX(), tyytymaton.getY(), 0);
        }
    }

    public ArrayList<Piste> haeTyytymattomat() {
        ArrayList<Piste> tyytymattomat = new ArrayList<>();
        int samat = 0;
        int xKoko = taulukko.getLeveys();
        int yKoko = taulukko.getKorkeus();
        int x = 0;
        int y = 0;

        while (y < yKoko - 1) {
                x = 0;
                while (x < xKoko - 1) {
                    int piste = taulukko.hae(x, y);
        //vasemmalla
        if (x > 0) {
            if (taulukko.hae(x-1, y) == piste) {
                samat++;

            }
        }
        //oikealla
        if (x < xKoko - 1) {
            if (taulukko.hae(x+1, y) == piste) {
                samat++;

            }
            
        }
        //ylhäällä
        if (y > 0) {
            if (taulukko.hae(x, y-1) == piste) {
                samat++;

            }
        }
        //alhaalla
        if (x < yKoko - 1) {
            if (taulukko.hae(x, y+1) == piste) {
                samat++;

            }
            
        }
        //ylävasemmalla
        if (x > 0 && y > 0) {
            
            if (taulukko.hae(x-1, y-1) == piste) {
                samat++;

            }
        }
        //yläoikealla
        if (y > 0 && x < xKoko -1 ) {
            if (taulukko.hae(x+1, y-1) == piste) {
                samat++;

            }
        }
        //alavasemmalla
        if (x > 0 && y < yKoko - 1) {
            if (taulukko.hae(x-1, y+1) == piste) {
                samat++;

            }
        }
        //alaoikealla
        if (x < xKoko -1 && y < yKoko -1) {
            if (taulukko.hae(x+1, y+1) == piste) {
                samat++;

            }
        }

        if (samat < tyytyvaisyysraja) {
            Piste uusi = new Piste(x, y);
            tyytymattomat.add(uusi);
         
        }
        samat = 0;
        x++;    
        }
        y++;
        }
    
        
        
        // Etsi täällä tyytymättömät
        return tyytymattomat;
    }


}
