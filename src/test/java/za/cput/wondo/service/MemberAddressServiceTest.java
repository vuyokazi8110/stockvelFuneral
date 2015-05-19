/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.service;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.cput.wondo.conf.factory.ContactFactory;
import za.cput.wondo.conf.factory.MemberAddressFactory;
import za.cput.wondo.domain.Contact;
import za.cput.wondo.domain.MemberAddress;
import za.cput.wondo.repository.ContactRepository;
import za.cput.wondo.repository.MemberAddressRepository;

/**
 *
 * @author sbm
 */
public class MemberAddressServiceTest {
       private Long id;

    @Autowired
   MemberAddressRepository repository;
        private String email;
        private String postalCode;
    @Test
    public void testCreate() throws Exception {
        Map<String,String> values = new HashMap<String,String>();
        values.put("email","vuyokaziwondo@yahoo.com");
        values.put("postalCode", 7441);
        
        MemberAddress memberAddress = MemberAddressFactory
                .createMemberAddress(values,27);

        repository.save(MemberAddress);
        email=memberAddress.getEmail();
        Assert.assertNotNull(contact.getEmail());
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
