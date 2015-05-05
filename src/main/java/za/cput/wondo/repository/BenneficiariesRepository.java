/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.repository;

import za.cput.wondo.domain.Benneficiaries;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sbm
 */
public interface BenneficiariesRepository extends CrudRepository<Benneficiaries,Long> {
    
}
