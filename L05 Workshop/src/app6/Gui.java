package app6;

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
	// exercise 6
	private void drawShapes(GraphicsContext gc) {
		int x = 5;
		int y = 180;
		int x1 = 180;
		int y1 = 180;
		gc.strokeLine(x, y, x1, y1);
		gc.strokeLine(x1, y1, x1 - 5, y1 - 5);
		gc.strokeLine(x1, y1, x1 - 5, y1 + 5);
		for (int i = 1; i < 180; i = i + 15) {
			y = 175;
			y1 = 185;
			x1 = x;
			gc.strokeLine(x, y, x1, y1);
			x += 15;
		}

		}


	}
