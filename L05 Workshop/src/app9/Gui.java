package app9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Loops");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane initContent() {
		GridPane pane = new GridPane();
		Canvas canvas = new Canvas(200, 200);
		pane.add(canvas, 0, 0);
		this.drawShapes(canvas.getGraphicsContext2D());
		return pane;
	}

	// ------------------------------------------------------------------------
	// exercise 3
	private void drawShapes(GraphicsContext gc) { // start point: (x1,y1)
		double x = 180;
		int y = 80;
		double x1 = x;
		int y1 = 180;
		int i = 1;
		while (x >= 5) {
			gc.strokeLine(x, y, x1, y1);
			x = x * 0.75;
			x1 = x;
			y += 8;
			y1 -= 8;
			i++;
		}
	}
}
