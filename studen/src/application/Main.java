package application;
	
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Student student = new Student("12345", "Nguyen Van A", "0123456789");

      
        StudentView view = new StudentView();

       
        StudentController controller = new StudentController(student, view);

        
        controller.updateView();


        System.out.println("\nEnter new student details:");

        System.out.print("MSSV: ");
        controller.setStudentID(scanner.nextLine());

        System.out.print("Họ Và Tên: ");
        controller.setFullName(scanner.nextLine());

        System.out.print("Điện Thoại: ");
        controller.setPhoneNumber(scanner.nextLine());

        
        System.out.println("\nCập nhật thành công đối với sinh viên sau:");
        controller.updateView();
    }
}

