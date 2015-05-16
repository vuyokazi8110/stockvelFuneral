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
public class Demographics {
    public String gender;
    public String  race;
    
    private Demographics (Builder build){
        this.gender = build.gender;
        this.race = build.race;
    }
    public static class Builder{
        public String gender;
        public String  race;

        public Builder(String get) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    
        public Builder Gender(String value)
        {
            this.gender = value;
           return this;
        
        }
         public String getGender() {
            return gender;
        }

        public String getRace() {
            return race;
        }
        
        public Builder copy(Demographics value){
            this.gender=value.gender;
            this.race=value.race;
            return this;
        }
        
        public Demographics build()
        {
            return new Demographics(this);
        }

        public Object race(String get) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       
  }
    
}
