package FridgeInsight.FridgeInsight.Controllers;

import FridgeInsight.FridgeInsight.Classes.Account;
import FridgeInsight.FridgeInsight.Classes.Food;
import FridgeInsight.FridgeInsight.Classes.PurchaseList;
import FridgeInsight.FridgeInsight.Classes.SuperMarket;
import FridgeInsight.FridgeInsight.Repository.AccountRepository;
import FridgeInsight.FridgeInsight.Repository.FoodRepository;
import FridgeInsight.FridgeInsight.Repository.PurchaseListRepository;
import FridgeInsight.FridgeInsight.Repository.SuperMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.AutoPopulatingList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;
import java.util.List;

@Controller
public class PurchaseListController {
    @Autowired
    private PurchaseListRepository purchaseListRepository;

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private AccountRepository accountRepository;




    @RequestMapping("/savePurchaseList")
    public String savePurchaseList(PurchaseList purchaseList) {

        purchaseListRepository.save(purchaseList);
        return "redirect:/showPurchaseList";
    }

    @RequestMapping("/addPurchaseList")
    public String addPurchaseList(Model model) {

        PurchaseList purchaseList = new PurchaseList();
        purchaseList.setListFoods(new AutoPopulatingList<Food>(Food.class));

        List<Account> Accounts = accountRepository.findAll();
        model.addAttribute("Accounts",Accounts);

        List<Food> Foods = foodRepository.findAll();
        model.addAttribute("Foods",Foods);

        model.addAttribute("purchaseList", new PurchaseList());
        return "addPurchaseList";
    }

    @GetMapping("/showPurchaseLists")
    public String showPurchaseLists(Model theModel) {

        List<PurchaseList> purchaseLists = purchaseListRepository.findAll();
        theModel.addAttribute("purchaseLists", purchaseLists);

        return "PurchaseLists";
    }

    @GetMapping("/deletePurchaseList")
    public String deletePurchaseList(@RequestParam("PURCHASEID") Long Id) {
        purchaseListRepository.deleteById(Id);
        return "redirect:/showPurchaseLists";
    }

    @GetMapping("/updatePurchaseList")
    public String updatePurchaseList(@RequestParam("PURCHASEID") Long Id, Model theModel) {

        PurchaseList purchaseList = purchaseListRepository.findById(Id).orElse(new PurchaseList());
        theModel.addAttribute("purchaseList", purchaseList);
        return "addPurchaseList";
    }

}
