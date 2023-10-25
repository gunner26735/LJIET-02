package customer;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {
    @Autowired
	private CustomerRepository repo;

    //retrieve all
	public List<Customer> listAll() {
		return repo.findAll();
	}

    //create
	public boolean save(Customer cust) {
		Customer status = repo.save(cust);
        if(status != null){
            return true;
        }
        else{
            return false;
        }
	}

	// update
	public Customer updateCustomer(Customer cust) {
		Integer id = cust.getId();
		Customer c1 = repo.findById(id).get();
		c1.setName(cust.getName());
		c1.setEmail(cust.getEmail());
        c1.setOrder_id(cust.getOrder_id());
        c1.setPhone(cust.getPhone());
		return repo.save(c1);

	}

    //retrieve single data
	public Customer get(Integer id) {
		return repo.findById(id).get();
	}

    //delete
	public void deleteCustomer(Integer id) {
		repo.deleteById(id);
	}
}
