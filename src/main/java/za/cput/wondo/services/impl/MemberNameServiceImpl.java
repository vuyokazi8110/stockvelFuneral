/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import za.cput.wondo.domain.MemberName;
import za.cput.wondo.repository.MemberNameRepository;

/**
 *
 * @author sbm
 */
public class MemberNameServiceImpl {
     @Autowired
    MemberNameRepository repository;
    public List<MemberName> getMemberName() {
        List<MemberName> allmemberName = new ArrayList<MemberName>();

        Iterable<MemberName> memberName = repository.findAll();
        for (MemberName name : memberName) {
            allmemberName.add(name);
        }
        return allmemberName;
    }
}
