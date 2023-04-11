import com.sun.prism.paint.Color;
import javafx.scene.layout.Pane;

public class Main {
    public static void main(String[] args) {
        Pane pane = new Pane();
        Car c1 = new Car(Color.BLUE, 2, 5);
        Car c2 = new Car();

        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}