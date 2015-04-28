package Domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.swing.text.html.parser.Entity;
import org.springframework.boot.autoconfigure.jms.hornetq.HornetQProperties.Embedded;
import org.springframework.data.annotation.Id;

/**
 *
 * @author sbm
 */
//@Entity
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numberOfDependants;
   // @Embedded
    private MemberAddress adr;
   // @Embedded
    private Contact cont;
    @OnetoMany(cascade = CascadeType.ALL)
    //@JointColumn(name= "member_id")???
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
        private Contact cont;
        private List<Dependants> dependants;

        public Builder(Long memberNumber) {
            this.id = id;
        }

        public Builder numberOfDependants(int value) {
            this.numberOfDependants = value;
            return this;
        }
        public Builder adr(MemberAddress value){
            this.adr=value;
            return this;
        }
          public Builder cont(Contact value){
            this.cont=value;
            return this;
        }
          public Builder dependants(List<Dependants> value){
            this.dependants=value;
            return this;
        }

           public Long getMemberNumber() {
            return id;
        }

        public int getNumberOfDependants() {
            return numberOfDependants;
        }
         public List<Dependants> getDependants() {
        return dependants;
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

   

}
