/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.domain;

import org.junit.Test;
import org.testng.Assert;
import za.cput.wondo.conf.factory.ContactFactory;
import za.cput.wondo.conf.factory.MemberFactory;

/**
 *
 * @author sbm
 */
public class MemberAddressTest {
    
   @Test
    public void testCreate() throws Exception {
        MemberAddress address = ContactFactory
                .createContact("test@test.com","7557");
        Assert.assertEquals("test@test.com",address.getEmail());
    }

    @Test
    public void testUpdate() throws Exception {
        MemberAddress address = ContactFactory
                .createMemberAddress("test@test.com","7557");

        MemberAddress copiedaddress = new MemberAddress
                .Builder("test@test.comm").copy(address).postalCode("700").build();
        Assert.assertEquals("test@test.com",address.getEmail());
        Assert.assertEquals("test@test.com",copiedaddress.getEmail());
        Assert.assertEquals("7557",address.getPostalCode());
        Assert.assertEquals("700",copiedaddress.getPostalCode());
    }
    
}
