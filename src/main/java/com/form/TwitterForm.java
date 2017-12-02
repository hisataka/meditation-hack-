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
  private String poslatf;

  @Getter
  @Setter
  private String poslonf;

  @Getter
  @Setter
  private String poslatt;

  @Getter
  @Setter
  private String poslont;

  @Getter
  @Setter
  private String timef;

  @Getter
  @Setter
  private String timet;

  @Getter
  @Setter
  private String timecount;

  @Getter
  @Setter
  private String counts;
}