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
@Entity
public class member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numberOfDependants;
    @Embedded
    //private memberAddress adr;??

    @Embedded
    private Contact cont;
    @OnetoMany(cascade = CascadeType.ALL)
    //@JointColumn(name= "member_id")???
    private List<dependants> dependants;

    private memberAddress adr;

    private member() {
    }

    public member(Builder build) {
        this.id = build.id;
        this.numberOfDependants = build.numberOfDependants;
    }

    public static class Builder {

        private Long id;
        private int numberOfDependants;
        private memberAddress adr;

        public Builder(Long memberNumber) {
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

        public Builder adr(memberAddress adr) {
            this.adr = adr;
            return this;
        }

        public Builder copy(member value) {
            this.id = value.id;
            this.numberOfDependants = value.numberOfDependants;
            return this;
        }

        public member build() {
            return new member(this);
        }
    }

    public Long getMemberNumber() {
        return id;
    }

    public int getNumberOfDependants() {
        return numberOfDependants;
    }

}
