package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.FoodRepository;
import FridgeInsight.FridgeInsight.Repository.SuperMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;
import java.util.List;

@Controller
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;
    private SuperMarketRepository superMarketRepository;

    @GetMapping("/addFood")
    public String addFood(Model model) {

        List<SuperMarket> superMarkets = superMarketRepository.findAll();
        model.addAttribute("superMarkets",superMarkets);

        model.addAttribute("food",new Food());

        return "addFood";

    }

    @RequestMapping("/saveFood")
    public String saveFood(Food food) {

        foodRepository.save(food);
        return "redirect:/showFoods";
    }

}
