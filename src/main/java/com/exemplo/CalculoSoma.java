package com.exemplo;

public class CalculoSoma {

	Int num1;
	Int num2;
	Int total;

	public Int getNum1() {
		return num1;
	}

	public void setNum1(Int num1) {
		this.num1 = num1;
	}
  
	public Int getNum2() {
		return num2;
	}

	public void setNum1(Int num2) {
		this.num2 = num2;
	}

	@Override
	public String calcula() {
    		total = this.num1 + this.num2;
 
		//return "Track [title=" + title + ", singer=" + singer + "]";
    		//return "CalculoSoma [" + num1 + " + " + num2 + " = " + total + "]";
		return "CalculoSoma [ num1=" + num1 + ", num2=" + num2 + ", total=" + total + "]";
	}

}
