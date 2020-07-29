package FridgeInsight.FridgeInsight.Repository;

import FridgeInsight.FridgeInsight.SuperMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperMarketRepository extends JpaRepository<SuperMarket, Long>{


}