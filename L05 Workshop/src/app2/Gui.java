package app2;

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
	// exercise 1
	private void drawShapes(GraphicsContext gc) {
		// draw an arrowhead at (50,30)
		// a
		int factor = 2;
		int x = 100;
		int y = 75;
//		int xSize = 10 * factor;
//		int ySize = 4 * factor;
//		gc.strokeLine(x, y, x + xSize, y - ySize);
//		gc.strokeLine(x, y, x + xSize, y + ySize);
		// draw an arrowhead at (25,140)
		// b
//		x = 100;
//		y = 125;
//		gc.strokeLine(x, y, x + xSize, y - ySize);
//		gc.strokeLine(x, y, x + xSize, y + ySize);
		// draw an arrowhead at (20, 50)
		// c
//		x = 20;
//		y = 50;
//		gc.strokeLine(x, y, x + xSize, y - ySize);
//		gc.strokeLine(x, y, x + xSize, y + ySize);
		// d
//		int x1 = 100; // start point: (x1,y1)
//		int y1 = 100;
//		int x2 = 20; // end point: (x2,y2)
//		int y2 = 10;
//		while (x2 <= 180) {
//			gc.strokeLine(x1, y1, x2, y2);
//			x2 = x2 + 20;
//		}
		// horizontal
		int x1 = 20; // start point: (x1,y1)
		int y1 = 20;
		int x2 = 180; // end point: (x2,y2)
		int y2 = 150;
		while (y1 <= 200) {
			gc.strokeLine(x1, y1, x2, y1);
			y1 = y1 + 40;
		}
	}
}
