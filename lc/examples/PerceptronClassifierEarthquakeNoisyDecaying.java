package learn.lc.examples;

import java.io.IOException;

/**
 * Tests the PerceptronClassifier on the noisy earthquake data with a decaying
 * learning schedule.
 */
public class PerceptronClassifierEarthquakeNoisyDecaying extends PerceptronClassifierTest {

	public static void main(String[] args) throws IOException {
		test("learn/lc/examples/earthquake-noisy.data.txt", 10000, 0);
	}

}
