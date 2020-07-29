package FridgeInsight.FridgeInsight.Repository;

import FridgeInsight.FridgeInsight.PurchaseList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseListRepository extends JpaRepository<PurchaseList, Long>{


}