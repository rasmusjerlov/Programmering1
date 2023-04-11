package app5;

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
	// exercise 5
	private void drawShapes(GraphicsContext gc) {
		String s = "Datamatiker";
		int i = 1;
		int x = 20;
		int y = 20;

		while (i <= s.length()) {
			gc.fillText(s.substring(0, i), x, y);
			i++;
			y += 15;
		}


		}
	}
