package gameoflife;

import java.util.Random;

public class GameOfLife {
    private int korkeus;
    private int leveys;
    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.korkeus = korkeus;
        this.leveys = leveys;
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.2) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void kehity() {
//        int x = 0;
//        int y = 0;
//        int xKoko = taulukko.length;
//        int yKoko = taulukko[0].length;
        int[][] kopio = new int[leveys][korkeus];
        // säännöt kehittymiselle:
//        System.out.println(this.taulukko.length);
            for (int x = 0; x < leveys; x++) {
                for (int y = 0; y < korkeus; y++) {
                    int arvo = taulukko[x][y];
//                    System.out.println(x +""+ y + leveys + korkeus);
                    int naapureita = elossaOleviaNaapureita(taulukko, x, y);
                    // 1. jokainen elossa oleva alkio, jolla on alle 2 elossa olevaa naapuria kuolee
                    if (arvo == 1 && naapureita < 2) {
                        kopio[x][y] = 0;            
                    }
                    // 2. jokainen elossa oleva alkio, jolla on 2 tai 3 elossa olevaa naapuria pysyy hengissä
                    if (arvo == 1 && (naapureita == 2 || naapureita == 3)) {
                        kopio[x][y] = 1;            
                    }
                    // 3. jokainen elossa oleva alkio, jolla on 4 tai enemmän naapureita kuolee
                    if (arvo == 1 && naapureita > 3) {
                        kopio[x][y] = 0; 
                    }
//                    System.out.println(x +""+ y);
                    // 4. jokainen kuollut alkio, jolla on tasan 3 naapuria muuttuu eläväksi
                    if (arvo == 0 && naapureita == 3) {
                        kopio[x][y] = 1; 
            //            System.out.println("eloon!");
                    }   
//                    x++;
                }
//                y++;        
        }        
        this.taulukko = kopio;    
        // taulukossa arvo 1 kuvaa elävää alkiota, arvo 0 kuollutta alkiota
    }

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        
        int samat = 0;
        int xKoko = taulukko.length;
        int yKoko = taulukko[x].length;
//        int x = 0;
//        int y = 0;

//        while (y < yKoko - 1) {
//                x = 0;
//                while (x < xKoko - 1) {
//                    int 1 = taulukko[x][y];
        //vasemmalla
        if (x > 0) {
            if (taulukko[x-1][y] == 1) {
                samat++;

            }
        }
        //oikealla
        if (x < xKoko - 1) {
            if (taulukko[x+1][y] == 1) {
                samat++;

            }
            
        }
        //ylhäällä
        if (y > 0) {
            if (taulukko[x][y-1] == 1) {
                samat++;

            }
        }
        //alhaallaxxx
        if (y < yKoko - 1) {
            if (taulukko[x][y+1] == 1) {
                samat++;

            }
            
        }
        //ylävasemmalla
        if (x > 0 && y > 0) {
            
            if (taulukko[x-1][y-1] == 1) {
                samat++;

            }
        }
        //yläoikealla
        if (y > 0 && x < xKoko -1 ) {
            if (taulukko[x+1][y-1] == 1) {
                samat++;

            }
        }
        //alavasemmalla
        if (x > 0 && y < yKoko - 1) {
            if (taulukko[x-1][y+1] == 1) {
                samat++;

            }
        }
        //alaoikealla
        if (x < xKoko -1 && y < yKoko -1) {
            if (taulukko[x+1][y+1] == 1) {
                samat++;

            }
        }

//        if (samat < tyytyvaisyysraja) {
//            Piste uusi = new Piste(x, y);
//            tyytymattomat.add(uusi);
         
//        }
//        samat = 0;
//        x++;    
//        }
//        y++;
//        }
    
        
        
        // Etsi täällä tyytymättömät
        return samat;
    }
}
