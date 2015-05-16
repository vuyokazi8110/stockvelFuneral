/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import za.cput.wondo.domain.Policies;
import za.cput.wondo.repository.PoliciesRepository;

/**
 *
 * @author sbm
 */
public class PoliciesServiceImpl implements PoliciesService{
    @Autowired
    PoliciesRepository repository;
    public List<Policies> getPolicies() {
        List<Policies> allpolicies = new ArrayList<Policies>();

        Iterable<Policies> policies = repository.findAll();
        for (Policies policy : policies) {
            allpolicies.add(policy);
        }
        return allpolicies;
    }
    
}
