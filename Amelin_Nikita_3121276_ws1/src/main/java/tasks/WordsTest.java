package tasks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WordsTest {
	//various sets of values
	char[] letters1 = {'m','a','r','s'};
	char[] letters2 = {'j','u','p','i','t','e','r'};
	char[] letters3 = {'s','a','t','u','r','n'};
	//creating objects for testing
	Words word1 = new Words(letters1);
	Words word2 = new Words(letters2);
	Words word3 = new Words(letters3);

	@Test
	public void testContains() {
		assertTrue(word1.contains('m'));
		assertTrue(word2.contains('j'));
		assertTrue(word3.contains('s'));
	}
	
	@Test
	public void testLength() {
		assertEquals(letters1.length, word1.length());
		assertEquals(letters2.length, word2.length());
		assertEquals(letters3.length, word3.length());
	}
	
	@Test
	public void testNotNull() {
		assertNotNull(word1.getLetters());
		assertNotNull(word2.getLetters());
		assertNotNull(word3.getLetters());

	}
}
