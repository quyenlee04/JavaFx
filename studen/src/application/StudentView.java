package application;

public class StudentView {
    public void displayStudentDetails(Student student) {
        System.out.println("Thông tin sinh viên:");
        System.out.println("MSSV: " + student.getStudentID());
        System.out.println("Họ Và Tên: " + student.getFullName());
        System.out.println("Điện Thoại: " + student.getPhoneNumber());
        System.out.println("Được cập nhât lúc: " + student.getUpdateTime());
    }
}

