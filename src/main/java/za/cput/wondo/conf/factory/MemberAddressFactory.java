/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;

/**
 *
 * @author sbm
 */
public class MemberAddressFactory {   
    
    private static MemberAddressFactory memberAddress;
    public static MemberAddress createMemberAddress(int dependantId, int dependantCode
                        Map<> values){                       
        MemberAddress memberAddress = new MemberAddress
                .Builder(values.get("dependantId"))
                .dependantCode(values.get("dependantCode"))
                .Build();
        return MemberAddress;
    }
}

