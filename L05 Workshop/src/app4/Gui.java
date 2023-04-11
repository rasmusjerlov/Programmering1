package app4;

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
	// exercise 4
	private void drawShapes(GraphicsContext gc) {

		// 4.1

//		int x = 100; // center: (x,y) int y = 100;
//		int y = 100;
//		int r = 20; // radius: r while (x <= 150) {
//		while (r <= 100) {
//			gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
//			r += 20;
//		}

		// 4.2
//		int x = 20; // center: (x,y)
//		int y = 100;
//		int r = 10; // radius: r
//		while (r <= 80) {
//			gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
//			x = r + 20;
//			r = r + 10;
//		}

		// 4.3

		int x = 90; // center: (x,y)
		int y = 50;
		int l = 30;
		int h = 60;
		while (l <= 150) {
			gc.strokeOval(x, y, l, h);
			l = l + 30;
			x = x - 15;

		}
	}

}