package com.practice;

import org.testng.annotations.Test;

public class Javap {
	@Test(enabled=false)
	public void f() {
		String x = "prasad";
		int i= x.length();
		String r="";
		for(int j=0;j<i;j++){
			r= x.charAt(j)+r;
		}
		System.out.println(r);
	}
	@Test(enabled=false)
	public void d(){
		String x = "prasad";
		String y[] = x.split("");
		String r="";
		for(String z:y){
		r=z+r;		
		}
		System.out.println(r);
	}
	@Test
	public void a(){
		String x= "prasad";
		String reverses = new StringBuffer(x).reverse().toString();
		System.out.println(reverses);
	}
}
