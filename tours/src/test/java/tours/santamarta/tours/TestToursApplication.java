package tours.santamarta.tours;

import org.springframework.boot.SpringApplication;

public class TestToursApplication {

    public static void main(String[] args) {
        SpringApplication.from(ToursApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
