class DogTestDrive {
public static void main(String[] arguments){
	int [] dog = { 8,35, 70 };
	int [] pitbull = new int [dog.length];
	int [] total = new int [dog.length];
	int average;
	
	dog[0]  = 8;
	dog[1]  = 35;
	dog[2]  = 70;
			
	total[0]= dog[0] + pitbull[0];
	total[1]= dog[1] + pitbull[1];
	total[2]= dog[2] + pitbull[2];
	average = (total [0] + total [1] + total[2]) /3;
	
	System.out.print("size: ");
	System.out.format("%, d%n", total[0]);
	System.out.print("size: ");
	System.out.format("%, d%n", total[1]);
	System.out.print("size: ");
	System.out.format("%, d%n", total[2]);
	System.out.print("Average size: ");	
	System.out.format("%, d%n", average);
	}
}


	
