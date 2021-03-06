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
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import za.cput.wondo.conf.factory.PoliciesFactory;
import za.cput.wondo.domain.Claims;
import za.cput.wondo.domain.Policies;
import za.cput.wondo.repository.PoliciesRepository;

/**
 *
 * @author sbm
 */
public class PoliciesCrud extends AbstractTestNGSpringContextTests{
    private Long id;
    @Autowired
    private PoliciesRepository repository;
    @Test
    public void create() throws Exception {
        Map<int, int> values = new HashMap<int, int>();
        values.put("policynumber",1011);
        values.put("policyName","Accidental");
        Policies policies = policiesFactory
                .createPolicies(values,2);
        
        repository.save(policies);
        PolicyNo=policies.getPolicyNo();
        Assert.assertNotNull(policies);
    }
    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Policies policies = repository.findOne(id);
        Assert.assertNotNull(policies);
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {

    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Policies policies = repository.findOne(id);
        repository.delete(policies);
        Policies deletedpolicies = repository.findOne(id);
        Assert.assertNull(deletedpolicies);

    }
    
}
