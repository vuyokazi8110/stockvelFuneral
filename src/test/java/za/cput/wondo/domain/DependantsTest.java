package za.cput.wondo.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author sbm
 */
public class DependantsTest {
    
    @Test
    public void testDependants() throws Exception {
        Dependants dependants = DependantsFactory
                .createDependants("1011","Mzukisi");
        Assert.assertEquals("1011",dependants.getDependantId());
    }

    @Test
    public void testUpdate() throws Exception {
        Dependants dependants = new Dependants.Builder("1011")
                .name("Mzukisi")
                .build();
        Dependants newdependants = new Dependants
                .Builder(dependants.getDependantId())
                .copy(dependants)
                .name("Lona").build();

        Assert.assertEquals("Lona",newdependants.getName());
        Assert.assertEquals(1011,newdependants.getDependantId());
        Assert.assertEquals(1011,dependants.getDependantId());
    }
}
