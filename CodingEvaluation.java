package com.eval;

public  class CodingEvaluation extends Evaluation {

	@Override
	void evaluationTiming() {
		System.out.println("Evaluation timing is 2:00 to 3:30");
		
	}

	public CodingEvaluation() {
		
	}
	public CodingEvaluation(int i) {
		System.out.println("No. of Questions in Evaluation is: "+i);
	}

	
}
