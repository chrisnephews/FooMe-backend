package App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by cknev on 10-1-2018.
 */
@ComponentScan(basePackages = {"Controller"})
@SpringBootApplication
@EnableJpaRepositories("DAO")
@EntityScan("Model")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
