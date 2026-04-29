package com.visal.learning;

import com.visal.learning.Impl.AddFive;
import com.visal.learning.Impl.AddNumber;
import com.visal.learning.Impl.addFiveImpl;

public class FuntionalInterface {
	public static void main(String[] args) {
		AddFive addFive = new addFiveImpl();
		int result = addFive.addFive(20);
		System.out.println(result);
//		implement by anonymous class 	
		AddNumber addNumber = new AddNumber() {
			
			@Override
			public int addNumber(int num) {
				return num+100;
			}
		};
		
		result = addNumber.addNumber(50);
		System.out.println(result);
//		implement by lamda 
		AddNumber addNumberLamda = (int a) ->  a+50;
		
		result = addNumberLamda.addNumber(120);
		System.out.println(result);
	}
}
