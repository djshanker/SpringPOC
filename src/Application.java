import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.plato.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = appContext.getBean("CustomerService",CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
