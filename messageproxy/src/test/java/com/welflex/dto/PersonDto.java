package com.welflex.dto;

import java.io.Serializable;

/**
 * A Message Sent
 */
public class PersonDto implements Serializable {
  private static final long serialVersionUID = 1L;

  private String firstName;

  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PersonDto() {}
  
  public PersonDto(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
