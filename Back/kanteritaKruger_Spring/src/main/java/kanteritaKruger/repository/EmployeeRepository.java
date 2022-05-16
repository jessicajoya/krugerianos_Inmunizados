package kanteritaKruger.repository;

import org.springframework.data.repository.CrudRepository;

import kanteritaKruger.entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {

}
