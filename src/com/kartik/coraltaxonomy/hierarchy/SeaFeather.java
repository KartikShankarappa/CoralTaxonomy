package com.kartik.coraltaxonomy.hierarchy;

public class SeaFeather extends AhermatypicCoral {

	private final int noOfFeathers;
	
	public SeaFeather(String name, int noOfPolyps, int noOfFeathers) {
		super(name, noOfPolyps);
		this.noOfFeathers = noOfFeathers;
	}
	
	/**
	 * A getter method to obtain the number of feathers
	 * @return number of feathers
	 */
	public int getNoOfFeathers(){
		return noOfFeathers;
	}
	
	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		SeaFeather obj = (SeaFeather) o;
		
		return getNoOfFeathers() == obj.getNoOfFeathers();
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 467 * hashValue + getNoOfFeathers();
		return hashValue;
	}

}
