package com.eval;

public class DsaEvaluation extends Evaluation{

	@Override
	void evaluationTiming() {
		System.out.println("Evaluation timing is 9:30 to 11:00");
		
	}
	public DsaEvaluation() {
		
	}
	
	public DsaEvaluation(int i) {
		System.out.println("No. of Questions in Evaluation is: "+i);
	}

}
