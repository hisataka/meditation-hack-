package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;
import java.io.Serializable;

public class MediKey implements Serializable  {

  @Getter
  @Setter
  private String username;

  @Getter
  @Setter
  private long seq;
}