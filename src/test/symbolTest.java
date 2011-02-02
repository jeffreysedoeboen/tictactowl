package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ein4c.Symbol;

public class symbolTest {

	@Test
	public void test_get_name() {
		Symbol testSymbol = new Symbol("kaas");
		assertEquals("kaas", testSymbol.getName());
	}
	

}
