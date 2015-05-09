/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.crud;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import za.cput.wondo.domain.Claims;
import za.cput.wondo.domain.Dependants;
import za.cput.wondo.repository.ClaimsRepository;
import za.cput.wondo.repository.DependantsRepository;

/**
 *
 * @author sbm
 */
public class ClaimsCrudTest extends AbstractTestNGSpringContextTests{
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

    @Test(dependsOnMethods = "create")
    public void testRead() throws Exception {
        Claims claims = repository.findOne(memberNo);
        repository.save(claims);
        Assert.assertNotNull(claims);
       
    }

    @Test(dependsOnMethods = "read")
    public void testUpdate() throws Exception {

        Claims claims = repository.findOne(memberNo);
        Claims newClaims = new Claims
                .Builder(claims.getMemberNo())
                .copy(claims)
                .policyNo(55523)
                .build();
        
        repository.save(newClaims);
        Claims updatedClaims = repository.findOne(memberNo);
        Assert.assertEquals(updatedClaims.getPolicyNo(),55523);

    }

    @Test(dependsOnMethods = "update")
    public void testDelete() throws Exception {
        Claims claims = repository.findOne(memberNo);
        repository.delete(claims);
        ClaimsRepository deletedClaims = repository.findOne(memberNo);
        Assert.assertNull(deletedClaims);

    }
    
}
