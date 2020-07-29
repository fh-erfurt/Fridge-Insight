package FridgeInsight.FridgeInsight;

import FridgeInsight.FridgeInsight.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class FridgeInsightApplication implements CommandLineRunner {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private SuperMarketRepository superMarketRepository;

    @Autowired
    private FoodRepository foodRepository;

    public static void main(String[] args) {
        SpringApplication.run(FridgeInsightApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        accountRepository.deleteAllInBatch();
        personRepository.deleteAllInBatch();
        addressRepository.deleteAllInBatch();
        superMarketRepository.deleteAllInBatch();
        foodRepository.deleteAllInBatch();




        Person person = new Person("Hamza", "Harti", 25, 178, true, "Father");

        Calendar dateOfCreation = Calendar.getInstance();
        Calendar dateOfExpiration = Calendar.getInstance();

        dateOfCreation.set(2020, 6, 21);

        Account account = new Account("A1fatalmamak", dateOfCreation.getTime());

        person.setAccount(account);

        account.setPerson(person);

        Address address = new Address(1003,"Plauener Weg 8", "Erfurt","TH",99089);
        SuperMarket superMarket = new SuperMarket("Edeka Koch");

        address.setSuperMarket(superMarket);
        superMarket.setAddress(address);

        dateOfExpiration.set(2020,7,20);
        Food food1 = new Food("Milch 1,5% JA",dateOfExpiration.getTime(),"Milch",2);
        Food food2 = new Food("Kochbeutel-Reis Longkorn 500g",dateOfExpiration.getTime(),"Spitzenreis",5);
        List<Food> foodList = new ArrayList<Food>();

        foodList.add(food1);
        foodList.add(food2);

        food1.setSupermarket(superMarket);
        food2.setSupermarket(superMarket);
        superMarket.setFoodList(foodList);




        foodRepository.save(food1);
        foodRepository.save(food2);
        superMarketRepository.save(superMarket);
        addressRepository.save(address);
        personRepository.save(person);

    }


}
