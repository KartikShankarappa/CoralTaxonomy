package com.kartik.coraltaxonomy.hierarchy;

public enum CoralSkeleton {
	
	PROTEINACEOUS("Proteinaceous"),
	CALCAREOUS("Calcareous");
	
	private String skeletonType;
	
	private CoralSkeleton(String skeletonType){
		this.skeletonType = skeletonType;
	}
	
	public String getCoralSkeletonType(){
		return skeletonType;
	}

}
