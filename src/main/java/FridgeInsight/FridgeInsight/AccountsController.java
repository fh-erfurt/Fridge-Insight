package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.AccountRepository;
import FridgeInsight.FridgeInsight.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
public class AccountsController {

    @Autowired
    private AccountRepository accountRepository;
    private PersonRepository personRepository;

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {

        Calendar dateOfCreation = Calendar.getInstance();
        account.setDateOfCreation(dateOfCreation.getTime());
        accountRepository.save(account);
        return "index";
    }

    @RequestMapping("/addAccount")
    public String addAccount() {
        return "addAccount";
    }

}