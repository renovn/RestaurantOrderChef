package models;

public class Order {
    private int order_id;
    private String customer_name;
    private int table_num;
    private String food_name;
    private String beverage_name;
    private String served;
    private String ordered;

    public Order(int order_id, String customer_name, int table_num, String food_name, String beverage_name, String served) {
        this.order_id = order_id;
        this.customer_name = customer_name;
        this.table_num = table_num;
        this.food_name = food_name;
        this.beverage_name = beverage_name;
        this.served = served;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public int getTable_num() {
        return table_num;
    }

    public String getFood_name() {
        return food_name;
    }

    public String getBeverage_name() {
        return beverage_name;
    }

    public String getServed() {
        return served;
    }

    public String getOrdered() {
        ordered = food_name + ", " + beverage_name;
        return ordered;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setTable_num(int table_num) {
        this.table_num = table_num;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public void setBeverage_name(String beverage_name) {
        this.beverage_name = beverage_name;
    }

    public void setServed(String served) {
        this.served = served;
    }

    public void setOrdered(String ordered) {
        this.ordered = ordered;
    }

    @Override
    public String toString() {
        return customer_name + "| " + "Table: " + table_num + "| " + food_name + ", " + beverage_name;
    }
}
