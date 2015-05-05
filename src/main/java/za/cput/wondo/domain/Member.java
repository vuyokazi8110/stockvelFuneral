package za.cput.wondo.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

/**
 *
 * @author sbm
 */
@Entity
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    private Long id;
    private int numberOfDependants;
    @Embedded
    private MemberAddress adr;
    @Embedded
    private Contact cont;
    @OneToMany(cascade = CascadeType.ALL)
   // @JointColumn(name= "member_id")???
    private List<Dependants> dependants;
  
    private Member() {
    }

    public Member(Builder build) {
        this.id = build.id;
        this.numberOfDependants = build.numberOfDependants;
    }

    public static class Builder {

        private Long id;
        private int numberOfDependants;
        private MemberAddress adr;

        public Builder(Long id) {
            this.id = id;
        }

        public Builder numberOfDependants(int value) {
            this.numberOfDependants = value;
            return this;
        }
        /*public Builder cont(Contact cont)
         {
         this.cont = cont;
         return this;
         }*/

        public Builder adr(MemberAddress adr) {
            this.adr = adr;
            return this;
        }

        public Builder copy(Member value) {
            this.id = value.id;
            this.numberOfDependants = value.numberOfDependants;
            return this;
        }

        public Member build() {
            return new Member(this);
        }
    }

    public Long getMemberNumber() {
        return id;
    }

    public int getNumberOfDependants() {
        return numberOfDependants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
