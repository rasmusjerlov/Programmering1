package opgave1;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {
        private void initContent(Pane pane) {
            // Circle center at (70,70) and radius 30
            Circle circle = new Circle(70, 70, 30);
            pane.getChildren().add(circle);
            circle.setFill(Color.BLACK);
            circle.setStroke(Color.YELLOW);

            // Line from (70,70) to (100,70)
            Line line = new Line(100, 100, 100, 70);
            pane.getChildren().add(line);

            // Rectangle with upper left corner at (100,40), width 75, height 25
            Rectangle rektangel = new Rectangle(100, 40, 75, 25);
            pane.getChildren().add(rektangel);
            rektangel.setFill(Color.HOTPINK);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        this.initContent(pane);
        Scene scene = new Scene(pane, 250, 150);

        primaryStage.setTitle("Show shapes til opgave1: ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
