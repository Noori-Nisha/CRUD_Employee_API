package Spring_Emp_Serve.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring_Emp_Serve.Entity.Employee;
import Spring_Emp_Serve.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;
	
	@Override
	public void SaveEmpDataInfo(Employee emp) {
		emprepo.save(emp);
	}

	@Override
	public List<Employee> ListEmpDataInfo(Employee emp) {
		List<Employee> emply = emprepo.findAll();
		return emply;
	}

	@Override
	public void DeleteEmpInfo(long empid) {
		emprepo.deleteById(empid);
	}

	@Override
	public Employee UpdateEmpInfo(long empid) {
		Optional<Employee> employ = emprepo.findById(empid);
		Employee employedata = employ.get();
		return employedata;
	}

	@Override
	public void UpdateSaveInfo(Employee emp) {
		emprepo.save(emp);
	}

}
