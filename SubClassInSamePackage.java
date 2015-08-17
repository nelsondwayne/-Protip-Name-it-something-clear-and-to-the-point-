public class SubClassInSamePackage extends BaseClass {
	
	public static void main( String args[]) {
		BaseClass rr = new BaseClass (); 
		rr.z = 0;
		SubClassInSamePackage subClassObj = new SubClassInSamePackage();
		//Access Modifiers - Public
	System.out.println("Value of x is : " + subClassObj.x);
	subClassObj.setX(20);
	System.out.println("Value of x is : " + subClassObj.x); 
	//Access Modifiers - Public
	//       If we remove the comments it would result in a compilation
	//       error as the fields and methods being accessed are private
   //       System.out.println("Value of y is : " +subClassObj.y);
	
	subClassObj.setY();	
	}


}
