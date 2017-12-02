package com.form;

import java.io.Serializable;

import java.util.Collections;
import java.util.List;

import javax.validation.constraints.Pattern;

public class TwitterForm implements Serializable {
  private static final long serialVersionUID = 1L;

  private String test;

  public String getTest() {
    return test;
  }
  public void setTest(String test) {
    this.test = test;
  }
}