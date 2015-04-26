/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author sbm
 *///// old contact
@Embeddable
public class Contact implements Serializable{
    private String email;
    private String homeNumber;
    private String CellNumber;
    

    private Contact(Builder build) {
    this.email= build.email;
    this.homeNumber = build.homeNumber;
    this.CellNumber = build.CellNumber;
     
    }
////auto added code
    private String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static class Builder{
        
        private String email;
        private String homeNumber;
        private String CellNumber;
                
        /*public Builder (String email)
        {
            this.email=email;
        }*/
        public Builder email(Contact con)
        {
            this.email = con.getEmail();
            return this;
        }
        
        
        public Builder HomeNumber(String value)
        {
            this.homeNumber = value;
            return this;
        }
         public Builder CellNumber(String CellNumber)
        {
            this.CellNumber = CellNumber;
            return this;
        }  
       
        public Contact build()
        {
            return new Contact(this);
        }

        public String getEmail() {
            return email;
        }

        public String getHomeNumber() {
            return homeNumber;
        }

        public String getCellNumber() {
            return CellNumber;
        }
        public Builder copy(Contact value){
            this.homeNumber=value.homeNumber;
            this.CellNumber=value.CellNumber;
            this.email=value.email;
            return this;
        }
    }
}