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
public class Claims {
    private int memberNo;
    private String policyNo;
    private String name;
    private double amount;
    
    private Claims(Builder build) {
        memberNo= build.memberNo;
        policyNo = build.policyNo;
        amount = build.amount;
        name = build.name;
    }

   
    public static class Builder{
        
        private int memberNo;
        private String policyNo;
        private String name;
        private double amount;
       
        public Builder (int memberNo)
        {
            this.memberNo=memberNo;
        }
         public Builder policyNo(String value)
        {
            this.policyNo = value;
            return this;
        }
          public Builder name(String value)
        {
            this.name = value;
            return this;
        }
         public Builder amount(double value)
        {
            this.amount = value;
            return this;
        }
         
         public Claims build()
        {
            return new Claims(this);
        }

        public int getMemberNo() {
            return memberNo;
        }

        public String getPolicyNo() {
            return policyNo;
        }
         
         public Builder copy(Claims value){
            this.memberNo=value.memberNo;
            this.policyNo=value.policyNo;
            this.name=value.policyNo;
            return null;        
         }
        
    }
}

