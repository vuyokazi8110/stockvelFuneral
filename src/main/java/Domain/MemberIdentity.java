/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

/**
 *
 * @author sbm
 */
public interface MemberIdentity {
    public String id;
    private String IdType;
    
    private MemberIdentity (Builder build){
        this id = build.id;
        this.IdType = build.IdType;
        
        public static class Builder {
        
    }
    
}
