package org.java.scenarioBasedProblems;

import java.util.*;

/*
==========================================
        Multi-Level Sorting Question
==========================================
Problem Statement: You are given a list of Order objects.
Each Order contains the following fields:
- orderId
- customerName
- city
- mobileNumber
- price
- remainingDeliveryDays

Write a Java program to sort the list using Comparator based on the following conditions:

1. Sort the orders by remainingDeliveryDays in ascending order.
2. If two or more orders have the same remainingDeliveryDays,
   sort them by price in ascending order.
3. If both remainingDeliveryDays and price are the same,
   sort them by customerName in alphabetical order.

Sample Input:
Order(101, "Rahul", "Delhi", "9999999999", 500.0, 2)
Order(102, "Amit", "Noida", "8888888888", 300.0, 1)
Order(103, "Neha", "Delhi", "7777777777", 700.0, 2)
Order(104, "Priya", "Pune", "6666666666", 300.0, 1)
Order(105, "Ankit", "Mumbai", "5555555555", 300.0, 1)

Expected Output:
Order 105 -> Days=1 Price=300 Name=Ankit
Order 102 -> Days=1 Price=300 Name=Amit
Order 104 -> Days=1 Price=300 Name=Priya
Order 101 -> Days=2 Price=500 Name=Rahul
Order 103 -> Days=2 Price=700 Name=Neha
 */
public class OrderDetailsSorting {

    int orderId;
    String customerName;
    String city;
    String mobileNumber;
    double price;
    int remainingDeliveryDays;

    public OrderDetailsSorting(int orderId, String customerName, String city, double price, int remainingDeliveryDays) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.city = city;
        this.price = price;
        this.remainingDeliveryDays = remainingDeliveryDays;
    }

    @Override
    public String toString() {
        return orderId + " Days=" + remainingDeliveryDays + " Price=" + price;
    }

    public static void main(String[] args) {
        List<OrderDetailsSorting> orders = new ArrayList<>();

        orders.add(new OrderDetailsSorting(101, "Rahul", "Delhi", 500, 2));
        orders.add(new OrderDetailsSorting(102, "Amit", "Noida", 300, 1));
        orders.add(new OrderDetailsSorting(103, "Neha", "Delhi", 700, 2));
        orders.add(new OrderDetailsSorting(104, "Priya", "Pune", 300, 1));
        orders.add(new OrderDetailsSorting(105, "Ankit", "Mumbai", 300, 1));
        orders.add(new OrderDetailsSorting(106, "Rohit", "Delhi", 450, 3));
        orders.add(new OrderDetailsSorting(107, "Sneha", "Bangalore", 450, 2));
        orders.add(new OrderDetailsSorting(108, "Vikas", "Hyderabad", 200, 1));
        orders.add(new OrderDetailsSorting(109, "Karan", "Chennai", 800, 4));
        orders.add(new OrderDetailsSorting(110, "Pooja", "Jaipur", 500, 2));
        orders.add(new OrderDetailsSorting(111, "Sanjay", "Lucknow", 500, 2));
        orders.add(new OrderDetailsSorting(112, "Nikita", "Indore", 200, 1));

        /* Using Java7 Code */
        Collections.sort(orders, new Comparator<OrderDetailsSorting>() {
            @Override
            public int compare(OrderDetailsSorting o1, OrderDetailsSorting o2) {
                if (o1.remainingDeliveryDays != o2.remainingDeliveryDays) {
                    //return o1.remainingDeliveryDays - o2.remainingDeliveryDays;
                    return Integer.compare(o1.remainingDeliveryDays, o2.remainingDeliveryDays);
                }
                return Double.compare(o1.price, o2.price);
            }

        });

        System.out.println("Orders List===>>"+ orders);


    }

}
