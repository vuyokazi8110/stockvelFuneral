/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import za.cput.wondo.domain.Premiums;
import za.cput.wondo.repository.PremiumsRepository;
import za.cput.wondo.services.PremiumsService;

/**
 *
 * @author sbm
 */
public class PremiumsServiceImpl implements PremiumsService{
    @Autowired
    PremiumsRepository repository;
    public List<Premiums> getCourses() {
        List<Premiums> allpremiums = new ArrayList<Premiums>();

        Iterable<Premiums> premiums = repository.findAll();
        for (Premiums premium : premiums) {
            allpremiums.add(premium);
        }
        return allpremiums;
    }
}
