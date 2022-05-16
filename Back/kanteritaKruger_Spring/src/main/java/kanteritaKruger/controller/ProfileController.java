package kanteritaKruger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kanteritaKruger.dto.ResponseDTO;
import kanteritaKruger.entity.ProfileEntity;
import kanteritaKruger.services.ProfileService;

@RestController
@CrossOrigin("*")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/profile/get")
	public ResponseDTO<ProfileEntity> showProfileById(Integer id) {
		ResponseDTO<ProfileEntity> response = new ResponseDTO<ProfileEntity>();
		response.setMessage("Profile id 1");
		response.setData(profileService.findProfile(id));
		return response;
	};
	
	@PostMapping(value = "/profile/add")
	public ResponseDTO<String> addProfile(
			@RequestBody ProfileEntity newProfile){
		ResponseDTO<String> response = new ResponseDTO<String>();
		//System.out.println(newProfile.toString());
		response.setMessage(profileService.addprofile(newProfile));
		
		return response;
	};
	
	@DeleteMapping(value="/profile/delete")
	public ResponseDTO<String> deleteProfileById(Integer id) {
		ResponseDTO<String> response = new ResponseDTO<String>();
		response.setData(profileService.deleteProfile(id));
		
		return response;
	};
}
