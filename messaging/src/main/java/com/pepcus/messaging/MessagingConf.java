package com.pepcus.messaging;

import com.pepcus.messaging.user.model.User;
import com.pepcus.messaging.user.repository.IUserManagementRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages={"com.pepcus.messaging"})
public class MessagingConf {
    private static final Logger log = LoggerFactory.getLogger(MessagingConf.class);

        public static void main(String[] args) {
            SpringApplication.run(MessagingConf.class, args);
        }

//    @Bean
//    public CommandLineRunner demo(IUserManagementRespository repository) {
//        return (args) -> {
//            // save a couple of Users
//            repository.save(new User("123456", "9890098900","test","password"));
//            repository.save(new User("123456", "9890098900","test","password"));
//            repository.save(new User("123456", "9890098900","test","password"));
//            repository.save(new User("123456", "9890098900","test","password"));
//
//            // fetch all Users
//            log.info("Users found with findAll():");
//            log.info("-------------------------------");
//            for (User User : repository.findAll()) {
//                log.info(User.toString());
//            }
//            log.info("");
//
//            // fetch an individual User by ID
//            User User = repository.findOne(1L);
//            log.info("User found with findOne(1L):");
//            log.info("--------------------------------");
//            log.info(User.toString());
//            log.info("");
//
//            // fetch Users by last name
//            log.info("User found with findByLastName('Bauer'):");
//            User user =repository.findById(1l);
//            log.info("--------------------------------------------");
//
//                log.info(user.toString());
//
//            log.info("");
//        };
//    }
}
