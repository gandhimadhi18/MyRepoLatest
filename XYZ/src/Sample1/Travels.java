package Sample1;

import org.testng.annotations.Test;

public class Travels {
     @Test
     public void Bus()
     {
    	 System.out.println("This is Bus travel");
     }
     @Test
     public void Train()
     {
    	 System.out.println("This is Train travel");
     }
     @Test
     public void Flight()
     {
    	 System.out.println("This is Flight travel");
     }
     @Test
     public void NoTravel()
     {
    	 System.out.println("There is no travel");
     }
}

