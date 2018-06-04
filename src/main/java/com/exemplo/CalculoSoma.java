package com.exemplo;

public class CalculoSoma {

	Float num1;
	Float num2;

	public Float getNum1() {
		return num1;
	}

	public void setNum1(Float num1) {
		this.num1 = num1;
	}
  
	public Float getNum2() {
		return num2;
	}

	public void setNum1(Float num2) {
		this.num2 = num2;
	}

	@Override
	public String calcula() {
    		Float total = this.num1 + this.num2;
  
		//return "Track [title=" + title + ", singer=" + singer + "]";
    		return "CalculoSoma [num1=" + num1 + " + num2=" + num2 + " = " + total + "]";
	}

}
