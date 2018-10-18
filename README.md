# RestaurantOrderChef

RestaurantOrder is an application that allows the restaurant to manage their system, including all roles in the restaurant such as
Customer, Chef and Receiptionist. Each of the role has its own user interface with unique functionalities, e.g: customer can order,
chef can prepare the orders and receiptionist can create bills based on the orders.

## Customer
In Customer's UI, named RestaurantOrder, receiptionist may assign a table to the customer with name, the table is indentifiable with
table number, the receiptionist then select the meal type (breakfast, lunch or dinner) upon customer's requests. There are some validations
in receiving/recording an order:
- Displaying a message if the customer's name, table number, meal type, food and beverage items are blank when **Enter Data** button is pressed.
- Menu selection boxes (combo boxes) become enabled with all menu items right after customer's name, table number and meal type are 
filled or selected.

Whenever an order is recorded, it is displayed in format with all information in **Orders with waiting state** table.

Both **Display Order** and **Display Choices** buttons are available after at least one order is recorded
- **Display Choices**  display customer choices with all nutrition information with the input of the table number, including item name,
energy, protein, carbohydrate, total fat, fibre and price.
- **Display Order**  display customer name and ordered items with the input of the table number.


## Chef
In Chef's UI, all the orders are split into two tables: **Orders with waiting state** table and **Orders with served state** table.
As soon as the chef selects the order from the **waiting state**, the **Prepare** button is enabled; and upon preparation, a click on the 
**Prepare** button will move the order to the **served state**.

## Receiptionist
In Receiptionist's UI, all the orders are split into two tables: **Orders with waiting state** table and **Orders with served state** table.
Only orders in **served state** will be billed. As soon as the receiptionist selects the order from the **served state**, the **Bill** button 
is enabled to be clicked and complete the billing. The application will then remove the order from **served state** upon billing successfully.

This repository is the second part of the whole project RestaurantOrder, including Chef's UI and all functions
