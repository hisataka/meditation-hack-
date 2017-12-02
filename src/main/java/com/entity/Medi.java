package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medi {
//  @Id
  private String username;
  private long seq;
  private double poslatf;
  private double poslonf;
  private double poslatt;
  private double poslont;
  private Date timef;
  private Date timet;
  private int point;

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public long getSeq() {
    return seq;
  }
  public void setSeq(long seq) {
    this.seq = seq;
  }
  public double getPoslatf() {
    return poslatf;
  }
  public void setPoslatf(double poslatf) {
    this.poslatf = poslatf;
  }
  public double getPoslonf() {
    return poslonf;
  }
  public void setPoslonf(double poslonf) {
    this.poslonf = poslonf;
  }
  public double getPoslatt() {
    return poslatt;
  }
  public void setPoslatt(double poslatt) {
    this.poslatt = poslatt;
  }
  public double getPoslont() {
    return poslont;
  }
  public void setPoslont(double poslont) {
    this.poslont = poslont;
  }
  public Date getTimef() {
    return timef;
  }
  public void setTimef(Date timef) {
    this.timef = timef;
  }
  public Date getTimet() {
    return timet;
  }
  public void setTimet(Date timet) {
    this.timet = timet;
  }
  public int getPoint() {
    return point;
  }
  public void setPoint(int point) {
    this.point = point;
  }
}