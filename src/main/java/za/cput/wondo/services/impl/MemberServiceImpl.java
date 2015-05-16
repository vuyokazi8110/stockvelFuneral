/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import za.cput.wondo.domain.Dependants;
import za.cput.wondo.domain.Member;
import za.cput.wondo.domain.Policies;
import za.cput.wondo.repository.MemberRepository;
import za.cput.wondo.services.MemberService;

/**
 *
 * @author sbm
 */
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepository repository;
    public List<Member> getMember() {
        List<Member> allmember = new ArrayList<Member>();

        Iterable<Member> members = repository.findAll();
        for (Member member1 : members) {
            allmember.add(member1);
        }
        return allmember;
    }
    @Override
    public List<Dependants> getDependants(Long id) {
        return repository.findOne(id).getDependants();
    }
    public List<Policies> getPolicies(Long id) {
        return repository.findOne(id).getPolicies();
    }
    
    
}
