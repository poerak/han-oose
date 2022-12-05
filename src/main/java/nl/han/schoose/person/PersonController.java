package nl.han.schoose.person;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/person")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

//    @GetMapping("/api/student")
//    public Person studentSomeThing(){
//        return new Person(1L, "william", "van", "Schooneveld");
//    }


    @GetMapping
    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    record newPersonRequest(
            String first_name,
            String middle_name,
            String last_name){
    }

    @PostMapping
    public void addPerson(@RequestBody newPersonRequest request){
        Person person = new Person();
        person.setFirst_name(request.first_name());
        person.setMiddle_name(request.middle_name());
        person.setLast_name(request.last_name());
        System.out.println("test");
        personRepository.save(person);
    }
}
