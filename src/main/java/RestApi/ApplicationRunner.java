package RestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args){
        SpringApplication.run(ApplicationRunner.class, args);
    }

//    @Bean
//    CommandLineRunner init(CustomerRepository customerRepository) {
//        return (evt) -> Arrays.asList(
//                "jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
//                .forEach(
//                        a -> {
//                            Customer customer = customerRepository.save(new Customer(a,"a2"));
//                            customerRepository.save(new Customer(a,"b2"));
//                            customerRepository.save(new Customer(a,"c2"));
//                        });
//    }

}
