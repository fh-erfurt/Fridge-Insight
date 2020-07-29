package FridgeInsight.FridgeInsight.Repository;

import FridgeInsight.FridgeInsight.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{


}
