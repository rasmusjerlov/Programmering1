package app8;

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
		int y = 160;
		int x1 = 16;
		int y1 = 80;
		for (int x = 16; x <= 200; x+= 16) {
			gc.strokeLine(x, y, x1, y1);
			y -= 8;
			y1 -= 4;
			x1 += 16;
		}
	}
}
