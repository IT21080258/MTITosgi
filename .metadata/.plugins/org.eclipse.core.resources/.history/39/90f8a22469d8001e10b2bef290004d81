package com.mtit.postal.packagetypeservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PublisherActivator implements BundleActivator {

	ServiceRegistration packageTypeRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
        System.out.println("Package Type Producer Bundle Started");
        PackageType packageType = new PackgeTypeImpl("abc123", true, false );
        packageTypeRegistration = context.registerService(
        		PackageType.class.getName(), packageType, null
        		);
        System.out.println(packageType);

        
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
        System.out.println("Package Type Producer Bundle Stopped");
	}

	
}