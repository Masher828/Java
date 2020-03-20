import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FindNameTest {

	@Test
	void test() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("Masher");
		str.add("Manish");
		str.add("Ram");
		str.add("Rahul");
		Employee emp = new Employee();
		assertEquals("FOUND", emp.findName(str,"Masher"));
		assertEquals("NOT FOUND",emp.findName(str,"Kamlesh"));
		assertEquals("FOUND", emp.findName(str,"Rahul"));
		assertEquals("NOT FOUND",emp.findName(str,"rahul"));
	}

}
