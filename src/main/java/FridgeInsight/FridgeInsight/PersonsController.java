package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonsController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/Persons")
    public List<Person> ShowPersons() {
        return personRepository.findAll();

    }

}
