package com.backyardweddingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="backyard")
public class Backyard {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="backyard_id")
  private Integer backyardId;

  @Column(name="backyard_description")
  private String backyardDescription;

  @Column(name="backyard_rating")
  private Integer backyardRating;

  @Column(name="backyard_city")
  private String backyardCity;

  @Column(name="backyard_cost")
  private Integer backyardCost;

  @Column(name="partner_id")
  private Integer partnerId;
  // -----------------------------------------------------------------------------------------------------------

  public Integer getBackyardId() {
    return backyardId;
  }

  public void setBackyardId(Integer backyardId) {
    this.backyardId = backyardId;
  }

  public String getBackyardDescription() {
    return backyardDescription;
  }

  public void setBackyardDescription(String backyardDescription) {
    this.backyardDescription = backyardDescription;
  }

  public Integer getBackyardRating() {
    return backyardRating;
  }

  public void setBackyardRating(Integer backyardRating) {
    this.backyardRating = backyardRating;
  }

  public String getBackyardCity() {
    return backyardCity;
  }

  public void setBackyardCity(String backyardCity) {
    this.backyardCity = backyardCity;
  }

  public Integer getBackyardCost() {
    return backyardCost;
  }

  public void setBackyardCost(Integer backyardCost) {
    this.backyardCost = backyardCost;
  }

  public Integer getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }

}
