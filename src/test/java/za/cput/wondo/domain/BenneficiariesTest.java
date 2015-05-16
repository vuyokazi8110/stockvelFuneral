/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.domain;

import org.junit.Test;
import org.testng.Assert;
import za.cput.wondo.conf.factory.BenneficiariesFactory;

/**
 *
 * @author sbm
 */
public class BenneficiariesTest { 
    @Test
    public void testBenneficiaries() throws Exception {
        Benneficiaries benneficiaries = BenneficiariesFactory
                .createBenneficiaries("1010","Inotando Wondo");
        Assert.assertEquals("1010",benneficiaries.getBenId());
    }

    @Test
    public void testUpdate() throws Exception {
        Benneficiaries benneficiaries = new Benneficiaries.Builder("1010")
                .name("Inotando Wondo")
                .benId(new Long(3))
                .build();
        Benneficiaries newbenneficiaries = new Benneficiaries
                .Builder(benneficiaries.getBenCode())
                .copy(benneficiaries)
                .name("Vuvu").build();

        Assert.assertEquals("Vuvu",newbenneficiaries.getName());
        Assert.assertEquals(1010,newbenneficiaries.getBenId());
        Assert.assertEquals(1012,benneficiaries.getBenId());
    }
}
