/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;

import com.mycompany.domain.Contact;
import java.util.Map;

/**
 *
 * @author sbm
 */
public class ContactFactory {
    private static Contact Contact;
    public static Contact createContact(
                        Map<String,String,String> values){
                       
        Contact contact = new Contact
                .Builder(values.get("email"))
                .homeNumber(values.get("homeNumber"))
                .cellNumber(values.get("cellNumber"))
                .build();
        return Contact;
    }
}
