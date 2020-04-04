package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AttributeOverride(name = "id", column = @Column(name = "CO_ID"))
public class Country extends ModelClass {

    @Column(name = "CO_NAME")
    private String name;
    @Column(name = "CO_ALIAS")
    private String alias;


}
