package org.learn.javafx.single;

import org.apache.log4j.Logger;
import org.learn.javafx.single.security.service.ILoginService;
import org.learn.javafx.single.security.service.impl.LoginServiceImpl;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
	public static final Logger logger = Logger.getLogger(MainApp.class);
	public static final ILoginService loginSrv = new LoginServiceImpl();

	public static void main(String[] args) throws Exception {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = createContent();
		Scene scene = new Scene(root, 400, 300);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Single Demo for JavaFX");
		primaryStage.show();
	}

	private Parent createContent() {
		TextField tf = new TextField();
		tf.setPromptText("姓名");

		TextArea ta = new TextArea();
		ta.setEditable(false);
		
		tf.setOnAction(event -> {
			ta.setText(tf.getText());
			tf.clear();
		});

		VBox vbox = new VBox();
		vbox.setSpacing(5.0d);
		vbox.setPadding(new Insets(5.0d));
		vbox.getChildren().addAll(tf, ta);

		return vbox;
	}

}
