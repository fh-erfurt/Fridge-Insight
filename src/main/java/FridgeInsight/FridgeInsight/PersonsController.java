package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonsController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/addPerson")
    public String addPerson(Person person) {

        personRepository.save(person);
        return "index";
    }

    @RequestMapping("/formPerson")
    public String formPerson() {
        return "formPerson";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
