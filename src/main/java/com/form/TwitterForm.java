package com.form;

import java.io.Serializable;

import java.util.Collections;
import java.util.List;

import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

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

  @Getter
  @Setter
  private Date timef;

  @Getter
  @Setter
  private Date timet;

  @Getter
  @Setter
  private int timecount;
}