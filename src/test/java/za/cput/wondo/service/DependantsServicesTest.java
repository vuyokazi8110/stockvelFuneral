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
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.cput.wondo.conf.factory.DependantsFactory;
import za.cput.wondo.domain.Dependants;
import za.cput.wondo.repository.DependantsRepository;

/**
 *
 * @author sbm
 */
public class DependantsServicesTest extends AbstractTestNGSpringContextTests { 
    private Long id;

    @Autowired
   DependantsRepository repository;
    private int dependantId;
    private Long Id;
    @Test
    public void testCreate() throws Exception {
        Map<int, int> values = new HashMap<int, int>();
        values.put("dependantId",001);
        Dependants dependants = DependantsFactory
                .createDependants(values,27);

        repository.save(dependants);
        Id=dependants.getId();
        Assert.assertNotNull(dependants.getId());
    }
    
   
}
