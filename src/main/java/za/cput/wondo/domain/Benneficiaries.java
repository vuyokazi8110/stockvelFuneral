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
public class Benneficiaries {
    private int benId;
    private int benNo;
    
    public Benneficiaries (Builder build){
        this.benId = build.benId;
        this.benNo = build.benNo;
    }
    
         public static class Builder{
            private int benId;
            private int benNo;
            
            public Builder (int benId){
            this.benId=benId;
     }
     
         public Builder benNo(int value){
            this.benNo = value;
            return this;
         }
            public Builder copy(Benneficiaries value){
            this.benId=value.benId;
            this.benNo=value.benNo;
            return null;        
         }
            public Benneficiaries build()
        {
            return new Benneficiaries(this);
        }

        public int getBenId() {
            return benId;
        }

        public int getBenNo() {
            return benNo;
        }
            
        }
    
    
}
