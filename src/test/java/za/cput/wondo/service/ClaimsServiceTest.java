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
import za.cput.wondo.domain.Claims;
import za.cput.wondo.repository.ClaimsRepository;

/**
 *
 * @author sbm
 */
public class ClaimsServiceTest {
    
   private int memberNo;
    @Autowired
    ClaimsRepository repository;
    
    @Test
    public void testCreate() throws Exception {
        Map<int, int> values = new HashMap<int, int>();
        values.put("memberNo",001);
        values.put("policyNo",55501);
        Claims claims = ClaimsFactory
                .createClaims(values,2);

        repository.save(claims);
        memberNo=claims.getMemberNo();
        Assert.assertNotNull(claims.getMemberNo());
    }

}
