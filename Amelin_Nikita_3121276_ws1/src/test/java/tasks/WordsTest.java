package tasks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WordsTest {
	char[] letters1 = {'m','a','r','s'};
	char[] letters2 = {'j','u','p','i','t','e','r'};
	char[] letters3 = {'s','a','t','u','r','n'};

	Words word1 = new Words(letters1);
	Words word2 = new Words(letters2);
	Words word3 = new Words(letters3);

	@Test
	public void testContains() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testLength() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testNotNull() {
		fail("Not yet implemented");
	}
}
