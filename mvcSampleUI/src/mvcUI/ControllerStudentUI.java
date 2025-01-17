package mvcUI;

import java.net.URL;

import java.time.LocalDateTime;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class ControllerStudentUI implements Initializable {
	@FXML
	private TextField textFieldId;
	@FXML
	private TextField textFieldFullName;
	@FXML
	private TextField textFieldPhoneNumber;
	@FXML
	private TextArea textArea;

	private ModelStudent student;
	private ViewStudentUI view;
	
@Override
	public void initialize(URL url, ResourceBundle res) {
		student = new ModelStudent(123, "Trần Thị Rô", "566627722", LocalDateTime.now());
		view = new ViewStudentUI();
		view.showDetails(student, textFieldId, textFieldFullName, textFieldPhoneNumber);
	}
	
	public void actionButton(ActionEvent event) {
		student.update(textFieldId, textFieldFullName, textFieldPhoneNumber);
		save();
	}
	public void save() {
		boolean isSuccess = student.save();
		if(isSuccess) {
			view.showUpdate(student, textArea);
			
		}
		else {
			view.showErrorMessage();
		}
	}

}
