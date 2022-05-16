package kanteritaKruger.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kanteritaKruger.dto.ResponseDTO;
import kanteritaKruger.entity.EmployeeEntity;
import kanteritaKruger.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public ResponseDTO<EmployeeEntity> showEmployeeById(Integer id){
		ResponseDTO<EmployeeEntity> response = new ResponseDTO<EmployeeEntity>();
		EmployeeEntity employee = new EmployeeEntity();
		try {
			employee = employeeRepository.findById(id).get();
			response.setMessage("Success");
			response.setData(employee);
		} catch (Exception e) {
			System.out.println(e);
			response.setMessage("Failed");
		}
		
		return response;
	}
	
	public ResponseDTO<List<EmployeeEntity>> showEmployees(){
		ResponseDTO<List<EmployeeEntity>> response = new ResponseDTO<>();
		List<EmployeeEntity> employees;
		try {
			employees = (List<EmployeeEntity>) employeeRepository.findAll();
			System.out.println(employees);
			response.setMessage("Success");
			response.setData(employees);
		} catch (Exception e) {
			System.out.println(e);
			response.setMessage("Failed");
		}
		return response;
	}
	
	public ResponseDTO<String> addEmployee(EmployeeEntity employee){
		ResponseDTO<String> response = new ResponseDTO<String>();
		try {
			employeeRepository.save(employee);
			response.setMessage("Success");
		} catch (Exception e) {
			System.out.println(e);
			response.setMessage("Failed");
		}
		return response;
	}
	
	public ResponseDTO<String> deleteEmployee(Integer id){
		ResponseDTO<String> response = new ResponseDTO<String>();
		try {
			employeeRepository.deleteById(id);
			response.setMessage("Success");
		} catch (Exception e) {
			System.out.println(e);
			response.setMessage("Failed");
		}
		return response;
	}
}
