package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@SpringBootTest
class FridgeInsightApplicationTests {

	@Autowired
	private AccountRepository accountRepository;



	@Autowired
	private SuperMarketRepository superMarketRepository;

	@Autowired
	private FoodRepository foodRepository;

	@Test
	void contextLoads() {

	/*	accountRepository.deleteAllInBatch();
		addressRepository.deleteAllInBatch();
		superMarketRepository.deleteAllInBatch();
		foodRepository.deleteAllInBatch();

		Calendar dateOfCreation = Calendar.getInstance();
		dateOfCreation.set(2020, 6, 21);

		Calendar dateOfExpiration = Calendar.getInstance();
		dateOfExpiration.set(2020,7,20);

		List<Food> foodList = new ArrayList<Food>();

		Account 	account 	= new Account("Hamza", "Harti", 25, 178, true, "Father", "A1fatalmamak", dateOfCreation.getTime());

		Address 	address 	= new Address(1003,"Plauener Weg 8", "Erfurt","TH",99089);
		SuperMarket superMarket = new SuperMarket("Edeka Koch");

		address.setSuperMarket(superMarket);
		superMarket.setAddress(address);

		Food 		food1 		= new Food("Milch 1,5% JA",dateOfExpiration.getTime(),"Milch",2);
		Food 		food2 		= new Food("Kochbeutel-Reis Longkorn 500g",dateOfExpiration.getTime(),"Spitzenreis",5);

		foodList.add(food1);
		foodList.add(food2);

		food1.setSupermarket(superMarket);
		food2.setSupermarket(superMarket);
		superMarket.setFoodList(foodList);

		foodRepository.save(food1);
		foodRepository.save(food2);
		superMarketRepository.save(superMarket);
		addressRepository.save(address);
		accountRepository.save(account);*/
	}
}
