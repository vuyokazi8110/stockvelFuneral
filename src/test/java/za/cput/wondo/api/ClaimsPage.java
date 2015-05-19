
package za.cput.wondo.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.cput.wondo.domain.Claims;
import za.cput.wondo.services.ClaimsService;

/**
 *
 * @author sbm
 */
@RestController
@RequestMapping(value="/claims/**")
public class ClaimsPage {
    @Autowired
    private ClaimsService service;
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
      
     List<ClaimsResource> hateos = new ArrayList<>();
        List<Claims> claims = service.getAllClaims();
        for (Claims claim : claims) {
            ClaimsResource clre = new ClaimsResource
                    .Builder(claims.getName())
                    .address(claim.getAddress())
                    .department(faculty.getDepartments())
                    .resid(faculty.getId())
                    .build();
            Link departments = new
                    Link("http://localhost:8080/faculty/"+res.getResid().toString())
                    .withRel("depts");
            res.add(departments);
            hateos.add(res);
    }
