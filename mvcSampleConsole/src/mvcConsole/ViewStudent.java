package mvcConsole;

import java.time.format.DateTimeFormatter;

public class ViewStudent {
	public void showDetail(ModelStudent student) {
		System.out.println("Thông tin sinh viên: ");
		System.out.println("Mã số sinh viên: \n" + student.getId());
		System.out.println("Họ và tên: \n"+ student.getFullName());
		System.out.println("Điện thoại: \n"+ student.getPhoneNumber());
		System.out.println("Được cập nhất lúc: " + student.getUpdatedDate().format(DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy")));
		System.out.println();
		
	}
	public void showSucceedUpdate(ModelStudent student) {
		System.out.println("Đã cập nhật thành công đối với sinh viên sau: ");
		showDetail(student);
	}
	public void showErrorMessage() {
		System.out.println("Cập nhật thất bại");
	}
	
}
