/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Repository;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sbm
 */
public interface MemberIdentityRepository extends CrudRepository<MemberIdentity,Long> {
    
    
}