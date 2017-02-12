/**
 * Following are the assumptions:
 * This type of coral DOES NOT receive a part of its energy from zooxanthella.
 * This type of coral are NOT perforate corals i.e they DONOT have porous skeleton
 * Their skeletons are made up of Calcium
 * They may or may not have 6 or fewer lines of symmetry
 */

package com.kartik.coraltaxonomy.hierarchy;

public abstract class HermatypicCoral extends Coral {
	
	protected static final boolean IS_ZOOXANTHELLA = true;
	protected static final boolean IS_PERFORATE = false;
	
	protected final boolean isHexacorallia;
	protected final String skeletonType;
	
	
	public HermatypicCoral(String name, int noOfPolyps, boolean isHexacorallia){
		super(name, noOfPolyps);
		this.skeletonType = CoralSkeleton.CALCAREOUS.getCoralSkeletonType();
		this.isHexacorallia = isHexacorallia;
	}

	/**
	 * A getter method to obtain the skeleton type
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
	 * A method that tells if this type of coral has 6 or fewer lines of symmetry
	 */
	public boolean isHexacorallia() {
		return isHexacorallia;
	}
	

	/**
	 * This method checks if the two specified objects are equal or not.
	 */
	@Override
	public boolean equals(Object o){
		
		if(!super.equals(o)){
			return false;
		}
		
		HermatypicCoral obj = (HermatypicCoral) o;
		
		return getSkeletonType().equals(obj.getSkeletonType()) &&
				isHexacorallia() == obj.isHexacorallia();
	}
	
	/**
	 * This method generates a hash code (an int) with the help of certain prime numbers
	 */
	@Override
	public int hashCode(){
		
		int hashValue = super.hashCode();
		hashValue = 73 * hashValue + (isHexacorallia() ? 23 : 29);
		hashValue = 127 * hashValue + ((getSkeletonType() != null) ? getSkeletonType().hashCode() : 0);
		return hashValue;
	}

}
