package scratchMapp;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Future;
import java.util.Date;

@Entity
public class Hotel extends Service {

    @Enumerated(EnumType.STRING)
    RoomType roomType;
    @Future
    Date arrival;
    @Future
    Date departure;

    double price;

}
