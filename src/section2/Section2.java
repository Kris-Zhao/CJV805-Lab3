package section2;

import java.util.List;
/**
 * This class is the source code that would be tested.
 * @author Yuhang Zhao(150467199)
 *
 */
public class Section2 {
	
    //part1
	// minInteger() returns the minimum value that an int can represent
	public static int minInteger() {
	       return Integer.MIN_VALUE;
	}

	// this method can return the minimum positive value greater than zero that a double can represent
	public static double maximumDouble() {
		return Double.MIN_VALUE;
	}
	
	
	//part2
	public static double rayleigh(double x, int sigma) {
		double y = (x/((double)sigma * (double)sigma) * Math.exp((-x*x/(2*(double)sigma*(double)sigma))));
		return y;
	}
	
	//part3
	//The method sorts a list of three integers so that the elements are in descending order (largest to smallest). The size of the list remains unchanged.
	public static void sort(List<Integer> t) {
			if (t.size() != 3) {
				throw new IllegalArgumentException();
			}
			int a = t.get(0);
			int b = t.get(1);
			int c = t.get(2);
			if (a > b && a > c) {
				if (b>c) {
				t.set(0, a); t.set(1, b); t.set(2, c);}
				if (b<c) {
				t.set(0, a); t.set(1, c); t.set(2, b)	;
				}
			}
			
			if (b > a && b>c) {
				if (a>c) {
				t.set(0, b); t.set(1, a); t.set(2, c);}
				if (a<c) {
				t.set(0, b); t.set(1, c); t.set(2, a)	;
				}
			}
			
			if (c > a && c>b) {
				if (b>a) {
				t.set(0, c); t.set(1, b); t.set(2, a);}
				if (b<a) {
				t.set(0, c); t.set(1, a); t.set(2, b)	;
				}
			}
					
		}
	
	//part4
	public static int frequency(List<String> t, String target) {
			
			int n = 0;
			for (String s : t) {
				if (s.equals(target)) {
					n++;
				}
			}
			return n;
		}
	
}
