package com.mtit.postal.packagetypeimplement;

import com.mtit.postal.packagetypeservice.PackgeTypeImpl;
import com.mtit.postal.packagetypeservice.PublisherActivator;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Start service consumer");
		serviceReference = context.getServiceReference(PublisherActivator.class.getName());
		PackgeTypeImpl packageType = new PackgeTypeImpl("abc123", true, false );
		System.out.println("Package Type : "+packageType.packageTypeImpl("abc123", true, false ));
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop service consumer");
		context.ungetService(serviceReference);
	}

}
