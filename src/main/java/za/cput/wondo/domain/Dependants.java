/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.domain;

import javax.persistence.Embedded;
import javax.swing.text.html.parser.Entity;
import org.springframework.data.annotation.Id;

/**
 *
 * @author sbm
 */
//@Entity
public class Dependants {
    @Id
     private int dependantId;
     private int dependantCode;
     private String name;
    @Embedded
    private Contact cont;
    //@OnetoMany
    //JointColumn(name= "dep_id");  
    
    private Dependants(Builder build) {
    this.dependantId= build.dependantId;
    this.dependantCode = build.dependantCode;
    this.name = build.name;
    }
     public static class Builder{
        
        private int dependantId;
        private String name;
        
         public Builder (int dependantId)
        {
            this.dependantId=dependantId;
        }
         
         public Builder name(String value){
            this.name = value;
            return this;
         }
        public int getDependantId() {
            return dependantId;
        }
      
        public Builder copy(Dependants value){
            this.dependantId=value.dependantId;
            return this;
        }
        public Dependants build()
        {
            return new Dependants(this);
        }
         
    }

    
}
