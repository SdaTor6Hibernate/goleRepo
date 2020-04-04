package model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"orders", "category"})
@ToString(exclude = {"orders", "category"})
@AttributeOverride(name = "id", column = @Column(name = "PRO_ID"))
public class Product extends ModelClass {

    @Column(name = "PRO_NAME")
    private String name;
    @Column(name = "PRO_PRICE")
    private BigDecimal price;
    @Column(name = "PRO_DESCRIPTION")
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRO_CAT_ID", referencedColumnName = "CAT_ID")
    private Category category;
    @OneToMany(mappedBy = "product")
    private Set<Cart> cart = new HashSet<>();

}
