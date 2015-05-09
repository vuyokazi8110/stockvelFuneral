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
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.cput.wondo.domain.Dependants;
import za.cput.wondo.repository.DependantsRepository;

/**
 *
 * @author sbm
 */
public class DependantsCrud { private Long id;

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

    @Test(dependsOnMethods = "create")
    public void testRead() throws Exception {
        Dependants dependants = repository.findOne(dependantId);
        repository.save(dependants);
        Assert.assertNotNull(dependants);
       
    }

    @Test(dependsOnMethods = "read")
    public void testUpdate() throws Exception {

        Dependants dependants = repository.findOne(dependantsId);
        Dependants newDependants = new Dependants
                .Builder(dependants.getDependantId())
                .copy(dependants)
                .dependantCode(10)
                .build();
        
        repository.save(newDependants);
        Dependants updatedDependants = repository.findOne(id);
        Assert.assertEquals(updatedDependants.getDependantCode(),10);

    }

    @Test(dependsOnMethods = "update")
    public void testDelete() throws Exception {
        Dependants dependants = repository.findOne(Id);
        repository.delete(dependants);
        DependantsRepository deletedDependants = repository.findOne(Id);
        Assert.assertNull(deletedDependants);

    }
}
