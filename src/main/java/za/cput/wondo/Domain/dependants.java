/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.Domain;

import javax.swing.text.html.parser.Entity;

/**
 *
 * @author sbm
 */
@Entity
public class dependants {
    @Id
     private int dependantId;
     private int dependantCode;
    @Embedded
    private Contact cont;
    @OnetoOne
    //JointColumn(name= "dep_id");    
    
       
    private dependants(Builder build) {
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
         
        
        public Builder copy(dependants value){
            this.dependantId=value.dependantId;
            this.dependantCode=value.dependantCode;
            return this;
        }
         
    }

    
}
