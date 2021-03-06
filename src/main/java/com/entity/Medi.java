package com.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import java.math.BigInteger;

@Entity
@Table(name="medi")
public class Medi {
  @Id
  @Column(name="seq")
  @Getter
  @Setter
  private BigInteger seq;

  @Column(name="username")
  @Getter
  @Setter
  private String username;

  @Column(name="poslatf")
  @Getter
  @Setter
  private double poslatf;

  @Column(name="poslonf")
  @Getter
  @Setter
  private double poslonf;

  @Column(name="poslatt")
  @Getter
  @Setter
  private double poslatt;

  @Column(name="poslont")
  @Getter
  @Setter
  private double poslont;

  @Column(name="timef")
  @Getter
  @Setter
  private Date timef;

  @Column(name="timecount")
  @Getter
  @Setter
  private int timecount;

  @Column(name="timet")
  @Getter
  @Setter
  private Date timet;

  @Column(name="point")
  @Getter
  @Setter
  private int point;
}