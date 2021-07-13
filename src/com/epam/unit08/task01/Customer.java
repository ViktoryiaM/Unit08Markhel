package com.epam.unit08.task01;

public class Customer {

  private int id;
  private int cardNumber;
  private int bankAccountNumber;
  private String name;
  private String surname;
  private String patronymic;
  private String address;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(int cardNumber) {
    this.cardNumber = cardNumber;
  }

  public int getBankAccountNumber() {
    return bankAccountNumber;
  }

  public void setBankAccountNumber(int bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  
  //equals, hasCode, toString ?
}

