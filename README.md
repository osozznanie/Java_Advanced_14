# Hibernate Many-to-Many Example

This is an example project that demonstrates how to create a Many-to-Many relationship between entities using Hibernate.

## Entity Model

1. Create the `Cart` entity with fields: {id, total, name, Set<Item>} to represent a shopping cart.
2. Create the `Item` entity with fields: {id, total, Set<Cart>} to represent items in the cart.
3. Establish a Many-to-Many relationship between `Cart` and `Item`.

## Hibernate Configuration

1. Configure Hibernate using XML configuration (`hibernate.cfg.xml`).
2. Create mapping files (`Cart.hbm.xml` and `Item.hbm.xml`) to map the entity classes to database tables.
3. Define the Many-to-Many relationship in the mapping files.

## Application

1. Create the `Application` class to demonstrate the usage of Hibernate for database operations.
2. Within the `Application` class, configure Hibernate session factory and session.
3. Create instances of `Cart` and `Item` with appropriate data.
4. Establish the Many-to-Many relationship by adding items to the cart and cart to the items.
5. Use Hibernate session to persist the entities into the database.

## Steps

1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Configure Hibernate in the `hibernate.cfg.xml` file.
4. Create mapping files `Cart.hbm.xml` and `Item.hbm.xml` in the `resources` folder.
5. Implement the `Application` class in the `src` folder.
6. Build and run the application.# Java_Advanced_14
