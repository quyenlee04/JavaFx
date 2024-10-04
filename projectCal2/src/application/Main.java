package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage sanKhau) {
		try {
			Parent giaoDien = FXMLLoader.load(getClass().getResource("cal2.fxml"));
			//trinh dien
			Scene canhVat = new Scene(giaoDien);
			sanKhau.setTitle("Caculate");
			sanKhau.setScene(canhVat);
			sanKhau.show();
			sanKhau.setResizable(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}