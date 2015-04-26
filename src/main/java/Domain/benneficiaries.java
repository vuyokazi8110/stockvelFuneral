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
public class benneficiaries {
    private int benId;
    private int benNo;
    
    public benneficiaries (Builder build){
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
    }
    
}
