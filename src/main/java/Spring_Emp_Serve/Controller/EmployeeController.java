package Spring_Emp_Serve.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Spring_Emp_Serve.Entity.Employee;
import Spring_Emp_Serve.Service.EmployeeService;
import Spring_Emp_Serve.Util.SpringServeMail;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empserv;
	
	@Autowired
	private SpringServeMail servmail;

	//http://localhost:8080/show
	
	@RequestMapping("/show")
	public String show() {
		return "show";
	}
	//savedata
	
	@RequestMapping("/savedata")
	public String SaveMethod(Employee emp) {
		empserv.SaveEmpDataInfo(emp);
		
	servmail.SendEmpMail(emp.getEmpemail(),
	"Welcome to New Email API is Live",
	"We’re excited to introduce our brand-new Email API – designed to help developers and businesses send transactional and marketing emails with ease.");
		
		return "show";
	}
	
	//listofmeployee
	
	//http://localhost:8080/listofemployee
	
	@RequestMapping("/listofemployee")
	public String ListMethod(Employee emp,ModelMap model) {
		List<Employee> emps = empserv.ListEmpDataInfo(emp);
		model.addAttribute("emps",emps);
		return "listemp";
	}
	
	//deletebutton
	
	@RequestMapping("/delete")
	public String DeleteButtonMethod(Employee emp,@RequestParam("empid") long empid,ModelMap model) {
		empserv.DeleteEmpInfo(empid);
		List<Employee> emps = empserv.ListEmpDataInfo(emp);
		model.addAttribute("emps",emps);
		return "listemp";
	}
	
	//updatebutton
	
	@RequestMapping("/update")
	public String UpdateButtonMethod(@RequestParam("empid") long empid,ModelMap model) {
		Employee employedata = empserv.UpdateEmpInfo(empid);
		model.addAttribute("employedata",employedata);
		return "update_page";	
	}
	
	//SaveUpdateData
	
	@RequestMapping("/saveupdate")
	public String SaveUpMethod(Employee emp,ModelMap model) {
		empserv.UpdateSaveInfo(emp);
		List<Employee> emps = empserv.ListEmpDataInfo(emp);
		model.addAttribute("emps",emps);
		return "listemp";
	}
}