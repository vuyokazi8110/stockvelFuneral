/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.cput.wondo.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.cput.wondo.domain.Dependants;
import za.cput.wondo.domain.Member;
import za.cput.wondo.domain.Policies;
import za.cput.wondo.services.MemberService;

/**
 *
 * @author sbm
 */
@RestController
@RequestMapping(value="/member/**")
public class MemberPage {
      @Autowired
    private MemberService service;
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public List<Dependants> getMemberDependants(@PathVariable Long id)
    {

        // ...
        return service.getDependants(id);
    }
    private List<Policies> getMemberPolicies(@PathVariable Long id)
    {
        return service.getPolicies(id);
    }         
             
     @RequestMapping(value="/Members", method=RequestMethod.GET)
     public List<MemberResource> getMember() {
        List<MemberResource> hateos = new ArrayList<>();
        List<Member> members = service.getAllMembers();
        for (Member member : members) {
            MemberResource mere = new MemberResource
                    .Builder(member.getId())
                    .address(member.getCode())
                    .Dependants(member.getDependants())
                    .resid(member.getId())
                    .build();
            Link dependants = new
                    Link("http://localhost:8080/member/"+mere.getResid().toString())
                    .withRel("members");
            mere.add(dependants);
            hateos.add(mere);
        }
        return hateos;
    }
//

}
