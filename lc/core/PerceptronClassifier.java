package learn.lc.core;

import learn.math.util.VectorOps;

public class PerceptronClassifier extends LinearClassifier {
	
	public PerceptronClassifier(int ninputs) {
		super(ninputs);
	}
	
	/**
	 * A PerceptronClassifier uses the perceptron learning rule
	 * (AIMA Eq. 18.7): w_i \leftarrow w_i+\alpha(y-h_w(x)) \times x_i 
	 */
	public void update(double[] x, double y, double alpha) {
		// This must be implemented by you
		double hw = threshold(VectorOps.dot(this.weights,x));
		 for(int i=0; i<x.length; i++){
	           
	            this.weights[i] = this.weights[i] + ((alpha * (y-hw)) * x[i]);
	        }
	}
	
	/**
	 * A PerceptronClassifier uses a hard 0/1 threshold.
	 */
	public double threshold(double z) {
		// This must be implemented by you
		if(z >= 0) {
			return 1;
		}else
		 {
			return 0;
		}
	
	}
	
}
