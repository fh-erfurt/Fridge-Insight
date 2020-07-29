package FridgeInsight.FridgeInsight.Repository;


import FridgeInsight.FridgeInsight.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
