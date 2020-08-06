package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.SuperMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Calendar;
import java.util.List;

@Controller
public class SuperMarketController {



    @Autowired
    private SuperMarketRepository superMarketRepository;

    @RequestMapping("/addFood")
    public String addFood(@RequestParam("marketID") Long Id){

        FoodController foodController = new FoodController(superMarketRepository.findById(Id));

        return "addFood";
    }

    @RequestMapping("/saveSuperMarket")
    public String saveSuperMarket(SuperMarket superMarket) {

        superMarketRepository.save(superMarket);
        return "redirect:/showSuperMarkets";
    }

    @RequestMapping("/addSuperMarket")
    public String addSuperMarket(Model model) {
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