package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.SuperMarketRepository;
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
public class SuperMarketController {



    @Autowired
    private SuperMarketRepository superMarketRepository;


    @RequestMapping("/saveSuperMarket")
    public String saveSuperMarket(SuperMarket superMarket) {

        superMarketRepository.save(superMarket);
        return "redirect:/showSuperMarkets";
    }

    @RequestMapping("/addSuperMarket")
    public String addSuperMarket(Model model) {

        SuperMarket superMarket = new SuperMarket();
        superMarket.setFoodList(new AutoPopulatingList<Food>(Food.class));
        model.addAttribute("supermarket", new SuperMarket());
        return "addSuperMarket";
    }

    @GetMapping("/showSuperMarkets")
    public String showSuperMarkets(Model theModel) {

        List<SuperMarket> superMarkets = superMarketRepository.findAll();
        theModel.addAttribute("SuperMarkets",superMarkets);

        return "SuperMarkets";
    }
    @GetMapping("/deleteSuperMarket")
    public String deleteSuperMarket(@RequestParam("marketID") Long Id)  {
        superMarketRepository.deleteById(Id);
        return "redirect:/showSuperMarkets";
    }

    @GetMapping("/updateSuperMarket")
    public String showSuperMarketUpdate(@RequestParam("marketID") Long Id, Model theModel) {
        SuperMarket superMarket = superMarketRepository.findById(Id).orElse(new SuperMarket());
        theModel.addAttribute("supermarket", superMarket);
        return "addSuperMarket";
    }
}