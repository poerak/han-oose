package nl.han.schoose.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/person")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/api/student")
    public Person studentSomeThing(){
        return new Person(1L, "william", "van", "Schooneveld");
    }


    @GetMapping
    public List<Person> getPersons(){
        return personRepository.findAll();
    }
}
