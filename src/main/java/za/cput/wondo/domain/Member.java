package za.cput.wondo.domain;

import static com.fasterxml.classmate.AnnotationOverrides.builder;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
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
    private int code;
    @Embedded
    private MemberAddress adr;
    @Embedded
    private Contact cont;
    private MemberName mName;
    @OneToMany(cascade = CascadeType.ALL)
   // @JointColumn(name= "member_id")???
    private List<Dependants> dependants;
    private List<Policies> policies;
  
    private Member() {
    }

    public Member(Builder build) {
        this.id = build.id;
        this.numberOfDependants = build.numberOfDependants;
        this.code = build.code;
    }

    public static class Builder {

        private Long id;
        private int numberOfDependants;
        private MemberAddress adr;
        private MemberName mName;
        private Contact cont;
        private Policies policies;
        private int code;

        public Builder(Long id) {
            this.id = id;
        }

        public Builder numberOfDependants(int value) {
            this.numberOfDependants = value;
            return this;
        }
        public Builder cont(Contact cont)
         {
         this.cont = cont;
         return this;
         }

        public Builder adr(MemberAddress adr) {
            this.adr = adr;
            return this;
        }
        public Builder policies(Policies policies){
            this.policies = policies;
            return this;
        }
         public Builder mName(MemberName mName) {
            this.mName = mName;
            return this;
        }
         }
         public Builder code(int code) {
            this.code = code;
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
}
 