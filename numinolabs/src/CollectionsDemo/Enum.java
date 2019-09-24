package CollectionsDemo;
enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}
public class Enum {



		  public static void main(String[] args) {
		    Level myVar = Level.MEDIUM;
            
            
		    switch(myVar) {
		      case LOW:
		        System.out.println("Low ");
		        break;
		      case MEDIUM:
		         System.out.println("Medium ");
		        break;
		      case HIGH:
		        System.out.println("High");
		        break;
		    }
		  }
		}