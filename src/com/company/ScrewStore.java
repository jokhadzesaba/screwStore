package com.company;

import java.util.HashMap;
import java.util.LinkedList;

public class ScrewStore {
    HashMap<Screw,Integer> stock = new HashMap<>();
    LinkedList<Order> orders = new LinkedList<>();
    public void addItem(Screw type, int amount) {
        if (stock.get(type)!=null){
        int amountP = stock.get(type);
        stock.put(type, amount+amountP);
        }else {
            stock.put(type, amount);
        }
    }
    public void takeOrder(Order order){
        if (order.getAmount()>0)
            orders.add(order);
    }
    public boolean executeOrder() {
        if (orders.isEmpty())
            return false;
        Order order = orders.getFirst();
        Integer amount = order.getAmount();
        Integer stockAmount = stock.get(order.getScrew());
        if (stockAmount!=null){
        if (stockAmount - amount < 0)
            stock.remove(order.getScrew());
        stock.put(order.getScrew(), stockAmount-amount);
        orders.remove(order);
        return true;
        }
        return false;
    }
    public void inflation(double percent) {
        for (Screw key:stock.keySet()) {
            key.setPrice(key.getPrice()*(1+percent));
        }
    }

    public int count() {
        int sum = 0;
        for (Screw s:stock.keySet()) {
            Integer amount = stock.get(s);
            sum += amount;
        }
        return sum;
    }

    public double value() {
        double price = 0;
        for (Screw s: stock.keySet()) {
            Integer amount = stock.get(s);
            double eachPrice = amount*s.getPrice();
            price+=eachPrice;
        }
        return price;
    }


    public String stockToString() {

        return stock.toString();
    }
}
