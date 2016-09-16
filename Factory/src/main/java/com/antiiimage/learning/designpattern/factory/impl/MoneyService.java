package com.antiiimage.learning.designpattern.factory.impl;

import com.antiiimage.learning.designpattern.factory.Service;

public class MoneyService implements Service {

	public String getClassName() {
		return this.getClass().getName();
	}

}
