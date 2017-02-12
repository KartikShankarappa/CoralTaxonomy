package com.kartik.coraltaxonomy.hierarchy;

public class Leptopsammia extends HermatypicCoral {

	private final int foundAtDepth;
	
	public Leptopsammia(String name, int noOfPolyps, int foundAtDepth, boolean isHexacorallia) {
		super(name, noOfPolyps, isHexacorallia);
		this.foundAtDepth = foundAtDepth;
	}
	
	/**
	 * A getter method to obtain the depth at which this coral is found
	 * @return
	 */
	public int getFoundAtDepth(){
		return foundAtDepth;
	}
	
	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		Leptopsammia obj = (Leptopsammia) o;
		
		return getFoundAtDepth() == obj.getFoundAtDepth();
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 233 * hashValue + getFoundAtDepth();
		return hashValue;
	}

}
