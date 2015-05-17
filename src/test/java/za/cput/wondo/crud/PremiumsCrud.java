/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.crud;

/**
 *
 * @author sbm
 */
public class PremiumsCrud extends AbstractTestNGSpringContextTests{
    private Long id;
    @Autowired
    private PremiumsRepository repository;
    @Test
    public void create() throws Exception {
        Premiums premiums = PremiumsFactory
                .createPremiums("January", 100);
        repository.save(premiums);
        id=premiums.getId();
        Assert.assertNotNull(premiums);
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Premiums premiums = repository.findOne(id);
        Assert.assertNotNull(premiums);

    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {

    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Premiums premiums = repository.findOne(id);
        repository.delete(premiums);
        Premiums deletedpremium = repository.findOne(id);
        Assert.assertNull(deletedpremium);

    }{
    
}
