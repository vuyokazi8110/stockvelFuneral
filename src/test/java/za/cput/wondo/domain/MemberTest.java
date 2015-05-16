package za.cput.wondo.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.cput.wondo.conf.factory.MemberFactory;
import za.cput.wondo.domain.Member;

/**
 *
 * @author sbm
 */
public class MemberTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateMember() throws Exception {
        List<Dependants> dependants = new ArrayList<Dependants>();
        List<Policies> policies = new ArrayList<Policies>;
        Map<String,String> values = new HashMap<String,String>();

        values.put("code",100);
        values.put("name", "vuyokazi wondo");

        Member member =MemberFactory
                .createMember(25, values, member);
        Assert.assertEquals(100,member.getCode());
        }

    @Test
    public void testUpadteMember() throws Exception {
        List<Dependants> dependants = new ArrayList<Dependants>();
        List<Policies> policies = new ArrayList<Policies>;
        Map<String,String> values = new HashMap<String,String>();

        values.put("code",100);
        values.put("name", "vuyokazi wondo");

        Member member = MemberFactory
                .createMember(25, values, member);

        Member newmember = new Member
                .Builder(member.getCode())
                .copy(member)
                .numberOfDependants(6).build();

        Assert.assertEquals(100,newmember.getCode());
        Assert.assertEquals("National Diploma",newmember.getmName());
        Assert.assertEquals(6,newmember.getNumberOfDependants());
        Assert.assertEquals(25,member.getNumberOfDependants());


    }

}
    