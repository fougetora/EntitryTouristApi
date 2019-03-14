package scratchMapp;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Transport extends Service {


    @Column(length = 50)
    String type; //bus - Taxi etc...
    @Column(length = 50)
    String companyName;
    @Column(length = 50)
    String companyWebSite;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @Embedded
    List<Location> stations;

    @Column(length = 11)
    @Size(min = 10,max=10)
    @Pattern(regexp = "^(06|05)",message = "must start with 06 for mobile or 05 for fix")
    String phone;

}
