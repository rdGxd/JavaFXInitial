package org.example.javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Callback;
import org.example.javafx.model.entities.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ViewController implements Initializable {
	@FXML
	private ComboBox<Person> comboBoxPerson;

	@FXML
	private Button btAll;

	@FXML
	public void onBtAllAction(ActionEvent event) {
		for (Person person : comboBoxPerson.getItems()) {
			System.out.println(person);
		}
	}

	@FXML
	public void onComboBoxPerson(ActionEvent actionEvent) {
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Maria", "maria@gmail.com"));
		list.add(new Person(2, "John", "john@gmail.com"));
		list.add(new Person(3, "Jane", "jane@gmail.com"));

		ObservableList<Person> obsList = FXCollections.observableArrayList(list);
		comboBoxPerson.setItems(obsList);

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};

		comboBoxPerson.setCellFactory(factory);
		comboBoxPerson.setButtonCell(factory.call(null));
	}
}
