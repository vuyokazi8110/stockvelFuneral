/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.Domain;

/**
 *
 * @author sbm
 */
public class demographics {
    public String Gender;
    public String  Race;
    
    private demographics (Builder build){
        this.Gender = build.Gender;
        this.Race = build.Race;
    }
    public static class Builder{
        public String Gender;
        public String  Race;
    }
    
   /* public demographics Gender(String value)
        {
            this.Gender = value;
           return this;
        
        }*/
    public String getGender() {
        return Gender;
    }

    public String getRace() {
        return Race;
    }

    
}
