package com.epam.unit08.task01;

public class Main {
  public static void main(String[] args) {

    Customer customer1 = new Customer();
    customer1.setSurname("Doe");
    customer1.setCardNumber(111);

    Customer customer2 = new Customer();
    customer2.setSurname("Ivanov");
    customer2.setCardNumber(222);

    Customer customer3 = new Customer();
    customer3.setSurname("Petrov");
    customer3.setCardNumber(333);

    Customer customer4 = new Customer();
    customer4.setSurname("Sidorov");
    customer4.setCardNumber(444);

    Customer customer5 = new Customer();
    customer5.setSurname("Lukashenko");
    customer5.setCardNumber(555);

    Customers customers = new Customers();
    customers.addCustomer(customer1);
    customers.addCustomer(customer2);
    customers.addCustomer(customer3);
    customers.addCustomer(customer4);
    customers.addCustomer(customer5);

    Customer[] sortedCustomers = customers.sortByAlphabetOrder();
    System.out.println("Отсортировонные по алфавиту кастомеры: ");
    for (int i = 0; i < sortedCustomers.length; i++) {
      if (sortedCustomers[i] != null) {
        System.out.println("Surname: " + sortedCustomers[i].getSurname() + ", Card number: " + sortedCustomers[i].getCardNumber());
      }
    }

    System.out.println();

    Customer[] foundCustomers = customers.findByCardNumber(200, 500);
    System.out.println("Кастомеры, карточки которых находятся в заданном промежутке: ");
    for (int i = 0; i < foundCustomers.length; i++) {
      if (foundCustomers[i] != null) {
        System.out.println("Surname: " + foundCustomers[i].getSurname() + ", Card number: " + foundCustomers[i].getCardNumber());
      }
    }
  }
}
