/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;

import com.mycompany.domain.MemberIdentity;
import java.util.Map;
import static javax.persistence.EnumType.values;

/**
 *
 * @author sbm
 */
public class MemberIdentityFactory {
    private static MemberIdentity memberIdentity;
    public static MemberIdentity createMemberIdentity(long Id
                        Map<String> values){
                       
        MemberIdentity memberIdentity = new MemberIdentity
                .Builder(values.get(Id))
                .IdType(values.get("IdType"))
                .build();
        return memberIdentity;
    }
}
