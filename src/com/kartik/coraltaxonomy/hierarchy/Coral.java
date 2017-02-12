/**
 * Below are the following assumptions:
 * The Coral class is the super class. HarmatypicCoral and AhermatypicCoral extends from the Coral class.
 * BrainCoral, Leptopsammia, PillarCoral and StaghornCoral extends from the HermatypicCoral class.
 * BlackCoral, SeaFeather, SeaPen and SeaWhip extends from the AhermatypicCoral class.
 * @author KARTIK
 *
 */

package com.kartik.coraltaxonomy.hierarchy;


public abstract class Coral {
	
	protected final String name;
	protected final int noOfPolyps;
	
	Coral(String name, int noOfPolyps) {
		this.name = name;
		this.noOfPolyps = noOfPolyps;
	}
	
	// Two abstract methods whose implementation is given in the HermatypicCoral and AhermatypicCoral class
	public abstract boolean isZooxanthella();
	public abstract boolean isPerforate();
	
	/**
	 * A getter method to obtain the name of the coral.
	 * @return name of the coral
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * A getter method to obtain the number of polyps
	 * @return number of polyps
	 */
	public int getNumberOfPolyps(){
		return noOfPolyps;
	}
	
	
	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		
		if(o == null || this.getClass() != o.getClass()){
			return false;
		}
		
		Coral obj = (Coral) o;
		
		return getName().equals(obj.getName()) &&
				getNumberOfPolyps() == obj.getNumberOfPolyps();
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override public int hashCode(){
		int hashValue = 83;
		hashValue = 89 * hashValue + (getName() != null ? getName().hashCode() : 0);
		hashValue = 97 * hashValue + getNumberOfPolyps(); 
		return hashValue;
	}
	
}

