/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.service;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.cput.wondo.conf.factory.BenneficiariesFactory;
import za.cput.wondo.domain.Benneficiaries;

/**
 *
 * @author sbm
 */
public class BenneficiariesServiceTest extends AbstractTestNGSpringContextTests {
    
    @Test
    public void create() throws Exception {
        Map<String,String> values = new HashMap<String,String>();
        values.put("benId",8110200699089);
        values.put("benNo", 8110);
        Benneficiaries benneficiaries = BenneficiariesFactory
                .createBenneficiaries(values,6);

        repository.save(benneficiaries);
        benId=benneficiaries.getBenId();
        Assert.assertNotNull(benneficiaries.getBenId());
    }
}
