package mvcConsole;

public class Main {
	public static void main(String[] args) {
		ControllerStudent student = new ControllerStudent();
		student.update(345, "Lê Văn Quyến", "0364048055");
		student.save();
	}

}
