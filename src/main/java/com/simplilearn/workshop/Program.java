package com.simplilearn.workshop;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello WWorld");
		System.out.println("Trying to  trigger a new build using Github Actions!");
	}

	public String getGreeting() {
		int x = 10;
		return "Hello From Maven";
	}

	public int add(int x, int y) {
		int result = 0;
		result = x + y;
		return result;
	}
}
