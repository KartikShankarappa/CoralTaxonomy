package com.kartik.coraltaxonomy.hierarchy;

public class SeaPen extends AhermatypicCoral {

	private final int depth;
	
	public SeaPen(String name, int noOfPolyps, int depth) {
		super(name, noOfPolyps);
		this.depth = depth;
	}
	
	/**
	 * A getter method to obtain the depth
	 * @return the depth
	 */
	public int getDepth(){
		return depth;
	}
	
	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		SeaPen obj = (SeaPen) o;
		
		return getDepth() == obj.getDepth();
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 547 * hashValue + getDepth();
		return hashValue;
	}

}
