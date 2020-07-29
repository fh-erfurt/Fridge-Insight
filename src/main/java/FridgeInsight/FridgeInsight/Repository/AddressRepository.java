package FridgeInsight.FridgeInsight.Repository;

import FridgeInsight.FridgeInsight.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{


}
