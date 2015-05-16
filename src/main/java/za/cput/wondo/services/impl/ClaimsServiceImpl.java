/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import za.cput.wondo.domain.Claims;
import za.cput.wondo.repository.ClaimsRepository;
import za.cput.wondo.services.ClaimsService;

/**
 *
 * @author sbm
 */
public class ClaimsServiceImpl implements ClaimsService{
     @Autowired
    ClaimsRepository repository;
    public List<Claims> getClaims() {
        List<Claims> allclaims = new ArrayList<Claims>();

        Iterable<Claims> claims = repository.findAll();
        for (Claims claim : claims) {
            allclaims.add(claim);
        }
        return allclaims;
    }
     
}
