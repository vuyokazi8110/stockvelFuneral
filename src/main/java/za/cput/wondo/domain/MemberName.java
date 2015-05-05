/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.domain;

import javax.persistence.Embeddable;
import org.springframework.data.annotation.Id;

/**
 *
 * @author sbm
 */
@Embeddable
public class MemberName {
   // @Id;
    public String firstName;
    private String lastName;
    
    private MemberName (Builder build){
        this.firstName = build.firstName;
        this.lastName = build.lastName;
    }
        public static class Builder {
        private String firstName;
        private String lastName;

        public Builder(String get) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
           
        public Builder lastName(String lastName){
         this.lastName=lastName;
            return this;
     }
       public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }  
        public Builder copy(MemberName value){
            this.firstName=value.firstName;
            this.lastName=value.lastName;
            return this;
        }

        public MemberName build(){
            return new MemberName(this);
        }
    }
    
}
