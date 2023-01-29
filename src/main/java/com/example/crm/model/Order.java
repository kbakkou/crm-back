package com.example.crm.model;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @Column(name="type_presta")
    private String typePresta;
    private String designation;
    @Column(name="nb_days")
    private Integer nbJours;
    @Column(name="unit_price")
    private Integer tjmHt;
    @Column(name="statee")
    private OrderState state;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    public Order() {
    }
    public Order(String typePresta, String designation, Integer nbDays,
                 Integer unitPrice, OrderState state, Client client) {
        this.typePresta = typePresta;
        this.designation = designation;
        this.nbJours = nbDays;
        this.tjmHt = unitPrice;
        this.state = state;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypePresta() {
        return typePresta;
    }

    public void setTypePresta(String typePresta) {
        this.typePresta = typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getNbJours() {
        return nbJours;
    }

    public void setNbJours(Integer nbJours) {
        this.nbJours = nbJours;
    }

    public Integer getTjmHt() {
        return tjmHt;
    }

    public void setTjmHt(Integer tjmHt) {
        this.tjmHt = tjmHt;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", typePresta=" + typePresta + ", designation=" + designation + ", nbDays=" + nbJours + ", unitPrice=" + tjmHt + ", state=" + state + '}';
    }
}
