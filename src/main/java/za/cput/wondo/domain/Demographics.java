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
    public String Gender;
    public String  Race;
    
    private Demographics (Builder build){
        this.Gender = build.Gender;
        this.Race = build.Race;
    }
    public static class Builder{
        public String Gender;
        public String  Race;

        public Builder(String get) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    
        public Builder Gender(String value)
        {
            this.Gender = value;
           return this;
        
        }
         public String getGender() {
            return Gender;
        }

        public String getRace() {
            return Race;
        }
        
        public Builder copy(Demographics value){
            this.Gender=value.Gender;
            this.Race=value.Race;
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
