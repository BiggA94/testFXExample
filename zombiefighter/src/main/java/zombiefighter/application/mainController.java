package zombiefighter.application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class mainController {

	@FXML
	Button button;
	@FXML
	Label label;
	@FXML
	TextField textField;

	@FXML
	private void initiaize() {

	}

	@FXML
	public void button_action(ActionEvent event) {
		textField.setText("Button clicked");
	}

}
