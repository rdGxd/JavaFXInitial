package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import org.example.javafx.util.Alerts;

public class ViewController {

  @FXML
  private Button btTest;

  @FXML
  public void onBtTestAction(ActionEvent event) {
    Alerts.showAlert("Alert title", null, "Hello", Alert.AlertType.ERROR);
  }
}
