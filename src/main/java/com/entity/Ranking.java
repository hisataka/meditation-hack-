package com.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

public class Ranking {
  @Getter
  @Setter
  private List<String> usernames;
}