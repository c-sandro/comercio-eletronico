package com.examp.order;

import java.util.ArrayList;

public class OrderManager{

    private ArrayList<Order> temp = new ArrayList<>();

    public boolean addOrder(Order newOrder){

        for(Order orderCheck : temp){

            if(orderCheck.getId().equals(newOrder.getId())){

                return false;

            }

        }

        temp.add(newOrder);
        return true;

    }

    public String removeOrder(String inputId){

        for(Order orderCheck : temp){

            if(orderCheck.getId().equals(inputId)){

                temp.remove(orderCheck);
                return "Ordem removida";

            }

        }

        return "Ordem com este id não existe";

    }

    public int scanList(String orderId){

        for(Order orderCheck : temp){

            if(orderCheck.getId().equals(orderId)){

                return temp.indexOf(orderCheck);

            }

        }

        return -1;

    }

    public ArrayList<Order> getTemp() {
        return temp;
    }
    
}
