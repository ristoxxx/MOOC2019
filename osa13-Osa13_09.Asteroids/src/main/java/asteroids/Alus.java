package asteroids;

/**
 *
 * @author Evermore
 */
import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;

public class Alus extends Hahmo{

    public Alus(int x, int y) {
        super(new Polygon(-5, -5, 10, 0, -5, 5), x, y);
    }
}
    