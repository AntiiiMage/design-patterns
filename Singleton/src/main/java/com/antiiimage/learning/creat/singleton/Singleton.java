package com.antiiimage.learning.creat.singleton;


//Best way to create singleton instance
public enum Singleton {
	INSTANCE;
	
	public void initCache(){
		System.out.println("initCache()");
	}

}
