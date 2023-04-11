package polygon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class ShowPolygon extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        this.initContent(pane);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("ShowPolygon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void initContent(Pane pane) {
        double centerX = 400 / 2;
        double centerY = 400 / 2;
        double radius = 400 * 0.4;

        double[] points = new double[12];
        for (int i = 0; i < 6; i++) {
            points[i * 2] = centerX + radius * Math.cos(i * 2 * Math.PI / 6); // x value
            points[i * 2 + 1] = centerY - radius * Math.sin(i * 2 * Math.PI / 6); // y value
        }

        Polygon polygon = new Polygon(points);
        // Polyline polygon = new Polyline(points);
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        pane.getChildren().add(polygon);
    }
}
