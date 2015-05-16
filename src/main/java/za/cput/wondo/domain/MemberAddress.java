/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.domain;

/**
 *
 * @author sbm
 */
public class MemberAddress {
    private String email;
    //private String physicalAddress;
    //private String postalAddress;
    private String postalCode;
    
    private MemberAddress (Builder build){
        email = build. email;
        postalCode = build.postalCode;        
    }
    
    public static class Builder{
        private String email;
        private String postalCode;
    

    public String getPhysicalAddress() {
        return email;
    }

    
    public String getPostalCode() {
        return postalCode;
    }
    public Builder copy(MemberAddress value) {
            this.email = value.email;
            this.postalCode = value.postalCode;
            return this;
        }
    public MemberAddress build() {
            return new MemberAddress(this);
        }
    } 
       
}
