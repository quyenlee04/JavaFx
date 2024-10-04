package mvcUI;

import java.time.format.DateTimeFormatter;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ViewStudentUI {
	public void showDetails(ModelStudent student, TextField textFieldId, TextField textFieldFullName,
			TextField textFieldPhone) {
		textFieldId.setText("" + student.getId());
		textFieldFullName.setText(student.getFullName());
		textFieldPhone.setText(student.getPhoneNumber());
	}

	public void showUpdate(ModelStudent student, TextArea textArea) {
		String detailInfo = "Thông tin sinh viên: \n" + "MSSV: " + student.getId() + "\n Họ và tên: "
				+ student.getFullName() + "\n Số điện thoại: " + student.getPhoneNumber()
				+ "\n" + student.getUpdatedDate().format(DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"));
		textArea.setText(detailInfo);
		textArea.setDisable(true);
		showSuccessedMessage();
	}

	public void showErrorMessage() {
		thongBao("Cập nhập thất bại!");
	}

	public void showSuccessedMessage() {
		thongBao("Đã cập nhập thành công");
	}

	public void thongBao(String tb) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Thông báo");
		alert.setHeaderText(null);
		alert.setContentText(tb);
		alert.showAndWait();
	}
}
