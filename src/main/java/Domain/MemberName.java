/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;


import javax.persistence.Embeddable;

/**
 *
 * @author sbm
 */
@Embeddable
public class MemberName {
    private String firstName;
    private String lastName;
    
    public MemberName (Builder build){
        this.firstName = build.firstName;
        this.lastName = build.lastName;
    }
    
     public static class Builder{
            private String firstName;
            private String lastName;
            
            public Builder (String firstName){
            this.firstName=firstName;
     }
            public Builder lastName(String value){
            this.lastName = value;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
         public Builder copy(MemberName value) {
            this.firstName = value.firstName;
            this.lastName = value.lastName;
            return this;
        }

        public MemberName build() {
            return new MemberName(this);
        }
            
     }
}
