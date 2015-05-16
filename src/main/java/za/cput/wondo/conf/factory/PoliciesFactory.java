/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;

import za.cput.wondo.domain.Policies;
import java.util.Map;
import static javax.persistence.CascadeType.values;

/**
 *
 * @author sbm
 */
public class PoliciesFactory {
    private static Policies policies;
    public static Policies createPolicies(int policyNo,
                        Map<String> values){                       
        Policies policies = new Policies
                .Builder(values.get("policyNo"))
                .policyName(values.get("policyName"))
                .build();
        return policies;
    }
}
