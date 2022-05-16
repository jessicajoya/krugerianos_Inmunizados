package kanteritaKruger.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kanteritaKruger.entity.ProfileEntity;
import kanteritaKruger.repository.ProfileRepository;

@Service
public class ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;
	
	public ProfileEntity findProfile(Integer id) {
		ProfileEntity profile;
		try {
			profile = profileRepository.findById(id).get();
		} catch (Exception e) {
			profile = null;
		}
		
		return profile;
	};
	
	public String addprofile(ProfileEntity newProfile) {
		
		try {
			profileRepository.save(newProfile);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return "failed";
		}
	};
	
	public String deleteProfile(Integer id) {
		
		try {
			profileRepository.deleteById(id);
			return "Success";
		} catch (Exception e) {
			// TODO: handle exception
			return "failed";
		}
		
	}
}
