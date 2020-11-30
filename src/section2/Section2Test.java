package section2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * This test class is to test Section2.java source code.
 * @author Yuhang Zhao(150467199)
 *
 */
public class Section2Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("The test for section2 is starting.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("The test for section2 is done.");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void minIntegerTest() {
		assertTrue(Section2.minInteger() == -2147483648);
	}
	
	@Test
	public void maximumDoubleTest() {
		assertTrue(Section2.maximumDouble() == Math.pow(2, -1074));
	}
	
	@Test
	public void rayleighTest() {
		double x = 1;
		int sigma = 1;
		double y = Math.exp(-0.5);
		assertTrue(Section2.rayleigh(x, sigma) == y);
	}
	
	@Test
	public void sortTest() {
		List<Integer> t1 = new ArrayList<>();
		t1.add(3);
		t1.add(2);
		t1.add(1);
		
		List<Integer> t2 = new ArrayList<>();
		t2.add(2);
		t2.add(1);
		t2.add(3);
		Section2.sort(t2);
		
		assertEquals(t2, t1);
	}
	
	@Test
	public void freqencyTest() {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("bear");
		list.add("watermelon");
		list.add("apple");
		list.add("strawberry");
		list.add("banana");
		list.add("apple");
		list.add("lemon");
		
		assertTrue(Section2.frequency(list, "apple")==3);
	}
	
}
