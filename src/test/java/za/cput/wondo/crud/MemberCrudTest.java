/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.testng.Assert;
import za.cput.wondo.conf.factory.DependantsFactory;
import za.cput.wondo.conf.factory.MemberAddressFactory;
import za.cput.wondo.conf.factory.MemberNameFactory;
import za.cput.wondo.conf.factory.PoliciesFactory;
import za.cput.wondo.domain.Contact;
import za.cput.wondo.domain.Dependants;
import za.cput.wondo.domain.Member;
import za.cput.wondo.domain.MemberAddress;
import za.cput.wondo.domain.MemberName;
import za.cput.wondo.domain.Policies;

/**
 *
 * @author sbm
 */
public class MemberCrudTest extends AbstractTestNGSpringContextTests{
          private Long id;

    @Autowired
    private MemberRepository repository;

    @Test
    public void create() throws Exception {
        
        Contact cont = ContactFactory
                .createContact("dept@test.com", 0215564352);
        MemberName mName = MemberNameFactory
                .createMemberName("Vuyo", "Wondo");
        
        MemberAddress adr = MemberAddressFactory
                .createMemberAddress("120 Ngena street", "p'0 box 24");
       
        Policies funeralPolicy = PoliciesFactory
                .createPolicies(102, "funeral");
        
        Policies accidentalPolicy = PoliciesFactory
                .createPolicies(10011, "Accidental");
        
        List<Policies> policies = new ArrayList<Policies>();
        policies.add(funeralPolicy);
        policies.add(accidentalPolicy);
        
        
        Dependants funeralDependant = DependantsFactory
                .createDependants(funeralDependant,10,null);
        
        Dependants accidentDependant = DependantsFactory
                .createDependants(accidentDependant,20,null);
        
        List<Dependants> dependants = new ArrayList<Dependants>();
        dependants.add(funeralDependant);
        dependants.add(accidentDependant);
        
        
        
        Member member = MemberFactory
                .createMember(memberAddress,dependants,123);
        repository.save(member);
        id=member.getId();
        Assert.assertNotNull(member.getId());

    }

   // @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Member member = repository.findOne(id);
        Assert.assertNotNull(member.getId());
        Assert.assertEquals(5, member.getNumberOfDependants().getPostalAddress());
        Assert.assertTrue(member.getDependants().size() == 2);

    }

    //@Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Member member = repository.findOne(id);

        Member newMember = new Member
                .Builder(member.getId())
                .copy(member)
                .numberOfDependants(6)
                .build();

        repository.save(newMember);

        Member updatedMember = repository.findOne(id);
        Assert.assertEquals(updatedMember.getNumberOfDependants(),6);

    }

   // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Member member = repository.findOne(id);
        repository.delete(member);
        Member deletedMember = repository.findOne(id);
        Assert.assertNull(deletedMember);

    }
    
}
