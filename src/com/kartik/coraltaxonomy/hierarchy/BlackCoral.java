package com.kartik.coraltaxonomy.hierarchy;

public class BlackCoral extends AhermatypicCoral {
	
	private final int growthRate;

	public BlackCoral(String name, int noOfPolyps, int growthRate) {
		super(name, noOfPolyps);
		this.growthRate = growthRate;
	}
	
	/**
	 * A getter method to obtain the growth rate
	 * @return growth rate
	 */
	public int getGrowthRate(){
		return growthRate;
	}
	
	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		BlackCoral obj = (BlackCoral) o;
		
		return getGrowthRate() == obj.getGrowthRate();
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 419 * hashValue + getGrowthRate();
		return hashValue;
	}

}
