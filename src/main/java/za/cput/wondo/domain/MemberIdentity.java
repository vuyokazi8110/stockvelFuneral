/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author sbm
 */
@Embeddable
public class MemberIdentity {
    public Long Id;
    private String IdType;
    
    private MemberIdentity (Builder build){
        this.Id = build.Id;
        this.IdType = build.IdType;
    }
        public static class Builder {
        private String IdType;
        private Long Id;
           
        public Builder (Long Id){
         this.Id=Id;
     }
       public Builder IdType(String value){
            this.IdType = value;
            return this;
        }  
        public Builder copy(MemberIdentity value){
            this.Id=value.Id;
            this.IdType=value.IdType;
            return this;
        }

        public MemberIdentity build(){
            return new MemberIdentity(this);
        }
    }
        
    
}
