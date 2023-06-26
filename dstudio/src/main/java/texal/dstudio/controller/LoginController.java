package texal.dstudio.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import texal.dstudio.model.Customer;
import texal.dstudio.repository.CustomerRepository;


@RestController
public class LoginController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/register")
    public  ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
        Customer response = customerRepository.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
}
