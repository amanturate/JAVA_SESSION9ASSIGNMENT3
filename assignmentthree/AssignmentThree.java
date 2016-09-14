package assignmentthree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AssignmentThree {

	public static void main(String[] args) {

		String EmpName1 = new String("Aman");
		String EmpName2 = new String("Raj");
		String EmpName3 = new String("Nilesh");
		String EmpName4 = new String("Karan");
		String EmpName5 = new String("Ranbir");
		String EmpName6 = new String("Pranav");

		Integer Empcode1 = new Integer(10001);
		Integer Empcode2 = new Integer(10004);
		Integer Empcode3 = new Integer(10003);
		Integer Empcode4 = new Integer(10002);
		Integer Empcode5 = new Integer(10005);
		Integer Empcode6 = new Integer(10006);

		HashMap<Integer, String> Emp = new HashMap<Integer, String>();
		Emp.put(Empcode1, EmpName1);
		Emp.put(Empcode2, EmpName2);
		Emp.put(Empcode3, EmpName3);
		Emp.put(Empcode4, EmpName4);
		Emp.put(Empcode5, EmpName5);
		Emp.put(Empcode6, EmpName6);

		Iterator iter = Emp.entrySet().iterator();

		while (iter.hasNext()) {
			Map.Entry pair = (Map.Entry) iter.next();
			System.out.println(pair.getValue());
		}

	}

}
