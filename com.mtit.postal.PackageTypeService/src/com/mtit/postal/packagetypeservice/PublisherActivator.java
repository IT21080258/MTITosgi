package com.mtit.postal.packagetypeservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class PublisherActivator implements PackageType,BundleActivator {

	@Override
	public int packageType(String packageId, Boolean express, Boolean fragile) {
		int pkgType = 0;
		if (express = true) {
		  pkgType = 1;
		}
		else if (express = false){
			if (fragile = true){
				pkgType = 1;
			}
			else
				pkgType = 2;
		}
		return pkgType;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		context.registerService(PackageType.class, this , null);
        System.out.println("Package Type Producer Bundle Started");
        int pkgtype = this.packageType("ABC123",true,false);
        System.out.println(pkgtype);
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
        System.out.println("Package Type Producer Bundle Stopped");
	}

	
}