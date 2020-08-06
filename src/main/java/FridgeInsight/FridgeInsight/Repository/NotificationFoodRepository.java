package FridgeInsight.FridgeInsight.Repository;

import FridgeInsight.FridgeInsight.Classes.NotificationFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationFoodRepository extends JpaRepository<NotificationFood, Long>{


}