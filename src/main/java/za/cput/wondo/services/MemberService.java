/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.services;

import java.util.List;
import za.cput.wondo.domain.Dependants;
import za.cput.wondo.domain.Member;
import za.cput.wondo.domain.Policies;

/**
 *
 * @author sbm
 */
public interface MemberService {
     List<Member> getAllMembers();
     List<Dependants> getDependants(Long id);
     List<Policies> getPolicies(Long id);
}
