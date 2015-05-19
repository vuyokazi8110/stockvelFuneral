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
import za.cput.wondo.conf.factory.MemberAddressFactory;
import za.cput.wondo.conf.factory.MemberIdentityFactory;
import za.cput.wondo.domain.MemberIdentity;
import za.cput.wondo.repository.MemberAddressRepository;
import za.cput.wondo.repository.MemberIdentityRepository;

/**
 *
 * @author sbm
 */


public class MemberIdentityServiceTest {
      private Long id;

    @Autowired
   MemberIdentityRepository repository;
         public Long Id;
         private String IdType;
    @Test
    public void testCreate() throws Exception {
        Map<String,String> values = new HashMap<String,String>();
        values.put("id",001);
        values.put("idtype", "Passport");
        //still to fix
        MemberIdentity memberIdentity = MemberIdentityFactory
                .createMemberIdentity(values,27);

        repository.save(memberIdentity);
        id=memberIdentity.getId();
        Assert.assertNotNull(MemberIdentity.getId());
    }
      
}
