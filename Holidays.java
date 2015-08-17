import java.util.*;

public class Holidays {
	BitSet sked;
	
	public Holidays() {
		sked = new BitSet(365);	
		int[] holiday = {1,15,50, 148, 185, 246,
				281, 316, 326, 359 };
			for(int i=0;  i < holiday.length; i++) {
				addHoliday(holiday[i]); 
			}
	}
				
	public void addHoliday(int DayToAdd){
		sked.set(DayToAdd); 
	}
		public boolean isHoliday(int DayTOCheck){
			boolean result = sked.get(DayTOCheck);
			return result;
		}
		public static void main(String[]  arguments) {
			Holidays cal = new Holidays();
			if(arguments.length > 0) {
				try {
					int whichday = Integer.parseInt(arguments[0]);
					if (cal.isHoliday(whichday)) {
						System.out.println("Day number " + whichday + 
								" is a holiday.");
					} else {
						System.out.println("Day number " + whichday +
								" is not a holiday.");
					}
				} catch (NumberFormatException nfe) {
					System.out.println("Error: " + nfe.getMessage());
				}
			}
		}
	}