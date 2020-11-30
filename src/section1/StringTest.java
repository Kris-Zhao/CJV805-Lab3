package section1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * This is a test class using Junit, test the methods length,charAt, substring, and indexOf in thejava.lang.String class.
 * @author Yuhang Zhao(150467199)
 *
 */
public class StringTest {
	
	private String testString = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("The test for section1 is starting.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("The test for section1 is done.");
	}

	@Before
	public void setUp() throws Exception {
		testString = "abcde";
	}

	@After
	public void tearDown() throws Exception {
		testString = null;
	}

	@Test
	public void testLength() {
		assertEquals(5, testString.length());
	}
	
	@Test
	public void testCharAt() {
		assertEquals('a', testString.charAt(0));
	} 
	
	@Test
	public void testSubString() {
		assertEquals("bcde", testString.substring(1));
	} 
	
	@Test
	public void testIndexOf() {
		assertEquals(1, testString.indexOf("b"));
	} 

}
