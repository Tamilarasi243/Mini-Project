package Employee;

import java.util.ArrayList;
import java.util.List;

import Emp.java.EmplyoeeDetails;

public interface EmpDao {
	public ArrayList<EmplyoeeDetails> putDetails(List<String> emp);

	public String getAge(String age, List<String> name);

	public boolean getLogin(String userid, String password);

	public String setLogin(String loginid, String pass);

}
