class GoodDog {
	int size; 
	
	public void SetSize(int size){
		this.size = size; }
	public void GetSize (){
	
		System.out.println("This is the size" + size);
	}
	public void bark () {
		System.out.println("Roof!Roof!");
		}
	

	
	public static void main  (String[] arguments){
GoodDog Pitbull = new GoodDog();
GoodDog Butch = new GoodDog ();

Butch.SetSize(8);
Butch.GetSize();
Butch.bark();



Pitbull.SetSize(70);
Pitbull.GetSize();
Pitbull.bark();
	}
}



			
	