/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.crud;

import za.cput.wondo.domain.Contact;
import za.cput.wondo.repository.ContactRepository;
import java.util.ArrayList;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
        Contact contact = new Contact.Builder("vwondo@fnb.co.za")
                .homeNumber(0215214200).cellNumber(0839750752).build();
        repository.save(contact);
        email=contact.getEmail();
        Assert.assertNotNull(contact.getEmail());
    }

    @Test
    public void testRead() throws Exception {
        Contact contact = repository.findOne(email);
        Assert.assertEquals(0215214200,contact.getHomeNumber());
    }

    @Test
    public void testUpdate() throws Exception {

        Contact contact = repository.findOne(email);
        Contact newcontact = new Contact.Builder("vuyo@yahoo.com").email(contact.getEmail())
                .homeNumber(0215214211).cellNumber(0724567832).build();
        repository.save(newContact);
        Assert.assertEquals(0215214211, contact.getHomeNumber());
        Assert.assertEquals(2014, course.getOffering());

    }

    @Test
    public void testDelete() throws Exception {
        Contact contact = repository.findOne(email);
        repository.delete(contact);
        Contact newcontact = repository.findOne(email);
        Assert.assertNull(newcontact);


    }
}
