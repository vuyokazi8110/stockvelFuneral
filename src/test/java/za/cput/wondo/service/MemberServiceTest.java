/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.service;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.cput.wondo.conf.factory.ContactFactory;
import za.cput.wondo.conf.factory.DependantsFactory;
import za.cput.wondo.conf.factory.MemberAddressFactory;
import za.cput.wondo.conf.factory.MemberFactory;
import za.cput.wondo.conf.factory.MemberNameFactory;
import za.cput.wondo.conf.factory.PoliciesFactory;
import za.cput.wondo.domain.Contact;
import za.cput.wondo.domain.Dependants;
import za.cput.wondo.domain.Member;
import za.cput.wondo.domain.MemberAddress;
import za.cput.wondo.domain.MemberName;
import za.cput.wondo.domain.Policies;
import za.cput.wondo.repository.MemberRepository;
import za.cput.wondo.services.MemberService;

//author vee

public class MemberServiceTest extends AbstractTestNGSpringContextTests {   
     @Autowired
    private MemberService service;
    private Long id;
    @Autowired
    private MemberRepository repository;
    private List<Dependants> dependants;
    private List<Policies> policies;
     @BeforeMethod
     public void setUp() throws Exception {
        dependants = new ArrayList<Dependants>();
        policies = new ArrayList<Policies>();      
    }
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
    @Test
    public void testGetMemberDependants() throws Exception {
        List<Dependants> dependants = service.getDependants(id);
        Assert.assertTrue(dependants.size() == 6);
    }
}
