package tn.spring.pispring.dtos;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import tn.spring.pispring.Entities.OrderItem;
import tn.spring.pispring.Entities.OrderStatus;
import tn.spring.pispring.Entities.User;

import java.util.Date;
import java.util.List;
@Data
public class OrderDto {

    public int idOrder;
    @Temporal(TemporalType.DATE)
    public Date dateOrder;
    public OrderStatus status;
    public float costOrder;
    public String codeOrder; // Champ pour le code de commande
    private List<OrderItem> orderItems;
    private User user;
}
