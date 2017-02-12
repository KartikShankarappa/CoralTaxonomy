package com.kartik.coraltaxonomy;

public enum Oceans {
	PACIFIC(165250000),
	ATLANTIC(106400000),
	INDIAN(73560000),
	ANTARCTIC(20330000),
	ARCTIC(13990000);
	
	private final long area;
	
	private Oceans(long area)
	{
		this.area = area;
	}

	/**
	 * A method to obtain the area of the ocean
	 * @param oceans
	 */
	public static void getAreaOfOceans(Oceans... oceans)
	{
		for (Oceans ocean : oceans)
		{
			System.out.println("The area of the " + ocean + " ocean is " + ocean.getArea() + "kilometers squared");
		}
	}
	
	
	/**
	 * A getter method to obtain the area of the specified ocean
	 * @return
	 */
	public long getArea()
	{
		return area;
	}
	
	
	/**
	 * This method prints the area of all the oceans
	 * @param oceans variable number of parameters of type ocean
	 */

}
