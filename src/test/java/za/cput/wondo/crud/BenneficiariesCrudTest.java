/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.crud;

import org.testng.Assert;
import za.cput.wondo.domain.Benneficiaries;

/**
 *
 * @author sbm
 */
public class BenneficiariesCrudTest extends AbstractTestNGSpringContextTests {
     private int benId;
    @Autowired
    private BenneficiariesRepository repository;

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

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Benneficiaries = repository.findOne(benId);
        Assert.assertNotNull(benneficiaries);

    }

   // @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Benneficiaries benneficiaries = repository.findOne(benId);

        Benneficiaries newBenneficiaries = new Benneficiaries
                .Builder(benneficiaries.getBenNo())
                .copy(benneficiaries)
                .benNo(331020)
                .build();

        repository.save(newBenneficiaries);

        Benneficiaries updatedBenneficiaries = repository.findOne(benId);
        Assert.assertEquals(updatedBenneficiaries.getBenNo(),331020);

    }

  //  @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Benneficiaries benneficiaries = repository.findOne(benId);
        repository.delete(benneficiaries);
        Benneficiaries deletedBenneficiaries = repository.findOne(benId);
        Assert.assertNull(deletedBenneficiaries);

    }
}
