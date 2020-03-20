import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {

	@Test
	void test() {
		Demo2 dem = new Demo2();
		assertTrue(dem.palindromeCheck("abcba"));
		assertFalse(dem.palindromeCheck("abcde"));
		assertTrue(dem.palindromeCheck("pallinnillap"));
		assertFalse(dem.palindromeCheck("masher"));
		assertTrue(dem.palindromeCheck("nitin"));
		assertFalse(dem.palindromeCheck("Nitin"));
	}

}
