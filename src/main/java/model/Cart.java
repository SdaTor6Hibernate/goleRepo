package model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(exclude = {"order", "product"})
@ToString(exclude = {"order", "product"})
public class Cart {

    @Column(name = "CRT_QUANTITY")
    private int quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CRT_ORD_ID", referencedColumnName = "ORD_ID")
    @Id
    private Order order;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CRT_PRO_ID", referencedColumnName = "PRO_ID")
    @Id
    private Product product;

}
