package org.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.javafx.util.Alerts;

import java.util.Locale;

public class ViewController {
  @FXML
  private TextField txtNumber1;
  @FXML
  private TextField txtNumber2;
  @FXML
  private Label labelResult;
  @FXML
  private Button btSum;

  @FXML
  public void onBtSumAction(ActionEvent event) {
    try {
      Locale.setDefault(Locale.US);
      double number1 = Double.parseDouble(txtNumber1.getText());
      double number2 = Double.parseDouble(txtNumber2.getText());
      double sum = number1 + number2;
      labelResult.setText(String.format("%.2f", sum));
    } catch (NumberFormatException e) {
      Alerts.showAlert("Error", "Parse error", e.getMessage(), Alert.AlertType.ERROR);
    }

  }
}
