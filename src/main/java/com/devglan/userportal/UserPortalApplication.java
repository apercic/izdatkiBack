package com.devglan.userportal;
import com.devglan.userportal.izdatek.IzdatekRepository;
import com.devglan.userportal.kategorija.KategorijaRepository;
import com.devglan.userportal.user.UserRepository;
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
    public CommandLineRunner demo(IzdatekRepository repository1, KategorijaRepository repository2, UserRepository repository3) {
        return (args) -> {
            //repository1.save(new Izdatek("danes", "meme", 8.1))
        };
    }
}
