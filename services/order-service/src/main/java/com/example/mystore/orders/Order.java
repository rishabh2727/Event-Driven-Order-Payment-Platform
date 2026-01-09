package com.example.mystore.orders;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

//entity means this class is supposed to be stored in the database.
// map this class to a table called orders
@Entity
@Table(name = "orders")
public class Order {
//    in sql, id UUID PRIMARY KEY

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private double total;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus status;





}
