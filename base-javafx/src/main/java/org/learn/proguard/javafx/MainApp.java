package org.learn.proguard.javafx;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class MainApp extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = new Pane();

		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);

		primaryStage.centerOnScreen();
		primaryStage.setTitle("Hello JavaFX");
		primaryStage.show();
	}
}
