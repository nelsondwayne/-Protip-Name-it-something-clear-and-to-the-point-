class Example{
	public static void main(String[] arguments) {
		int price;
		for (int width = 11; width <=25; width +=5){
			
			for (int length = 5; length <=25; length +=5){
				
				price = width * length * 19; 
				System.out.print(" " + price);
			}
			System.out.println(" ");
		}
			
	}	
}
				