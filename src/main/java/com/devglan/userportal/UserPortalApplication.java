package com.devglan.userportal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.context.annotation.Bean;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@SpringBootApplication
public class UserPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserPortalApplication.class, args);
	}

    @Bean
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public CommandLineRunner demo(IzdatekRepository repository1, KategorijaRepository repository2) {
        return (args) -> {
            repository1.save(new Izdatek("danes", "meme", 8.1));
            //repository2.save(new Kategorija("oblekce"));

            /*System.out.println("Customers found with findAll():");
            System.out.println("-------------------------------");
            for (Customer customer : repository.findAll()) {
                System.out.println(customer.toString());
            }
            System.out.println(""); */
        };
    }
}
