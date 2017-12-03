package com.entity;

import javax.persistence.*;

import java.util.*;
import lombok.Getter;
import lombok.Setter;

public class Ranking {
  @Getter
  @Setter
  private String username;

  @Getter
  @Setter
  private String point;
}