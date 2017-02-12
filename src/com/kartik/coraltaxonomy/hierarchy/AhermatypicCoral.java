/**
 * Following are the assumptions:
 * This type of coral receives a part of its energy from zooxanthella.
 * This type of coral are perforate corals i.e they have porous skeleton
 * Also, their skeletons are made up of Protein
 */

package com.kartik.coraltaxonomy.hierarchy;

public class AhermatypicCoral extends Coral {

	protected static final boolean IS_ZOOXANTHELLA = false;
	protected static final boolean IS_PERFORATE = true;
	
	protected final String skeletonType;
	
	public AhermatypicCoral(String name, int noOfPolyps)
	{
		super(name, noOfPolyps);
		this.skeletonType = CoralSkeleton.PROTEINACEOUS.getCoralSkeletonType();
	}
	
	/**
	 * A getter method to obtain the skeleton type of the coral
	 * @return the skeleton type
	 */
	public String getSkeletonType(){
		return skeletonType;
	}

	/**
	 * A method that tells if this type of coral takes energy from zooxanthella or not
	 */
	public boolean isZooxanthella() {
		return IS_ZOOXANTHELLA;
	}

	/**
	 * A method that tells if this type of coral has porors skeleton or not
	 */
	public boolean isPerforate() {
		return IS_PERFORATE;
	}
	
	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		AhermatypicCoral obj = (AhermatypicCoral) o;
		
		return getSkeletonType().equals(obj.getSkeletonType());
	}
	
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 353 * hashValue + ((getSkeletonType() != null) ? getSkeletonType().hashCode() : 0);
		return hashValue;
	}
}
