package com.mtit.postal.packagetypeservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PublisherActivator implements BundleActivator {

	ServiceRegistration packageTypeRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
        System.out.println("Package Type Producer Bundle Started");
        PackgeTypeImpl packageType = new PackgeTypeImpl();
        packageTypeRegistration = context.registerService(
        		PackageType.class.getName(), packageType, null
        		);
        
        packageType.setPackageId("0");
        packageType.setFragile(false);
        packageType.setExpress(false);
        
        
        
		System.out.println("Package Type : "+packageType.packageTypeImpl());

        
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
        System.out.println("Package Type Producer Bundle Stopped");
	}

	
}