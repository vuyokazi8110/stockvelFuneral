/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.services.impl;

import com.mycompany.domain.Benneficiaries;
import com.mycompany.repository.BenneficiariesRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author sbm
 */
@Service
public class BenneficiariesServiceImpl {
    BenneficiariesRepository benneficiaries;
   // public List<Benneficiaries> getBenneficiaries();
    List<Benneficiaries> ben = new ArrayList<Benneficiaries>();
}
