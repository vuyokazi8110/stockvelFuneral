/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.cput.wondo.domain.Benneficiaries;
import za.cput.wondo.repository.BenneficiariesRepository;

/**
 *
 * @author sbm
 */
@Service
public class BenneficiariesServiceImpl {
     @Autowired
    BenneficiariesRepository repository;
    public List<Benneficiaries> getBenneficiaries() {
        List<Benneficiaries> allbenneficiaries = new ArrayList<Benneficiaries>();

        Iterable<Benneficiaries> benneficiaries = repository.findAll();
        for (Benneficiaries benneficiary : benneficiaries) {
            allbenneficiaries.add(benneficiary);
        }
        return allbenneficiaries;
    }
}
