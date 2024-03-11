package com.mtit.postal.packagetypeservice;

public class PackgeTypeImpl implements PackageType {
	
	String packageId;
	boolean express;
	boolean fragile;
	
	PU
	

	public String getPackageId() {
		return packageId;
	}



	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}



	public boolean isExpress() {
		return express;
	}



	public void setExpress(boolean express) {
		this.express = express;
	}



	public boolean isFragile() {
		return fragile;
	}



	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}



	@Override
	public String packageTypeImpl() {
		
		if (express = true)
			setPackageId("6");
		else if (express == false && fragile == true)
			setPackageId("7");
		else
			setPackageId("8");
		
		return getPackageId();
		
	}
	
	
}
