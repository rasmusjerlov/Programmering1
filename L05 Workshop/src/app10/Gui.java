package app10;

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
	private void drawShapes(GraphicsContext gc) { // start point: (x1,y1)
//		this.drawRing(gc, 40, 40);
//		this.drawRing(gc, 120, 80);
		this.drawCircle(gc, 30, 100, 30);
		this.drawCross(gc, 30, 100, 5);
	}
	// exercise 11
	private void drawCross (GraphicsContext gc, int x, int y, int w) {
		int x1 = x - w;
		int x2 = x + w;
		int y1 = y - w;
		int y2 = y + w;
		while (x <= 175) {
			gc.strokeLine(x1, y, x2, y);
			gc.strokeLine(x, y1, x, y2);
			x += 25;
			x1 = x + w;
			x2 = x - w;
		}
	}
	private void drawCircle(GraphicsContext gc, int x, int y, int r) {
		while (x <= 175) {
			gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
			x += 25;
		}
	}
//	private void drawRing(GraphicsContext gc, int x, int y)
//	{
//		int r1 = 25;
//		int r2 = 20;
//		int r3 = 6;
//		gc.strokeOval(x - r1, y - r1, 2 * r1, 2 * r1);
//		gc.strokeOval(x - r2, y - r2, 2 * r2, 2 * r2);
//		gc.fillOval(x - r3, y - r1 - r3 / 2, 2 * r3, r3);
//	}
}
