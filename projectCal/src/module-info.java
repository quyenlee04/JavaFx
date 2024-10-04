module projectCal {
	requires javafx.controls;
	
	opens calc to javafx.graphics, javafx.fxml;
}
