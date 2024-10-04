package application;

import java.time.LocalDateTime;

public class Student {
    private String studentID;
    private String fullName;
    private String phoneNumber;
    private LocalDateTime updateTime;

    public Student(String studentID, String fullName, String phoneNumber) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.updateTime = LocalDateTime.now();
    }

    // Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
        setUpdateTime();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        setUpdateTime();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        setUpdateTime();
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    private void setUpdateTime() {
        this.updateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}

