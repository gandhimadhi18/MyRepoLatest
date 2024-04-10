package Sample1;

import org.testng.annotations.Test;

public class Work {
     @Test()
     public void WorkFromOffice()
     {
    	 System.out.println("Work from office mode");
    	      }
     @Test
     public void WorkFromHome()
     {
    	 System.out.println("Work from home mode");
     }
     @Test
     public void WorkatWeekend()
     {
    	 System.out.println("Weekend work only");
     }
          @Test
     public void Hybrid()
     {
    	 System.out.println("This is Hybrid work mode");
     }
}

