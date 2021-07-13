package com.epam.unit08.task01;

public class Customers {// классы множественным числом не именуются
  private Customer[] customers;
  private int currentIndex;

  public Customers() {
    this.customers = new Customer[5];
    currentIndex = 0;
  }

  public Customer[] sortByAlphabetOrder() {
    Customer[] sortedCustomers = new Customer[currentIndex];
    for (int i = 0; i < currentIndex; i++) {
      sortedCustomers[i] = customers[i];
    }
    boolean sorted = false;
    Customer temp;
    while (!sorted) {
      sorted = true;

      for (int i = 0; i < sortedCustomers.length - 1; i++) {
        if (sortedCustomers[i].getSurname().compareTo(sortedCustomers[i + 1].getSurname()) > 0) {
          temp = sortedCustomers[i];
          sortedCustomers[i] = sortedCustomers[i + 1];
          sortedCustomers[i + 1] = temp;
          sorted = false;
        }
      }
    }
    return sortedCustomers;
  }

  public Customer[] findByCardNumber(int minValue, int maxValue) {
    Customer[] foundCustomers = new Customer[currentIndex];
    int pechenka = 0;
    for (int i = 0; i < currentIndex; i++) {
      if (customers[i].getCardNumber() > minValue && customers[i].getCardNumber() < maxValue) {
        foundCustomers[pechenka] = customers[i];
        pechenka++;
      }
    }
    return foundCustomers;
  }

  public Customer[] getCustomers() {
    return customers;
  }

  public void setCustomers(Customer[] customers) {
    this.customers = customers;
    currentIndex = customers.length;
  }

  public void addCustomer(Customer customer) {
    if (customers.length > currentIndex) {
      customers[currentIndex] = customer;
      currentIndex = currentIndex + 1;
    } else {
      throw new RuntimeException("Нет свободных мест");
    }
  }
}
