package com.exemplo;

public class CalculoSoma {

	int num1;
	int num2;
	int total;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
  
	public int getNum2() {
		return num2;
	}

	public void setNum1(int num2) {
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
