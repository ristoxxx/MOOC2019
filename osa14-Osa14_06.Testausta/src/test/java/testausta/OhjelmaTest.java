package testausta;

import fi.helsinki.cs.tmc.edutestutils.MockStdio;
import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

@Points("14-06")
public class OhjelmaTest {
    @Test
    public void lisaysKasvattaaKokoaYhdella() {
        Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n"));
        String tulostus = io.getSysOut();
        String viesti = "Kun syöte oli xxx niin tuolstus oli: " + tulostus + "";
        assertTrue(viesti, tulostus.contains("pulloja: 6xxx"));
    }
//    Ohjelma s = new Ohjelma();
//    s.suorita(new Scanner("3\n2\n1\n-1\n"));
//    assertEquals("Pulloja 6\nOppilaita 3\nKeskiarvo 2.0");
//}

    // toteuta tänne testit luokkaa Ohjelma-varten
}
