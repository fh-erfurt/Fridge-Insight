package FridgeInsight.FridgeInsight.Repository;

import FridgeInsight.FridgeInsight.Classes.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long>{


}