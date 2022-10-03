package com.lovetolearn.SpringbootApp;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

class SpringbootAppApplicationTests {

	@Test
	void testPassEquals() {

		assertEquals("1", "1");
	}

	@Test
	void testFailEquals() {

		assertEquals("1", "2");
	}
	
	@Test
	void testPassNotEquals() {

		assertNotEquals("1", "2");
	}

	@Test
	void testFailNotEquals() {

		assertNotEquals("1", "1");
	}

	@Test
	void testPassFalse() {

		assertFalse(false);
	}

	@Test
	void testFailFalse() {

		assertFalse(true);
		
	}

	@Test
	void testPassNull() {

		assertNull(null);
	}

	@Test
	void testFailNull() {

		assertNull("test");
	}

	@Test
	void testPassNotNull() {

		assertNotNull("test");
	}

	@Test
	void testFailNotNull() {

		assertNotNull(null);
	}

	@Test
	void testPassTrue() {

		assertTrue(true);
	}

	@Test
	void testFailTrue() {

		assertTrue(false);
	}

	@Test
	void testPassThrows() {

		assertThrows(Exception.class, () -> {
			throwException();
		});

	}

	@Test
	void testFailThrows() {

		assertThrows(Exception.class, () -> {
			test();
		});

	}

	public void throwException() throws Exception {

		throw new Exception();
	}

	public void test() {

	}

	@Test
	void testAssertAll() {
		assertAll(() -> assertNotNull("qwklme"), () -> assertEquals("appleId should be 1", "appleId should be 1"),
				() -> assertEquals("adfv", "appleName should be apple"));
	}

}
