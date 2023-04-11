package opgave4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class showCar extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        this.initContent(pane);
        Scene scene = new Scene(pane, 400, 400);

        primaryStage.setTitle("ShowRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void initContent(Pane pane) {

        int x = 150;
        int y = 225;
        int r = 30;
        int wheelAmount = 2;

        for (int i = 0; i < wheelAmount; i++) {
            Circle circle = new Circle(x, y, r);
            x += 100;
            pane.getChildren().add(circle);
            circle.setFill(Color.CORNFLOWERBLUE);
            circle.setStroke(Color.BLACK);
        }
        Rectangle body = new Rectangle();
        pane.getChildren().add(body);
        body.setStroke(Color.BLACK);
        body.setFill(Color.WHITE);

        Line door = new Line(150, 150, 150, 200);
        pane.getChildren().add(door);
        door.setStroke(Color.BLACK);
    }
}
