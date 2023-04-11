package line;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class ShowLine extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        this.initContent(pane);
        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("ShowLine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void initContent(Pane pane) {
        Line line1 = new Line(10, 10, 190, 190);
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        pane.getChildren().add(line1);

        Line line2 = new Line(10, 190, 190, 10);
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        pane.getChildren().add(line2);
    }
}
