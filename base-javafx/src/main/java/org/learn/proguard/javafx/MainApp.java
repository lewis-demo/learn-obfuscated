package org.learn.proguard.javafx;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainApp extends Application {
	private String pri_str;
	protected String pro_str;
	public String pub_str;

	private String priMethod(String str) {
		return "pri_" + str;
	}

	protected String proMethod(String str) {
		return "pro_" + str;
	}

	public String pubMethod(String str) {
		return "pub_" + str;
	}

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
