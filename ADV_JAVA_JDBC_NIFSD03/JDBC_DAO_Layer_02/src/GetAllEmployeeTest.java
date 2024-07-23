import java.util.List;

import com.tcs.dao.EmployeeDAO;
import com.tcs.dao.EmployeeDAOImpl;
import com.tcs.dto.Employee;

public class GetAllEmployeeTest {

	public static void main(String[] args) {
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		List<Employee> listEmp = empDAO.getAllEmployeeDeatail();

		for (Employee emp : listEmp) {
			System.out.println(emp.getEmpName());
		}

	}

}
