package scratchMapp;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Restoration extends Service {

    @Column(length = 50)
    String recopies;
    @Column(length = 50)
    String foodGenre;
    @Column(length = 50)
    String baverges;




}
