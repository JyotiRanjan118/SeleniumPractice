package MyPracticeSelenium.SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	 List<String> selectedTiresForCompare = new ArrayList<String>();
    	 selectedTiresForCompare.add("Babu");
    	 selectedTiresForCompare.add("Jyoti");

         
         List<String> tiresOnComparePage = new ArrayList<String>();
         tiresOnComparePage.add("Babu");
         tiresOnComparePage.add("Jyoti");
        
         
         Assert.assertEquals(tiresOnComparePage, selectedTiresForCompare);
       }
}
