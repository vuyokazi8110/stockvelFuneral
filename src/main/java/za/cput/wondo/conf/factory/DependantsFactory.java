/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;

import java.util.Map;
import static javax.persistence.CascadeType.values;
import za.cput.wondo.domain.Dependants;

/**
 *
 * @author sbm
 */
public class DependantsFactory {
    private static Dependants Dependants;
    public static Dependants createDependants(int dependantId, int dependantCode
                        Map<> values){                       
        Dependants dependants = new Dependants
                .Builder(values.get("dependantId"))
                .dependantCode(values.get("dependantCode"))
                .Build();
        return Dependants;
    }
}
