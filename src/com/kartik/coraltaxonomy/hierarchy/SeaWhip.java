package com.kartik.coraltaxonomy.hierarchy;

public class SeaWhip extends AhermatypicCoral {

	private String color;
	
	public SeaWhip(String name, int noOfPolyps, String color) {
		super(name, noOfPolyps);
		this.color = color;
	}
	
	/**
	 * A getter method to obtain the color of the coral
	 * @return
	 */
	public String getColor(){
		return color;
	}
	

	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		SeaWhip obj = (SeaWhip) o;
		
		return getColor().equals(obj.getColor());
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 607 * hashValue + (getColor() != null ? getColor().hashCode() : 0);
		return hashValue;
	}

}
