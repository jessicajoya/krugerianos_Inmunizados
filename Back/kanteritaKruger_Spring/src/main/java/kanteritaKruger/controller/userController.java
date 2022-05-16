package kanteritaKruger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kanteritaKruger.dto.ResponseDTO;
import kanteritaKruger.entity.UserEntity;
import kanteritaKruger.services.UserService;


@RestController
@CrossOrigin("*")
public class userController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/get")
	public ResponseDTO<UserEntity> showUserById(Integer id){
		ResponseDTO<UserEntity> response = userService.findUser(id);
		return response;
	}
	
	@PostMapping("/user/add")
	public ResponseDTO<UserEntity> addNewUser(@RequestBody UserEntity newUser){
		
		ResponseDTO<UserEntity> response = userService.addUser(newUser);
		return response;
		
	}
}
