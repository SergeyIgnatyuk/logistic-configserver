package by.logisticconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LogisticConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticConfigserverApplication.class, args);
    }

}
