package kanteritaKruger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kanteritaKruger.dto.ResponseDTO;
import kanteritaKruger.entity.EmployeeEntity;
import kanteritaKruger.services.EmployeeService;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee/add")
	public ResponseDTO addEmployee(@RequestBody EmployeeEntity employee) {
		ResponseDTO response = new ResponseDTO<>();
		response = employeeService.addEmployee(employee);
		return response;
	}
	
	@GetMapping("/employee/all")
	public ResponseDTO<List<EmployeeEntity>> showAllEmployees (){
		ResponseDTO<List<EmployeeEntity>> response = employeeService.showEmployees();
		return response;
	}

}
