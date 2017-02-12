package com.kartik.coraltaxonomy.hierarchy;

public class StaghornCoral extends HermatypicCoral {
	
	private final int branchLength;

	public StaghornCoral(String name, int noOfPolyps, int branchLength, boolean isHexacorallia) {
		super(name, noOfPolyps, isHexacorallia);
		this.branchLength = branchLength;
	}
	
	/**
	 * A getter method to obtain the length of the branch
	 * @return length of the branch
	 */
	public int getBranchLength(){
		return branchLength;
	}
	

	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		StaghornCoral obj = (StaghornCoral) o;
		
		return getBranchLength() == obj.getBranchLength();
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 233 * hashValue + getBranchLength();
		return hashValue;
	}

}
