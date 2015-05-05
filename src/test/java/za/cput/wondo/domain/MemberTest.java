package za.cput.wondo.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import za.cput.wondo.domain.Member;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author sbm
 */
public class MemberTest {
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Before
    public void setUpMethod() throws Exception {
    }
     @Test
     public void Testmember()throws Exception {
        Member Member = new Member.Builder (101).numberOfDependants(2).Build();
        Assert.AssertEquals(2,Member.getNumberOfDependants());
    }

}
    