package calc;



import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class GiaoDien {
	private Stage formo;
	
	private TextField textField1;
	private TextField textField2;
	private TextField txtKetQua;
	private Button btnCong;
	private Button btnTru;
	private Button btnChia;
	private Button btnNhan;
	private FlowPane flowPane;
	private XuLi xuLi = new XuLi();
	
	public GiaoDien(Stage formo ) {
		this.formo = formo;
	}
	
	
	
	public void hienThi() {
		textField1 = new TextField();
		textField2 = new TextField();
		txtKetQua = new TextField();
		txtKetQua.setPrefHeight(30);
		txtKetQua.setPrefWidth(100);
		
		btnCong = new Button("+");
		btnTru = new Button("-");
		btnChia = new Button("/");
		btnNhan = new Button("*");
		
		btnCong.setOnAction(e ->{
			try {
				double so1 = Double.parseDouble(textField1.getText());
				double so2 = Double.parseDouble(textField2.getText());
				double kq = xuLi.cong(so1, so2);
				txtKetQua.setText(String.valueOf(kq));
			}
			catch (NumberFormatException ex) {
				txtKetQua.setText("Loi");
			}
		});
		
		btnTru.setOnAction(e ->{
			try {
				double so1 = Double.parseDouble(textField1.getText());
				double so2 = Double.parseDouble(textField2.getText());
				double kq = xuLi.tru(so1, so2);
				txtKetQua.setText(String.valueOf(kq));
			}
			catch (NumberFormatException ex) {
				txtKetQua.setText("Loi");
			}
		});
		
		btnChia.setOnAction(e ->{
			try {
				double so1 = Double.parseDouble(textField1.getText());
				double so2 = Double.parseDouble(textField2.getText());
				double kq = xuLi.chia(so1, so2);
				txtKetQua.setText(String.valueOf(kq));
			}
			catch(NumberFormatException ex){
				txtKetQua.setText("loi");
			}
		});
		
		btnNhan.setOnAction(e ->{
			try {
				double so1 = Double.parseDouble(textField1.getText());
				double so2 = Double.parseDouble(textField2.getText());
				double kq = xuLi.nhan(so1,so2);
				txtKetQua.setText(String.valueOf(kq));
			}
			catch(NumberFormatException ex){
				txtKetQua.setText("loi");
			}
		});
		
		flowPane = new FlowPane();
		flowPane.setHgap(15);
		flowPane.setVgap(15);
		flowPane.setPadding(new Insets(16,16,16,16));
		
		flowPane.getChildren().addAll(textField1,textField2,btnCong,btnTru,btnChia,btnNhan,txtKetQua);
		
		Scene sv = new Scene(flowPane,200,300);
		formo.setTitle("Calc");
		formo.setResizable(false);
		
		formo.setScene(sv);
		formo.show();
		
		
	}
	
	

}
