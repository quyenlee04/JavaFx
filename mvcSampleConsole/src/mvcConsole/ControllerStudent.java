package mvcConsole;

import java.time.LocalDateTime;

public class ControllerStudent {
	private ModelStudent student;
	private ViewStudent view;

	public ControllerStudent() {
		student = new ModelStudent(123, "Trần Thị Rô", "566627722", LocalDateTime.now());
		view = new ViewStudent();
		view.showDetail(student);
	}

	public void update(Integer id, String fullName, String phoneNumber) {
		student.update(id, fullName, phoneNumber);
	}

	public void save() {
		boolean isSuccess = student.save();
		if (isSuccess) {
			view.showSucceedUpdate(student);
		} else {
			view.showErrorMessage();
		}
	}
}
