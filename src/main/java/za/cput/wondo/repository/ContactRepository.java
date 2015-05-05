/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.repository;


import za.cput.wondo.domain.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sbm
 */
public interface ContactRepository extends CrudRepository<Contact,Long>{

    public Contact findOne(String email);
    
}
