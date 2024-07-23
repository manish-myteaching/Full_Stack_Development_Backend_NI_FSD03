import com.tcs.dao.EmployeeDAO;
import com.tcs.dao.EmployeeDAOImpl;
import com.tcs.dto.Employee;

public class UpdateEmployeeTest {

	public static void main(String[] args) {
		//Business Logic Object----------------------------> Singleton(only one object should be created)
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		
		//Pojo(Information)  -----------> Mulitpal Object
		Employee emp = new Employee();
		emp.setEmpId(112L);
		//emp.setEmpName("Sourbh");
		emp.setEmpSalary(2000.00);

		boolean b = empDAO.modifyEmployeeDeatail(emp);
		
		if (b) {
			System.out.println("Record Update SuccessFully..!");
		} else {
			System.out.println("Record is not Updated SuccessFully..!");
		}

	}

}
