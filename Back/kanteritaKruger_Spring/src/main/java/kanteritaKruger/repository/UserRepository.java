package kanteritaKruger.repository;

import org.springframework.data.repository.CrudRepository;

import kanteritaKruger.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{

}
