/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.domain;

import org.junit.Test;
import org.testng.Assert;
import za.cput.wondo.conf.factory.ClaimsFactory;

/**
 *
 * @author sbm
 */
public class ClaimsTest {
     @Test
    public void testCreate() throws Exception {
        Claims claims = ClaimsFactory
                .createClaims(1010,"funeral policy");
        Assert.assertEquals(1010,claims.getMemberNo());
    }

    @Test
    public void testUpdate() throws Exception {
        Claims claims = new Claims.Builder(1010)
                .name("funeral Policy")
                .build();
        Claims newclaims = new Claims
                .Builder(claims.getMemberNo())
                .copy(claims)
                .name("accidental").build();

        Assert.assertEquals("accidental",newclaims.getName());
        Assert.assertEquals(1010,newclaims.getMemberNo());
        Assert.assertEquals(1010,claims.getMemberNo());


    }
    
}
