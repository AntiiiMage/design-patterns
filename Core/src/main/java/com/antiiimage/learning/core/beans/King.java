package com.antiiimage.learning.core.beans;


// Singleton design pattern
public class King {
	private static King king;
	
	//not good way if concurrency is heavey
//	synchronized public static King getInstance(){
//		if(king == null){
//			king = new King();
//		}
//		return king;
//	}
	
	public static King getInstance(){
		if(king == null){
			synchronized (King.class) {
				king = new King();
			}
		}
		return king;
	}
	
	private King(){
		System.out.println("I am a King!");
	}
}
