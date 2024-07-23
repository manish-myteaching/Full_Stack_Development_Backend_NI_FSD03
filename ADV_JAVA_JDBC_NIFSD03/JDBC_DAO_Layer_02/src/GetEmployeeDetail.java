import com.tcs.dao.EmployeeDAO;
import com.tcs.dao.EmployeeDAOImpl;
import com.tcs.dto.Employee;

public class GetEmployeeDetail {

	public static void main(String[] args) {
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		Employee emp = empDAO.getEmployeeDeatail(100L);

		if (emp != null) {
			System.out.println(emp);
		}else {
			System.out.println("Employee Record is not Found");
		}

	}

}
