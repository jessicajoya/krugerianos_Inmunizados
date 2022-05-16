package kanteritaKruger.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kanteritaKruger.dto.ResponseDTO;
import kanteritaKruger.entity.UserEntity;
import kanteritaKruger.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public ResponseDTO<UserEntity> findUser(Integer id) {
		UserEntity user;
		ResponseDTO response;
		response = new ResponseDTO();
		try {
			user = userRepository.findById(id).get();
			response.setData(user);
			response.setMessage("Success");
		} catch (Exception e) {
			// TODO: handle exception
			user= null;
			response.setData(user);
			response.setMessage("Failed");
		}
		
		return response;
	};
	
	
	public ResponseDTO addUser(UserEntity user) {
		ResponseDTO response;
		response= new ResponseDTO();
		
		try {
			userRepository.save(user);
			response.setMessage("Success");
		} catch (Exception e) {
			response.setMessage("Failed");
		}
		
		return response;
		
	}
	
	
}
