/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.conf.factory;

import za.cput.wondo.domain.Demographics;
import java.util.Map;

/**
 *
 * @author sbm
 */
public class DemographicsFactory {
    private static Demographics demographics;
    public static Demographics createDemographics(
                        Map<String,String> values){
                       
        Demographics demographics = new Demographics
                .Builder(values.get("gender"))
                .race(values.get("race"))
                .Build();
        return demographics;
    }
}
