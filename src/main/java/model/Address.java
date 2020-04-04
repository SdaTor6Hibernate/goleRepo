package model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString(exclude = "country")
@EqualsAndHashCode(exclude = "country")
@AttributeOverride(name = "id", column = @Column(name = "ADD_ID"))
public class Address extends ModelClass{

    @Column(name = "ADD_STREET")
    private String street;
    @Column(name = "ADD_BUILDING_NO")
    private String buildingNo;
    @Column(name = "ADD_APARTAMENT_NO")
    private String apartmentNo;
    @Column(name = "ADD_CITY")
    private String city;
    @Column(name = "ADD_POSTAL_CODE")
    private String postalCode;
    @ManyToOne
    @JoinColumn(name = "ADD_CO_ID", referencedColumnName = "CO_ID")
    private Country country;



}
