public class MyOwnException {
	public static void main(String[] a){
		try{
			MyownException.myTest("this is a test"); //test not null string
			MyOwnException.myTest(null); //test null string w/ exception
			
		}catch(MyAppException mae){
			System.out.println("Inside catch block: "+mae.getMessage());
		}
	}//end of main
	
	static void myTest(String str) throws MyAppException{
		if(str == null){
			throw new MyAppException("String val is null");
		}else {
			System.out.println("All's good!");
		}
	}//end of MyTest
}//end of class MyOwnException

class MyAppException extends Exception{
	
	private static String message = null;
	public MyAppException() {
		super(message);
		this.message = message;
    
	
	public MyAppException(String message) {
        super(cause);
        }
	
    
    
    @Override
    public String getMessage() {
    	return message;
    }
    }// end of class MyAppException
    }
        
        


			
		
