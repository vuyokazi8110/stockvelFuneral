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
    @Embedded
    private Contact cont;
    //@OnetoMany
    //JointColumn(name= "dep_id");    
    
       
    private Dependants(Builder build) {
    this.dependantId= build.dependantId;
    this.dependantCode = build.dependantCode;
    }
     public static class Builder{
        
        private int dependantId;
        private int dependantCode;
        
         public Builder (int dependantId)
        {
            this.dependantId=dependantId;
        }
         public Builder dependantCode(int value)
        {
            this.dependantCode = value;
            return this;
        }

        public int getDependantId() {
            return dependantId;
        }

        public int getDependantCode() {
            return dependantCode;
        }
         
        
        public Builder copy(Dependants value){
            this.dependantId=value.dependantId;
            this.dependantCode=value.dependantCode;
            return this;
        }
        public Dependants build()
        {
            return new Dependants(this);
        }
         
    }

    
}
