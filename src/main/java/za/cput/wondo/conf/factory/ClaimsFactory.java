/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;
import za.cput.wondo.domain.Claims;
import static java.lang.ProcessBuilder.Redirect.Type.values;
import java.util.Map;
import static javax.persistence.CascadeType.values;

/**
 *
 * @author sbm
 */
public class ClaimsFactory {
    private static Claims claims;
    public static Claims createClaims(int memberNo, int policyNo){                       
        Claims claims = new Claims.Builder(memberNo)
                .policyNo(values.get("policyNo"))
                .build();
        return claims;
    }
}
