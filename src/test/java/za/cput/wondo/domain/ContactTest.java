package za.cput.wondo.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import za.cput.wondo.domain.Contact;
import junit.framework.Assert;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author sbm
 */
public class ContactTest {
    private Object Contact;
   
    
    public ContactTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
   public void testContact() {
       
         Contact con = new Contact.Builder("vwonwo@yahoo.com").CellNumber("0839750752").build();
         Assert.assertEquals(con.getCellNumber(),"0839750752");
         Assert.assertEquals(con.getEmail(), "vwonwo@yahoo.com");   
   }
   
   @org.testng.annotations.Test
    public void ContactTestUpdate() 
    {
        Contact con = new Contact.Builder("Romeo@yahoo.com").cellNumber("86767678778").build();
        Contact con2 = new Contact.Builder("Romfggfhghgeo@yahoo.com").email(con).cellNumber("4432-5435").email(con).build();
        Assert.assertEquals(con2.getCellNumber(),"4432-5435");
        Assert.assertEquals(con2.getEmail(), "Romfggfhghgeo@yahoo.com");
       
    }
}
