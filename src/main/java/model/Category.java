package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AttributeOverride(name = "id", column = @Column(name = "CAT_ID"))
public class Category extends ModelClass {

    @Column(name = "CAT_NAME")
    private String name;

}
