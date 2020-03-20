import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1test {

	@Test
	void stringConcatTest() {
		Demo1 dem = new Demo1();
		assertEquals("Hello world",dem.stringConcat("Hello ", "world"));
		assertEquals("byetata",dem.stringConcat("bye", "tata"));
	}

}
