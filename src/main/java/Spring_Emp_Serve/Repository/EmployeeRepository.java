package Spring_Emp_Serve.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_Emp_Serve.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
