/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

/**
 *
 * @author sbm
 */
public class memberAddress {
    
    private String physicalAddress;
    private String postalAddress;
    private String postalCode;
    
    private memberAddress (Builder build){
        physicalAddress = build. physicalAddress;
        postalAddress = build.postalAddress;
        postalCode = build.postalCode;        
    }
    
    public static class Builder{
        private String physicalAddress;
        private String postalAddress;
        private String postalCode;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }
    
       
}
