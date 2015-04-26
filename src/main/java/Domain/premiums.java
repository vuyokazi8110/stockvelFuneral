/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

import javax.swing.text.html.parser.Entity;

/**
 *
 * @author sbm
 */
@Entity
public class premiums {
    
    private String premiumMonth;
    private double amount;
    
    private premiums(Builder build) {
        premiumMonth= build.premiumMonth;
        amount = build.amount;
    
    }
    public static class Builder{
        
       private String premiumMonth;
        private double amount;
        
       
        public Builder (String premiumMonth)
        {
            this.premiumMonth=premiumMonth;
        }
         public Builder amount(double value)
        {
            this.amount = value;
            return this;
        }
         public premiums build()
        {
            return new premiums(this);
        }

        public String getPremiumMonth() {
            return premiumMonth;
        }

        public double getAmount() {
            return amount;
        }
         
        public Builder copy(premiums value){
            this.premiumMonth=value.premiumMonth;
            this.amount=value.amount;
            return null;        
         }
        
    }
    
}
