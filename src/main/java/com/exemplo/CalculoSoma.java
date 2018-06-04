package com.exemplo;

public class Calculo {

	String num1;
	String num2;

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}
  
	public String getNum2() {
		return num2;
	}

	public void setNum1(String num2) {
		this.num2 = num2;
	}

	@Override
	public String soma() {
    		float total = float.parse(num) + float.parse(num2);
  
		//return "Soma [num1=" + num1 + ", num2=" + num2 + "]";
    		return "[" + num1 + ", "+", " + num2 + ", " = " + total]";
	}

}
