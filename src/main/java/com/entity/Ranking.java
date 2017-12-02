package com.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Ranking {
  @Getter
  @Setter
  private String username;
}