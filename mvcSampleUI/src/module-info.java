module mvcSampleUI {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens mvcUI to javafx.graphics, javafx.fxml;
}
