package com.antiiimage.learning.designpattern.factory;

import java.util.HashMap;

public class Maps {

	public static <K, V> HashMap<K, V> newInstance() {
		return new HashMap<K, V>();
	}

}
