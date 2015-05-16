/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;

import za.cput.wondo.domain.MemberName;
import java.util.Map;

/**
 *
 * @author sbm
 */
public class MemberNameFactory {
    private static MemberName memberName;
    public static MemberName createMemberName(
                        Map<String,String> values){
                       
        MemberName memberName = new MemberName
                .Builder(values.get("firstName"))
                .lastName(values.get("lastName"))
                .build();
        return memberName;
    }
}
