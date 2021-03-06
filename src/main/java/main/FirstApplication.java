package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FirstApplication implements CommandLineRunner {


    @Autowired
    PersonRepository personRepository;
    ManagerRepository managerRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("Daryl");
        personRepository.save(person);

        Person personFromDb = personRepository.findFirstByName("Daryl");
        System.out.println(personFromDb);

        ManagerEntity manager = new ManagerEntity();
        manager.setFirstName("Jimmy");
        manager.setLastName("Paul");
        manager.setDepartment("Accounting");
        managerRepository.save(manager);

        ManagerEntity managerFromDb = managerRepository.findFirstByFirstName("Jimmy");
        System.out.println(managerFromDb);

    }
}
