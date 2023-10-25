package customer;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class CustomerController {
    
    @Autowired
    private CustomerService service;

    @GetMapping("cust/")
    public void hello(){
        System.out.println("HELLLOOOOOOO........");
    }

    @GetMapping("/getCustomers")
    public List<Customer> list(){
        return service.listAll();
    }

    @GetMapping("/getCustomer/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id) {
		try {
			Customer cust = service.get(id);
			return new ResponseEntity<Customer>(cust, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}

    @PostMapping("/addCustomer")
    public ResponseEntity<String> add(@Valid@RequestBody Customer cust){
        boolean status = service.save(cust);
        if (status) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Data is Created!");
        }
        else{
            return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PutMapping("/updateCustomer")
    public ResponseEntity<String> update(@RequestBody Customer cust){
        try{
            service.get(cust.getId());
            service.updateCustomer(cust);
            return ResponseEntity.status(HttpStatus.OK).body("Customer Updated Successfully!");
        }catch(NoSuchElementException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Such Id is found");
        }
    }

    @DeleteMapping("/removeCustomer")
    public ResponseEntity<String> removeCustomer(@RequestParam Integer id){
        try{
            service.get(id);
            service.deleteCustomer(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch(NoSuchElementException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Such Id is found");
        }
    }
}
