/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.domain;

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
    private String cellNumber;
    

    private Contact(Builder build) {
    this.email= build.email;
    this.cellNumber = build.cellNumber;
    this.homeNumber = build.homeNumber;
     
    }
////auto added code
    public String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getCellNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static class Builder{
        
        private String email;
        private String homeNumber;
        private String cellNumber;
                
        /*public Builder (String email)
        {
            this.email=email;
        }*/
        public Builder (String email)
        {
            this.email=email;
        }
        
        public Builder HomeNumber(String value)
        {
            this.homeNumber = value;
            return this;
        }
         public Builder CellNumber(String CellNumber)
        {
            this.cellNumber = cellNumber;
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
            return cellNumber;
        }
        public Builder copy(Contact value){
            this.homeNumber=value.homeNumber;
            this.cellNumber=value.cellNumber;
            this.email=value.email;
            return this;
        }

        public Object cellNumber(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Object email(Contact con) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Object homeNumber(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       
    }
}