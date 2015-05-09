/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.cput.wondo.domain.Contact;
import za.cput.wondo.repository.ContactRepository;

/**
 *
 * @author sbm
 */
public class ContactCrud {
    private Long id;

    @Autowired
   ContactRepository repository;
    private String email;
    @Test
    public void testCreate() throws Exception {
        Map<String,String> values = new HashMap<String,String>();
        values.put("email","vuyokaziwondo@yahoo.com");
        values.put("homeNumber", 0219453580);
        values.put("cellNumber",0839750752 )
        Contact contact = ContactFactory
                .createContact(values,27);

        repository.save(contact);
        email=contact.getEmail();
        Assert.assertNotNull(contact.getEmail());
    }

    @Test(dependsOnMethods = "create")
    public void testRead() throws Exception {
        Contact contact = repository.findOne(email);
        repository.save(contact);
        Assert.assertNotNull(contact);
       
    }

    @Test(dependsOnMethods = "read")
    public void testUpdate() throws Exception {

        Contact contact = repository.findOne(email);
        Contact newContact = new Contact
                .Builder(contact.getEmail())
                .copy(contact)
                .homeNumber(0215214200)
                .build();
        
        repository.save(newContact);
        Contact updatedContact = repository.findOne(id);
        Assert.assertEquals(0215214211, contact.getHomeNumber());
        Assert.assertEquals(updatedContact.getHomeNumber(),0215214200);

    }

    @Test(dependsOnMethods = "update")
    public void testDelete() throws Exception {
        Contact contact = repository.findOne(email);
        repository.delete(contact);
        Contact deletedcontact = repository.findOne(email);
        Assert.assertNull(deletedcontact);
    }
}
