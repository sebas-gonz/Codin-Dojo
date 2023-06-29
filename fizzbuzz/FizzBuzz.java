package com.codingdojo.fizzbuzz;

public class FizzBuzz {

	public String fizzBuzz(int numero) {
		if(numero % 15 == 0 ) {
			return "FizzBuzz";
		}
		if(numero % 3 == 0) {
			return "Fizz";
		}
		if(numero % 5 == 0) {
			return "Buzz";
		}
		else {
			return ""+numero;
		}
	}

}
