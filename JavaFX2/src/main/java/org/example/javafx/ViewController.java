package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

  @FXML
  private Button btTest;

  @FXML
  public void onBtTestAction(ActionEvent event) {
    System.out.println("Click");
  }
}
