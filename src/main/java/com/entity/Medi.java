package com.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="medi")
@IdClass(value=MediKey.class)
public class Medi {

  @Id
  @Column(name="username")
  @Getter
  @Setter
  private String username;

  @Id
  @Column(name="seq")
  @Getter
  @Setter
  private long seq;

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

  @Column(name="timet")
  @Getter
  @Setter
  private Date timet;

  @Column(name="point")
  @Getter
  @Setter
  private int point;


}