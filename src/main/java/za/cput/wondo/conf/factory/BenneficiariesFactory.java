/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;


import static javax.persistence.CascadeType.values;
import za.cput.wondo.domain.Benneficiaries;

/**
 *
 * @author sbm
 */
public class BenneficiariesFactory {
    private static Benneficiaries benneficiaries;
    public static Benneficiaries createBenneficiaries(int benId, int benNo){                        
                       
        Benneficiaries benneficiaries = new Benneficiaries
                .Builder(values.get("benId"))
                .benNo(benNo)
                .build();
        return benneficiaries;
    }
}
