package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.SuperMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Calendar;

@Controller
public class SuperMarketController {

    @Autowired
    private SuperMarketRepository superMarketRepository;

    @RequestMapping("/saveSuperMarket")
    public String saveSuperMarket(SuperMarket superMarket) {

        superMarketRepository.save(superMarket);
        return "index";
    }

    @RequestMapping("/addSuperMarket")
    public String addSuperMarket() {
        return "addSuperMarket";
    }
}