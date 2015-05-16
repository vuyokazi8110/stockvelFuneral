/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.domain;

import org.testng.Assert;
import za.cput.wondo.conf.factory.DemographicsFactory;

/**
 *
 * @author sbm
 */
public class DemographicsTest {
       @Test
    public void testCreate() throws Exception {
        Demographics demographics = DemographicsFactory
                .createDemographics("white","male");
        Assert.assertEquals("white",demographics.getGender());
    }

    @Test
    public void testUpdate() throws Exception {
        Demographics demographics = new Demographics.Builder("white")
                .gender("male")
                .build();
        Demographics newdemographics = new Demographics
                .Builder(demographics.getRace())
                .copy(demographics)
                .gender("female")
                .build();

        Assert.assertEquals("female",newdemographics.getGender());
        Assert.assertEquals("white",newdemographics.getRace());
        Assert.assertEquals("white",demographics.getRace());


    }
    
}
