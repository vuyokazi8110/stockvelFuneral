/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;

import com.mycompany.domain.Dependants;
import com.mycompany.domain.Member;
import com.mycompany.domain.MemberAddress;
import java.util.List;
import java.util.Map;
import static javax.persistence.CascadeType.values;

/**
 *
 * @author sbm
 */
public class MemberFactory {
    private static Member member;
    public static Member createMember(int contact, int memberAddress, 
                        Map<> values,
                        List<Dependants> dependants)
                        {                       
        Member member = new Member
                .Builder(values.get("id"))
                .numberOfDependants(values.get("numberOfDependants"))
                .Dependants(dependants)
                .memberAddress(memberAddress)
                .contact(contact)
                .build();
        return member;
    }
}
