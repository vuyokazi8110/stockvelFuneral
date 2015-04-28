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
public class MemberAddress {
    
    private String physicalAddress;
    private String postalAddress;
    private String postalCode;
    
    private MemberAddress (Builder build){
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
    public Builder copy(MemberAddress value){
            this.physicalAddress=value.physicalAddress;
            this.postalAddress=value.postalAddress;
            this.postalCode = postalCode;
            return this;
        }

        public MemberAddress build(){
            return new MemberAddress(this);
        }
    
       
}
