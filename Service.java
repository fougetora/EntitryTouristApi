package scratchMapp;

import com.pnp.core.BaseEntity;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.Size;

@MappedSuperclass
public class Service extends BaseEntity {


    @Column(length = 30)
    @Size(max = 30)
    @NotEmpty
    String serviceName;
    @Embedded
    Location location;
    @Column(length = 20)
    String City;
    @URL
    String url;
    @URL
    String apiInfoEndPoint;

    @Column(length = 550)
    String description;
    @Column(length = 60)
    String imageUrl;


}
