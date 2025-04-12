package Spring_Emp_Serve.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Spring_Emp_Serve.Entity.Employee;
import Spring_Emp_Serve.Repository.EmployeeRepository;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeRepository emprepo;
	
	// Json content
	
	//http://localhost:8080/readjson
	
	@GetMapping("/readjson")
	public List<Employee> ReadJsonMethod(Employee emp){
		List<Employee> empdata = emprepo.findAll();		
		return empdata;
	}

}
