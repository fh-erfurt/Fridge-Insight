package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Calendar;

@Controller
public class AccountsController {

    @Autowired
    private AccountRepository accountRepository;

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


    /*@RequestMapping("/deleteAccount")
    public String deleteAccount(Account account) {

        accountRepository.findById();

        accountRepository.delete(account);
        return "index";
    }*/



}