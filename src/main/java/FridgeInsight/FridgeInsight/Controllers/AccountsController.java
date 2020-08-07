package FridgeInsight.FridgeInsight.Controllers;

import FridgeInsight.FridgeInsight.Classes.Account;
import FridgeInsight.FridgeInsight.Classes.Food;
import FridgeInsight.FridgeInsight.Classes.PurchaseList;
import FridgeInsight.FridgeInsight.Classes.SuperMarket;
import FridgeInsight.FridgeInsight.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.AutoPopulatingList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Calendar;
import java.util.List;

@Controller
public class AccountsController {

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {

        Calendar dateOfCreation = Calendar.getInstance();
        account.setDateOfCreation(dateOfCreation.getTime());

        accountRepository.save(account);
        return "redirect:/showAccounts";
    }

    @GetMapping("/addAccount")
    public String addAccount(Model model) {
        Account account = new Account();
        account.setPurchaseLists(new AutoPopulatingList<PurchaseList>(PurchaseList.class));

        model.addAttribute("account",new Account());
        return "addAccount";
    }

    @GetMapping("/showAccounts")
    public String showAccounts(Model theModel) {

        List<Account> accounts = accountRepository.findAll();
        theModel.addAttribute("Accounts",accounts);

        return "Accounts";
    }

    @GetMapping("/deleteAccount")
    public String deleteCustomer(@RequestParam("ACCID") Long Id)  {
        accountRepository.deleteById(Id);
        return "redirect:/showAccounts";
    }

    @GetMapping("/updateAccount")
    public String showAccountUpdate(@RequestParam("ACCID") Long Id, Model theModel) {
        Account account = accountRepository.findById(Id).orElse(new Account());
        theModel.addAttribute("account", account);
        return "addAccount";
    }



}