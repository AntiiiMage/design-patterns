/**
 * 
 */
package com.antiiimage.learning.designpattern.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Xu
 *
 *         Noninstantiable class for service registeration and access
 */
public class Services {

	private Services() {
	}

	private static final Map<Class, ServiceProvider> providers = new ConcurrentHashMap<Class, ServiceProvider>();

	// Provider registeration API
	public static void registerDefultProvider(ServiceProvider p) {
		registerProvider(p);
	}

	public static void registerProvider(ServiceProvider p) {
		providers.put(p.getClass(), p);
	}

	public static Service newInstance() {
		return providers.values().iterator().next().newService();
	}

	public static Service newInstance(Class classImp) {
		ServiceProvider p = providers.get(classImp);
		if (p == null) {
			throw new IllegalArgumentException("No provider registered with class: " + classImp.getName());
		}
		return p.newService();
	}

}
