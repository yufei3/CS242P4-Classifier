package learn.lc.examples;

import java.io.IOException;

/**
 * Test PerceptronClassifier on house-votes-84.data.num.txt with a decaying learning rate
 * (I just enter alpha = 0 to represent decaying learning schedule)
 */
public class PerceptronClassifierHouseVotesDecaying extends PerceptronClassifierTest{
	
	public static void main(String[] args) throws IOException {
		String current = System.getProperty("user.dir");
		//as alpha with decaying learning schedule the default steps is 100000
		test(current+"/learn/lc/examples/house-votes-84.data.num.txt", 10000, 0);
	}

}
