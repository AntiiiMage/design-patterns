package com.antiiimage.learning.designpattern.factory;

import java.util.HashMap;

import com.antiiimage.learning.designpattern.factory.impl.DefultBusinessServiceProvider;
import com.antiiimage.learning.designpattern.factory.impl.MoneyServieProvider;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Services.registerDefultProvider(new DefultBusinessServiceProvider());
		Service defultService = Services.newInstance();
		System.out.println(defultService.getClassName());
		Services.registerProvider(new MoneyServieProvider());
		Service moneyService = Services.newInstance(MoneyServieProvider.class);
		System.out.println(moneyService.getClassName());

		// Test type inference
		HashMap<String, Service> serviceMap = Maps.newInstance();
		serviceMap.put("def", defultService);
		serviceMap.put("money", moneyService);
		serviceMap.toString();
	}
}
