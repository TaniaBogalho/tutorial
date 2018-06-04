package com.exemplo;

public class Calculo {

	float num1;
	float num2;

	public float getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}
  
	public float getNum2() {
		return num2;
	}

	public void setNum1(String num2) {
		this.num2 = num2;
	}

	@Override
	public String soma() {
    		float total = num1 + num2;
  
		//return "Track [title=" + title + ", singer=" + singer + "]";
    		return "[num1=" + num1 + " + num2=" + num2 + " = " + total]";
	}

}
