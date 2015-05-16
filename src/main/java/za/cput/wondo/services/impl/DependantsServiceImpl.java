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
import za.cput.wondo.repository.DependantsRepository;
import za.cput.wondo.services.DependantsService;

/**
 *
 * @author sbm
 */
public class DependantsServiceImpl implements DependantsService {
     @Autowired
    DependantsRepository repository;
    public List<Dependants> getDependants() {
        List<Dependants> alldependants = new ArrayList<Dependants>();

        Iterable<Dependants> dependants = repository.findAll();
        for (Dependants dependant : dependants) {
            alldependants.add(dependant);
        }
        return alldependants;
    }
}
