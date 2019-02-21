package main;
import org.springframework.data.repository.CrudRepository;

public interface ManagerRepository extends CrudRepository<ManagerEntity, Integer>{

    ManagerEntity findFirstByFirstName(String firstName);

}
