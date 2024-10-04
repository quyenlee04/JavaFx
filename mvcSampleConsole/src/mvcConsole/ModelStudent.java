package mvcConsole;

import java.time.LocalDateTime;

public class ModelStudent {
	private Integer id;
	private String fullName;
	private String phoneNumber;
	private LocalDateTime updatedDate;

	// khởi dựng(constractor)

	public ModelStudent(Integer id, String fullName, String phoneNumber, LocalDateTime updatedDate) {

		this.id = id;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.updatedDate = updatedDate;
	}

	// triển khai phương thức
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
/**
 * câp nhật thông tin sinh viên
 * @param id mssv
 * @param fullName họ tên sv
 * @param phoneNumber sdt
 */
	public void update(Integer id, String fullName, String phoneNumber) {
		setId(id);
		setFullName(fullName);
		setPhoneNumber(phoneNumber);
	}

	public boolean save() {
		if (phoneNumber.length() < 11) {
			this.updatedDate = LocalDateTime.now();
			return true;
		}
		return false;
	}
}