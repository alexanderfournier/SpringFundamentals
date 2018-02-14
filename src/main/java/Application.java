import com.springtest.service.DeveloperService;
import com.springtest.service.DeveloperServiceImpl;

public class Application {
	
	public static void main(String args[]) {
	
	DeveloperService service = new DeveloperServiceImpl();
	
	System.out.println(service.findAll().get(0).getFirstName());
	

}
}