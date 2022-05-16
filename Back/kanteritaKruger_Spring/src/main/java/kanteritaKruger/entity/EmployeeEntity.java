package kanteritaKruger.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employee", schema="kruger")
public class EmployeeEntity {

	@Id
	@Column(name="employee_id")
	private Integer employeeId;
	
	@Column(name="employee_dni")
	private Integer employeeDni;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="employee_lastname")
	private String employeeLastName;
	
	@Column(name="employee_email")
	private String employeeEmail;
	
	@Column(name="employee_birthday")
	private Date employeeBirthday;

	@Column(name="employee_address")
	private String employeeAddress;
	
	@Column(name="employee_cellphone")
	private String employeeCellphone;
	
	@Column(name="employee_vaccine_state")
	private Boolean employeeVaccineState;
	
	@Column(name="employee_vaccine_type")
	private String employeeVaccineType;
	
	@Column(name="employee_vaccine_date")
	private Date employeeVaccineDate;
	
	@Column(name="employee_vaccine_dosis")
	private String employeeVaccineDosis;
	
	@Column(name="user_id")
	private Integer userId;

	public EmployeeEntity(Integer employeeId, Integer employeeDni, String employeeName, String employeeLastName,
			String employeeEmail, Date employeeBirthday, String employeeAddress, String employeeCellphone,
			Boolean employeeVaccineState, String employeeVaccineType, Date employeeVaccineDate,
			String employeeVaccineDosis, Integer userId) {
		super();
		this.employeeId = employeeId;
		this.employeeDni = employeeDni;
		this.employeeName = employeeName;
		this.employeeLastName = employeeLastName;
		this.employeeEmail = employeeEmail;
		this.employeeBirthday = employeeBirthday;
		this.employeeAddress = employeeAddress;
		this.employeeCellphone = employeeCellphone;
		this.employeeVaccineState = employeeVaccineState;
		this.employeeVaccineType = employeeVaccineType;
		this.employeeVaccineDate = employeeVaccineDate;
		this.employeeVaccineDosis = employeeVaccineDosis;
		this.userId = userId;
	}

	public EmployeeEntity() {
	
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getEmployeeDni() {
		return employeeDni;
	}

	public void setEmployeeDni(Integer employeeDni) {
		this.employeeDni = employeeDni;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Date getEmployeeBirthday() {
		return employeeBirthday;
	}

	public void setEmployeeBirthday(Date employeeBirthday) {
		this.employeeBirthday = employeeBirthday;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeCellphone() {
		return employeeCellphone;
	}

	public void setEmployeeCellphone(String employeeCellphone) {
		this.employeeCellphone = employeeCellphone;
	}

	public Boolean getEmployeeVaccineState() {
		return employeeVaccineState;
	}

	public void setEmployeeVaccineState(Boolean employeeVaccineState) {
		this.employeeVaccineState = employeeVaccineState;
	}

	public String getEmployeeVaccineType() {
		return employeeVaccineType;
	}

	public void setEmployeeVaccineType(String employeeVaccineType) {
		this.employeeVaccineType = employeeVaccineType;
	}

	public Date getEmployeeVaccineDate() {
		return employeeVaccineDate;
	}

	public void setEmployeeVaccineDate(Date employeeVaccineDate) {
		this.employeeVaccineDate = employeeVaccineDate;
	}

	public String getEmployeeVaccineDosis() {
		return employeeVaccineDosis;
	}

	public void setEmployeeVaccineDosis(String employeeVaccineDosis) {
		this.employeeVaccineDosis = employeeVaccineDosis;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", employeeDni=" + employeeDni + ", employeeName="
				+ employeeName + ", employeeLastName=" + employeeLastName + ", employeeEmail=" + employeeEmail
				+ ", employeeBirthday=" + employeeBirthday + ", employeeAddress=" + employeeAddress
				+ ", employeeCellphone=" + employeeCellphone + ", employeeVaccineState=" + employeeVaccineState
				+ ", employeeVaccineType=" + employeeVaccineType + ", employeeVaccineDate=" + employeeVaccineDate
				+ ", employeeVaccineDosis=" + employeeVaccineDosis + ", userId=" + userId + "]";
	}
	
	
	
	
}
