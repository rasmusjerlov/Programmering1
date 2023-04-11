/*
package opgave2;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    private int x1 = 100;
    private int y1 = 100;

    private Color farve = Color.YELLOW;
        private void initContent(Pane pane) {
            // Circle center at (70,70) and radius 30
            Circle circle = new Circle(50 + x1, 50 + y1, 30);
            pane.getChildren().add(circle);
            circle.setFill(farve);
            circle.setStroke(farve);

            // Line from (70,70) to (100,70)
            Line line = new Line(100 + x1, 100 + y1, 100 , 70);
            line.setFill(farve);
            line.setStroke(farve);
            pane.getChildren().add(line);


            // Rectangle with upper left corner at (100,40), width 75, height 25
            Rectangle rektangel = new Rectangle(100 + x1, 40 + y1, 75, 25);
            pane.getChildren().add(rektangel);
            rektangel.setFill(farve);
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
*/
