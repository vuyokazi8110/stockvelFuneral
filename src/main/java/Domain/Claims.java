/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sbm
 */
@Entity
public class Claims {
    @Id
    private int memberNo;
    private int policyNo;
    
    private Claims(Builder build) {
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
         public Claims build()
        {
            return new Claims(this);
        }

        public int getMemberNo() {
            return memberNo;
        }

        public int getPolicyNo() {
            return policyNo;
        }
    

            public void setMemberNo(int memberNo) {
            this.memberNo = memberNo;
         }
         
         public Builder copy(Claims value){
            this.memberNo=value.memberNo;
            this.policyNo=value.policyNo;
            return null;        
         }
       /*public Claims build{
            return new Claims(this);
        }*/
    }

    
}

