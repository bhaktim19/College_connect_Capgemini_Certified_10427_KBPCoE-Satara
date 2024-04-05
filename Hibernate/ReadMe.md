# Hibernate Framework
In this hibernate small projects we have in-depth concepts of Hibernate Framework done practically with simplified examples. 

It was started in 2001 by Gavin King as an alternative to EJB2 style entity bean.

Hibernate is a Java framework that simplifies the development of Java application to interact with the database. It is an open source, lightweight, ORM (Object Relational Mapping) tool. Hibernate implements the specifications of JPA (Java Persistence API) for data persistence.

# ORM Tool
An ORM tool simplifies the data creation, data manipulation and data access. It is a programming technique that maps the object to the data stored in the database.

# What is JPA?
Java Persistence API (JPA) is a Java specification that provides certain functionality and standard to ORM tools. The javax.persistence package contains the JPA classes and interfaces.

# Hibernate Lifecycle

Here we have given the example of Hibernate Lifecycle or in other words, we can say that we have created the lifecycle of the mapped instances of the entity/object classes in hibernate. In Hibernate, we can either create a new object of an entity and store it into the database, or we can fetch the existing data of an entity from the database. These entity is connected with the lifecycle and each object of entity passes through the various stages of the lifecycle. 

There are mainly four states of the Hibernate Lifecycle :

1. Transient State
2. Persistent State
3. Detached State
4. Removed State

## State 1: Transient State

The transient state is the first state of an entity object. When we instantiate an object of a POJO class using the new operator then the object is in the transient state. This object is not connected with any hibernate session.

Ex. 

//Here, The object arrives in the transient state.

Employee e = new Employee();   
e.setId(21);  
e.setFirstName("Neha");  
e.setMiddleName("Shri");  
e.setLastName("Rudra");

## State 2: Persistent State

Once the object is connected with the Hibernate Session then the object moves into the Persistent State. So, there are two ways to convert the Transient State to the Persistent State :

- Using the hibernated session, save the entity object into the database table.
- Using the hibernated session, load the entity object into the database table

Ex.
session.save(e);
## State 3: Detached State

For converting an object from Persistent State to Detached State, we either have to close the session or we have to clear its cache. As the session is closed here or the cache is cleared, then any changes made to the data will not affect the database table. Whenever needed, the detached object can be reconnected to a new hibernate session.

Ex.
session.close();
## State 4: Removed State 

In the hibernate lifecycle it is the last state. In the removed state, when the entity object is deleted from the database then the entity object is known to be in the removed state. It is done by calling the delete() operation. As the entity object is in the removed state, if any change will be done in the data will not affect the database table.

Ex.
session.delete(e);
