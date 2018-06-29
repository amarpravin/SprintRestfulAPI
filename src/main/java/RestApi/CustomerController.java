package RestApi;

import model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/{accountNumber}/customer")
public class CustomerController {

    @GetMapping
    Collection<Customer> getCustomer(@PathVariable String accountNumber) {
        Collection<Customer> customerCollection = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Smith");
        customer.setAccountNumber(accountNumber);
        customerCollection.add(customer);
        return customerCollection;
    }

    @PostMapping
    public @ResponseBody ResponseEntity<String> post(@RequestBody Customer customer) {
        return new ResponseEntity<String>("POST Response" + customer, HttpStatus.OK);
    }

}
