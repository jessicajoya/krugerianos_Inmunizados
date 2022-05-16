package kanteritaKruger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile",schema="kruger")
public class ProfileEntity {
	
	@Id
	@Column(name="profile_id")
	private Integer profileId;
	
	@Column(name="profile_name")
	private String profileName;
	
	public ProfileEntity(Integer profileId, String profileName) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
	}
	
	public ProfileEntity() {
		super();
	}

	public Integer getProfileId() {
		return profileId;
	}
	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	
	@Override
	public String toString() {
		return "ProfileEntity [profileId=" + profileId + ", profileName=" + profileName + "]";
	}

}


/*
@Id
@SequenceGenerator(name="user_sequence",
   sequenceName="kruger.user_id_sequence",
   allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE,
generator="user_sequence")
@Column(name = "")
private Integer clientId; */
