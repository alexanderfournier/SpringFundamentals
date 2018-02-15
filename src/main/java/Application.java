import com.springtest.service.DeveloperService;
import com.springtest.service.DeveloperServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String args[]) {
	
//DeveloperService service = new DeveloperServiceImpl();
	
	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
	 
	DeveloperService service = appContext.getBean("developerService",DeveloperService.class);
	
	System.out.println(service.findAll().get(0).getFirstName());
	

}
}

