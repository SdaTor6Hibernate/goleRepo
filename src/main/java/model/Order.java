package model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "`order`")
@Data
@EqualsAndHashCode(exclude = {"products", "user"})
@ToString(exclude = {"products", "user"})
@AttributeOverride(name = "id", column = @Column(name = "ORD_ID"))
public class Order extends ModelClass {

    @Column(name = "ORD_DATE")
    private LocalDateTime orderDate;
    @Column(name = "ORD_PRICE")
    private BigDecimal orderPrice;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORD_USR_ID", referencedColumnName = "USR_ID")
    private User user;
    @OneToMany(mappedBy = "order")
    private Set<Cart> cart = new HashSet<>();


}
