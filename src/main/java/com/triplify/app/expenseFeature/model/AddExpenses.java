package com.triplify.app.expenseFeature.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddExpenses {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_id")
    private String transaction_id;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private float amount;

    @Column(name = "currency")
    private String currency;
    @Column(name = "useridlist")
    private ArrayList<Long> useridlist;

    @Column(name = "paidbyuserid")
    private Long paidbyuserid;
    @Column(name = "groupid")
    private Long groupid;

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ArrayList<Long> getUseridlist() {
        return useridlist;
    }

    public void setUseridlist(ArrayList<Long> useridlist) {
        this.useridlist = useridlist;
    }

    public Long getPaidbyuserid() {
        return paidbyuserid;
    }

    public void setPaidbyuserid(Long paidbyuserid) {
        this.paidbyuserid = paidbyuserid;
    }
}