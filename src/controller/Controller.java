package controller;

import database.Database;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import models.Order;
import models.OrderList;

public class Controller {
    @FXML
    private ListView<Order> orderWaitingLV;
    @FXML
    private ListView<Order> orderServedLV;
    @FXML
    private Button prepareBtn;
    private ClientPoint client;

    @FXML
    public void initialize() throws Exception {
        client = new ClientPoint("localhost", this);
        Database.instance().setUp();
        registerButtons();
        getExistingOrder();
    }

    private void registerButtons() {
        prepareBtn.setOnAction(event -> {
            Order selectedOrder = orderWaitingLV.getSelectionModel().getSelectedItem();
            if (selectedOrder == null)
                MessageBox.show("An order must be selected", "Error");
            else {
                selectedOrder.setServed("ready");
                Database.instance().changeOrderToServed(selectedOrder);
                orderWaitingLV.getItems().remove(selectedOrder);
                orderServedLV.getItems().add(selectedOrder);
                client.notifyServer();
            }
        });
    }

    private void getExistingOrder() {
        orderWaitingLV.getItems().addAll(OrderList.instance().waitingOrders());
    }

    public void updateOrders() {
        System.out.println("Orders Updated at Chef");
    }
}
