package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable int id) {
        Address address = new Address("115 Newstead Road", "London", "SE12 0WT");
        return new Customer(id, "Alice Smith", "alice@example.com", address);
    }
}
