/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.services;

import java.util.List;
import za.cput.wondo.domain.Benneficiaries;
import za.cput.wondo.domain.Policies;

/**
 *
 * @author sbm
 */
public interface BenneficiariesService {
    List<Benneficiaries> getBenneficiaries();
    List<Policies> getPolicies();
}
