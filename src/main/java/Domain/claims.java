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
public class claims {
    private int memberNo;
    private int policyNo;
    
    private claims(Builder build) {
        memberNo= build.memberNo;
        policyNo = build.policyNo;
    
    }
    public static class Builder{
        
        private int memberNo;
        private int policyNo;
       
        public Builder (int memberNo)
        {
            this.memberNo=memberNo;
        }
         public Builder policyNo(int value)
        {
            this.policyNo = value;
            return this;
        }
         public claims build()
        {
            return new claims(this);
        }

        public int getMemberNo() {
            return memberNo;
        }

        public int getPolicyNo() {
            return policyNo;
        }
         
         public Builder copy(claims value){
            this.memberNo=value.memberNo;
            this.policyNo=value.policyNo;
            return null;        
         }
        /*public claims build(){
            return new claims(this);
        }*/
    }
}

