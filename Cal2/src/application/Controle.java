package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class Controle implements Initializable {
	@FXML
	private TextField textFieldGio;
	private Model model;
	private View view;
	
	@Override
	public void initialize (URL url, ResourceBundle res) {
		model = new Model("");
		view = new View();
	}
	
	
	public void hienThiGio(ActionEvent event) {
		model.gioHienTai();
		String StringGio =  model.getGio();
		view.Hienthi(StringGio, textFieldGio);
	}
	

}
