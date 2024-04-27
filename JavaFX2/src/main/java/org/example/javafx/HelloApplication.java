package org.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
     Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gui/View.fxml")));
      Scene scene = new Scene(parent);
      stage.setScene(scene);
      stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}