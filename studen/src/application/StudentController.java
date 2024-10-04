package application;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudentID(String studentID) {
		model.setStudentID(studentID);
	}
	  public String getStudentID() {
	        return model.getStudentID();
	    }

	    public void setFullName(String fullName) {
	        model.setFullName(fullName);
	    }

	    public String getFullName() {
	        return model.getFullName();
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        model.setPhoneNumber(phoneNumber);
	    }

	    public String getPhoneNumber() {
	        return model.getPhoneNumber();
	    }

	    public void updateView() {
	        view.displayStudentDetails(model);
	    }
}
