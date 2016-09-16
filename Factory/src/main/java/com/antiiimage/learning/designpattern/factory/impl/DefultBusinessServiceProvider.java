package com.antiiimage.learning.designpattern.factory.impl;

import com.antiiimage.learning.designpattern.factory.Service;
import com.antiiimage.learning.designpattern.factory.ServiceProvider;

public class DefultBusinessServiceProvider implements ServiceProvider {

	public Service newService() {
		return new DefaultBusinessService();
	}

}
