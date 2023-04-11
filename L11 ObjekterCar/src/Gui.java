import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Car car = new Car();
        this.drawCar(pane, car);
        Scene scene = new Scene(pane, 400, 400);

        stage.setTitle("Draw Car");
        stage.setScene(scene);
        stage.show();
    }

    private void drawCar(Pane pane, Car car) {

    }

}
