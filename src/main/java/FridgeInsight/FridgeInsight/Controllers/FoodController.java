package FridgeInsight.FridgeInsight.Controllers;

import FridgeInsight.FridgeInsight.Classes.Food;
import FridgeInsight.FridgeInsight.Classes.NotificationFood;
import FridgeInsight.FridgeInsight.Repository.FoodRepository;
import FridgeInsight.FridgeInsight.Repository.SuperMarketRepository;
import FridgeInsight.FridgeInsight.Classes.SuperMarket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.AutoPopulatingList;
import org.springframework.web.bind.annotation.*;

import javax.management.Notification;
import java.util.List;

@Controller
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    @Autowired
   private SuperMarketRepository superMarketRepository;


    @GetMapping("/addFood")
    public String addFood(Model model) {

        Food food = new Food();
        food.setListNotificationFood(new AutoPopulatingList<NotificationFood>(NotificationFood.class));

        List<SuperMarket> supermarkets = superMarketRepository.findAll();

        model.addAttribute("superMarkets",supermarkets);

        model.addAttribute("food",new Food());

        return "addFood";

    }

    @RequestMapping("/saveFood")
    public String saveFood(Food food) {

        foodRepository.save(food);
        return "redirect:/showFoods";
    }

    @GetMapping("/showFoods")
    public String showFoods(Model theModel) {

        List<Food> Foods = foodRepository.findAll();
        theModel.addAttribute("Foods",Foods);

        return "Foods";
    }

    @GetMapping("/deleteFood")
    public String deleteFood(@RequestParam("FOODID") Long Id)  {
        foodRepository.deleteById(Id);
        return "redirect:/showFoods";
    }
    @GetMapping("/updateFood")
    public String updateFood(@RequestParam("FOODID") Long Id, Model theModel) {
        List<SuperMarket> supermarkets = superMarketRepository.findAll();

        theModel.addAttribute("superMarkets",supermarkets);
        Food food = foodRepository.findById(Id).orElse(new Food());
        theModel.addAttribute("food", food);
        return "addFood";
    }

}
