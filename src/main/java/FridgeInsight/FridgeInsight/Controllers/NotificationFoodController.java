package FridgeInsight.FridgeInsight.Controllers;

import FridgeInsight.FridgeInsight.Classes.Food;
import FridgeInsight.FridgeInsight.Classes.NotificationFood;
import FridgeInsight.FridgeInsight.Repository.FoodRepository;
import FridgeInsight.FridgeInsight.Repository.NotificationFoodRepository;
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
public class NotificationFoodController {
    @Autowired
    private NotificationFoodRepository notificationFoodRepository;

    @Autowired
    private FoodRepository foodRepository;


    @GetMapping("/addNotification")
    public String addNotification(Model model) {

        List<Food> foods = foodRepository.findAll();

        model.addAttribute("foods",foods);

        model.addAttribute("notification",new NotificationFood());

        return "addNotification";

    }

    @RequestMapping("/saveNotification")
    public String saveNotification(NotificationFood notificationFood) {
        notificationFoodRepository.save(notificationFood);
        return "redirect:/showNotifications";
    }

    @GetMapping("/showNotifications")
    public String showNotifications(Model theModel) {

        List<NotificationFood> notificationFoods = notificationFoodRepository.findAll();
        theModel.addAttribute("Notifications",notificationFoods);

        return "Notifications";
    }

    @GetMapping("/deleteNotification")
    public String deleteNotification(@RequestParam("NOTFOODID") Long Id)  {
        notificationFoodRepository.deleteById(Id);
        return "redirect:/showNotifications";
    }
    @GetMapping("/updateNotification")
    public String updateNotification(@RequestParam("NOTFOODID") Long Id, Model theModel) {
        List<Food> foods = foodRepository.findAll();
        theModel.addAttribute("foods",foods);
        NotificationFood notificationFood = notificationFoodRepository.findById(Id).orElse(new NotificationFood());
        theModel.addAttribute("notification", notificationFood);
        return "addNotification";
    }

}
