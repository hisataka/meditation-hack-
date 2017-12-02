package com.form;

import java.io.Serializable;

import java.util.Collections;
import java.util.List;

import javax.validation.constraints.Pattern;

public class TwitterForm implements Serializable {
  private static final long serialVersionUID = 1L;

  @Getter
  @Setter
  private String username;

  @Getter
  @Setter
  private double poslatf;

  @Getter
  @Setter
  private double poslonf;

  @Getter
  @Setter
  private double poslatt;

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
}