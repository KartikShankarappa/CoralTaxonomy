package com.kartik.coraltaxonomy.hierarchy;

public class PillarCoral extends HermatypicCoral {
	
	private final int height;
	
	public PillarCoral(String name, int noOfPolyps, int height, boolean isHexacorallia) {
		super(name, noOfPolyps, isHexacorallia);
		this.height = height;
	}
	
	/**
	 * A getter method to obtain the height of the Coral
	 * @return the height
	 */
	public int getHeight(){
		return height;
	}
	
	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		PillarCoral obj = (PillarCoral) o;
		
		return getHeight() == obj.getHeight();
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 283 * hashValue + getHeight();
		return hashValue;
	}


}
