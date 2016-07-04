import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.plato.repository.CustomerRepository;
import com.plato.repository.HibernateCustomerRepositoryImpl;
import com.plato.service.CustomerService;
import com.plato.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.plato"})
public class AppConfig {
	@Bean(name = "customerService")
	public CustomerService getCustomerService(){
		CustomerServiceImpl service  = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository()); //Using setter injection
		
		return service;
	}
	
	@Bean(name = "customerRepository")
public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
}	
	
}
