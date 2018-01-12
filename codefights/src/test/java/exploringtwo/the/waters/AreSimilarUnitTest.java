package exploringtwo.the.waters;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class AreSimilarUnitTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };

		boolean result = areSimilar(a, b);

		assertTrue(result);
	}

	@Test
	public void test2() {
		int[] a = { 1, 2, 3 };
		int[] b = { 2, 1, 3 };

		boolean result = areSimilar(a, b);

		assertTrue(result);
	}

	@Test
	public void test6() {
		int[] a = { 2, 3, 1 };
		int[] b = { 1, 3, 2 };

		boolean result = areSimilar(a, b);

		assertTrue(result);
	}

	@Test
	public void test9() {
		int[] a = { 832, 998, 148, 570, 533, 561, 894, 147, 455, 279 };
		int[] b = { 832, 998, 148, 570, 533, 561, 455, 147, 894, 279 };

		boolean result = areSimilar(a, b);

		assertTrue(result);
	}

	boolean areSimilar(int[] a, int[] b) {

		boolean areEquals = Arrays.equals(a, b);

		for (int i = 1; i < a.length && !areEquals; i++) {

			for (int j = 0; j < a.length && !areEquals; j++) {

				if (j != i) {
					int aux = a[i];
					a[i] = a[j];
					a[j] = aux;

					areEquals = Arrays.equals(a, b);
				}

			}
		}

		return areEquals;
	}


}
