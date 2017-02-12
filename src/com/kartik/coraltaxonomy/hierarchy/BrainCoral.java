package com.kartik.coraltaxonomy.hierarchy;

public class BrainCoral extends HermatypicCoral{

	private final int width;
	
	public BrainCoral(String name, int noOfPolyps, int width, boolean isHexacorallia) {
		super(name, noOfPolyps, isHexacorallia);
		this.width = width;
	}
	
	/**
	 * A getter method to obtain the width
	 * @return width
	 */
	public int getWidth(){
		return width;
	}
	
	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		BrainCoral obj = (BrainCoral) o;
		
		return getWidth() == obj.getWidth();
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 179 * hashValue + getWidth();
		return hashValue;
	}

}
