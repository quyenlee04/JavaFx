package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalControler implements Initializable{
	@FXML
	private TextField txtSo1;
	@FXML
	private TextField txtSo2;
	@FXML
	private TextField txtKq;
	@FXML
	private Button btnCong;
	@FXML
	private Button btnTru;
	
	
	private CalView calView;
	private CalModle modle;
	
	@Override
	public void initialize(URL url, ResourceBundle rs) {
		calView = new CalView();
		modle = new CalModle();
		
	}
	
	
	
	
	

}
