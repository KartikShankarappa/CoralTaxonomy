package com.kartik.coraltaxonomy.hierarchy;

public class Test{

	public static void main(String[] args) {
	
//	BrainCoral b1 = new BrainCoral("someReef",6, 10, 15);
//	BrainCoral b2 = new BrainCoral("someReef",6, 10, 15);
//	BrainCoral b3 = new BrainCoral("someRef",7, 10, 15);
	
	SeaWhip b1 = new SeaWhip("someReef", 6, "yellow");
	SeaWhip b2 = new SeaWhip("someReef", 6, "yellow");
	SeaWhip b3 = new SeaWhip("someReef", 6, "yellow");
//
////	BlackCoral bl4 = new BlackCoral("someReef",6);
////	BlackCoral bl5 = new BlackCoral("someRef",6);
////
////
////	PillarCoral p1 = new PillarCoral("someeef",100000);
////	PillarCoral p2 = new PillarCoral("someReef",9000);
////	PillarCoral p3 = new PillarCoral("someReef",9000);
////
	System.out.println(b1.getName());
	System.out.println(b1.getNumberOfPolyps());
	System.out.println(b1.getSkeletonType());
	System.out.println(b1.isZooxanthella());
	System.out.println(b1.isPerforate());
		System.out.println("====");
		System.out.println("brain corals:");

		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));

		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());

//
//		System.out.println("====");
//
//		System.out.println("pillar corals:");
//
//		System.out.println(p1.equals(p2));
//		System.out.println(p2.equals(p3));
//
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p3.hashCode());
//
//
//				System.out.println("====");
//
//
//		
//				//System.out.println(b3.toString());
//
//
//System.out.println("====");
//			
//System.out.println(CoralSkeleton.PROTEINACEOUS);
//System.out.println(CoralSkeleton.PROTEINACEOUS.hashCode());
//
//System.out.println(CoralSkeleton.CALCAREOUS);
//System.out.println(CoralSkeleton.CALCAREOUS.hashCode());
//
//System.out.println("====");
//System.out.println(b1.equals(b2));
//System.out.println(b2.equals(b3));
//System.out.println("====");
//		System.out.println(b1.equals(bl4));
//		System.out.println(b2.equals(bl5));
//
//		System.out.println(b1.getClass().getName());
//		System.out.println(b3.getClass().getName());
//		System.out.println(bl4.getClass().getName());
//		System.out.println(bl5.getClass().getName());
//		System.out.println(p1.getClass().getName());
//		System.out.println(p2.getClass().getName());
//
//*/
//
//		BrainCoral b1 = new BrainCoral("someReef",6,70);
//		BrainCoral b2 = new BrainCoral("someReef",6,80);
//		BrainCoral b3 = new BrainCoral("someReef",6,80);
//
//				System.out.println(b1.equals(b2));
//		System.out.println(b2.equals(b3));
//		System.out.println(b2.toString());
//System.out.println("====");
//
//
//	PillarCoral p1 = new PillarCoral("someReef",67,6);
//		PillarCoral p2 = new PillarCoral("someReef",6,6);
//		PillarCoral p3 = new PillarCoral("someReef",6,6);
//		System.out.println(p1.equals(p2));
//		System.out.println(p2.equals(p3));
//		System.out.println(p2.toString());
//						System.out.println(b1.equals(p1));
//
//	System.out.println("====");					
//
//Leptopsammia l1 = new Leptopsammia("someReef",6,60);
//		Leptopsammia l2 = new Leptopsammia("someReef",6,60);
//		Leptopsammia l3 = new Leptopsammia("someReef",6,70);
//		System.out.println(l1.equals(l2));
//		System.out.println(l2.equals(l3));
//		System.out.println(l2.toString());
//						System.out.println(l3.equals(p3));


	}

}