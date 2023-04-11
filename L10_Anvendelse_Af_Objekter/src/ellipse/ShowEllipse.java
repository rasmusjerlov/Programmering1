package ellipse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

public class ShowEllipse extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        this.initContent(pane);
        Scene scene = new Scene(pane, 300, 300);

        primaryStage.setTitle("ShowEllipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void initContent(Pane pane) {
        for (int i = 0; i < 16; i++) {
            Ellipse e1 = new Ellipse(300 / 2, 300 / 2, 300 / 2 - 50, 200 / 2 - 50);
            e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            e1.setFill(Color.WHITE);
            // e1.setFill(null);
            e1.setRotate(i * 180 / 16);
            pane.getChildren().add(e1);
        }
    }
}