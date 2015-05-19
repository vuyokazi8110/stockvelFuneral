/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.cput.wondo.conf.factory.PremiumsFactory;
import za.cput.wondo.domain.Premiums;
import za.cput.wondo.repository.PremiumsRepository;

/**
 *
 * @author sbm
 */
public class PremiumsServiceTest {
    
     private Long id;
     private String premiumMonth;
    @Autowired
     private PremiumsRepository repository;
    @Test
     public void create() throws Exception {
        Premiums premiums = PremiumsFactory
                .createPremiums("January", 100);
        repository.save(premiums);
        id=premiums.getId();
        Assert.assertNotNull(premiums);
    }

}
