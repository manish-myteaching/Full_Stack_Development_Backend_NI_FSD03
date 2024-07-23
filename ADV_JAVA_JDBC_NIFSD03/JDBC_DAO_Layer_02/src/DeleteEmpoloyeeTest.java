import com.tcs.dao.EmployeeDAO;
import com.tcs.dao.EmployeeDAOImpl;
import com.tcs.dto.Employee;

public class DeleteEmpoloyeeTest {

	public static void main(String[] args) {
		//Business Logic Object----------------------------> Singleton(only one object should be created)
				EmployeeDAO empDAO = new EmployeeDAOImpl();
				
				boolean b = empDAO.deleteEmployeeDeatail(113L);
				
				if (b) {
					System.out.println("Record Delete SuccessFully..!");
				} else {
					System.out.println("Record is not Deleted SuccessFully..!");
				}
			}

	}


