package com.liveasyspringrest.liveasyspringrestassignment.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
//import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "Load")
public class Load {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long shipperId;

    @Column(nullable = false)
    private String loadingPoint;

    @Column(nullable = false)
    private String unloadingPoint;

    @Column(nullable = false)
    private String productType;

    @Column(nullable = false)
    private String truckType;

    @Column(nullable = false)
    private Long noOfTrucks;

    @Column(nullable = false)
    private Long weight;

    @Column
    private String comment;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern="dd-MM-yyyy")
    private Date loadDate;

    public Load() {
        super();
    }

    public Load(Long id, Long shipperId, String loadingPoint, String unloadingPoint,
                String productType, String truckType, Long noOfTrucks,
                Long weight, String comment, java.util.Date date) {
        this.id = id;
        this.shipperId = shipperId;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        loadDate = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShipperId() {
        return shipperId;
    }

    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public Long getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(Long noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    @Override
    public String toString() {
        return "Load{" +
                "id=" + id +
                ", shipperId='" + shipperId + '\'' +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", truckType='" + truckType + '\'' +
                ", noOfTrucks=" + noOfTrucks +
                ", weight=" + weight +
                ", comment='" + comment + '\'' +
                ", Date=" + loadDate +
                '}';
    }
}
