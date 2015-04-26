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
public class policies {
    private int policyNo;
    private String policyName;
    
    private policies(Builder build) {
    this.policyNo= build.policyNo;
    this.policyName = build.policyName;
    }
     public static class Builder{
        
        private int policyNo;
        private String policyName;
        
         public Builder (int policyNo)
        {
            this.policyNo=policyNo;
        }
         public Builder policyName(String value)
        {
            this.policyName = value;
            return this;
        }

        public int getPolicyNo() {
            return policyNo;
        }

        public String getPolicyName() {
            return policyName;
        }
        public Builder copy(policies value){
            this.policyNo=value.policyNo;
            this.policyName=value.policyName;
            return this;
        }
         
    }
}
