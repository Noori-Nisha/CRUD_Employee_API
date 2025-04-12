package Spring_Emp_Serve.Service;

import java.util.List;

import Spring_Emp_Serve.Entity.Employee;

public interface EmployeeService {
	
	public void SaveEmpDataInfo(Employee emp);
	
	public List<Employee> ListEmpDataInfo(Employee emp);

	public void DeleteEmpInfo(long empid);
	
	public Employee UpdateEmpInfo(long empid);
	
	public void UpdateSaveInfo(Employee emp);
}
