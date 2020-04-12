import java.util.Scanner;

public class Molkky {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		Tulostaulu pelaajat = new Tulostaulu();

		System.out.println("**********");
		System.out.println("* Mölkky *");
		System.out.println("**********");
		System.out.println("");
		System.out.println("Kuinka monta pelaajaa? ");

		int p = Integer.valueOf(lukija.nextLine());

		for (int i = 0; i < p; i++) {
			System.out.println("Anna pelaajan nimi: ");
			String nimi = lukija.nextLine();
			Pelaaja pelaaja = new Pelaaja(nimi);
			pelaajat.lisaaPelaaja(pelaaja);
		}

		while (true) {
			for (int i = 0; i < p; i++) {
				pelaajat.getPelaajat().get(i).pelaa();
			}
			for (int i = 0; i < p; i++) {
				System.out.println(pelaajat.getPelaajat().get(i));
				if (pelaajat.getPelaajat().get(i).getKokonaispisteet() > 50) {
					System.out.println(
							"Yli 50 meni pelaajalla " + pelaajat.getPelaajat().get(i).getNimi() + " joten -> 25");
					pelaajat.getPelaajat().get(i).setKokonaispisteet(25);
				}
			}
			if (pelaajat.getPelaajat().get(0).getKokonaispisteet() == 50) {
				break;
			}
			System.out.println("Seuraava kierros ");
		}
		System.out.println("Peli päättyi");
	}
}