# Assessment
## TDD ##
- null = null (The List is null)
- 1->null => 1->null (The list has one node with value 1)
- 1->2->3 => 3->2->1 (Method returns output with expected length)
- 1->2->3 => 3->2->1 (Method returns reversed list)
- -1->-2->-3 => -3->-2->-1 (The list has negative values)
- The input List is huge.
- The list has extreme values of Integer.
- 1->1->2->2->3 => 3->2->1 (The list has duplicates)
- 1->2->3 => 3->2->1 (The list has odd number of Nodes)
- 1->2->3->4 => 4->3->2->1 (The list has even number of Nodes)
- Method does not return looped list
- Input list has a loop

#### The JUnit test cases for all the above can be run using the TestSuite ####

## Design Pattern ##
### Factory Pattern ###
There are two different types of factory pattern
  - Factory Method Pattern
  - Abstract Factory Pattern
 
 #### Factory Method Pattern ####
- Scenario 1: Let us consider a user wants to choose a streaming service package based on budjet and gell the all the detais of the package
 such as Cost, Timeline, Number of Screens and Subscription details.
        - The class has to return the required package details in consideration to budjet.
        - instansiate and return the right object as requested by the client
        - Manage the dependencies of the object.
 - Scenario 2: Let us consider a client wants to know the details of the current packege he is subscribed to and get all the details such as 
  when the package has been subscribed to and the end date of the subscription.
        - The class has to return the required package details in consideration to budjet.
        - Make any database connections if required to get the details and instanstiate the object
        - Manage the dependencies of the object.   
- Solution: Factory method pattern gives us the optimal solution providing us with a Factory class which manages all the dependencies and 
 provides the client with only the required object abstracting all the other details.
 - The factory method pattern was implemented for the above two scenarios and a subscription factory class has been created at 
 ***DesignPattern/FactoryPattern*** along with the client at the same level.
 
 #### Abstract Factory Pattern ####
 - Scenario : let us consider the same scenario as before, but now the user wants to choose the streaming service as well. Such as Netflix or
    Hulu and then proceed to choose a package based on his budget or get the current subscription details depending on the transaction ID.
- Solution :  Abstract factory pattern works best for these pruposes and works like a factory producing other factories 
  ( HuluSubscriptionFactory, NetflixFactory) depending on the users requirment and the user can carry on choose a package or get details of 
  the package he is subscribed to.
  - The Abstract factory method pattern was implemented for the scenario as StreamingFactory at ***DesignPattern/AbstractFactoryPatternAbstractFactory***
  with the client at the same level

## What is Session? ##
The Hibernate Session can be considered as an object that does a small unit of work, it is the run time interface between the ORM(Hibernate) and the Java application
- It is used to get a physical connection with a database and provides an interface between application and data
  stored in the database.
- The interface provides methods to insert, update and delete the instances of mapped entity classes.

## Trasaction Control with Spring and Hibernate ## 
Spring and Hibernate usually deal with transactions at different levels. Hibernate's transactions are specifically related to changes made within a database while Springs concept of transaction is at a higher level than the database specific transactions.
- Scenario : Lets us conisder funds are being transferred from one account to another account, it involves many steps.
  * Verifying the account of funds transferring from and to.
  * The amount being transferred actaully exists in the transferring account
  * Amount has been deducted and added to the to and from accounts
 This scenario requires a particualr sequence of methods to be run and database calls to be made, so if an error occurs either during the database calls or during follwing of the sequence of steps they have to be reset and started Over. This can be achieve by using transaction management provided by Spring and Hibernate, hibernate managing the rollback of database call while Spring manages the roll back of sequence of steps if necessary.
 
Spring : It provides control over both Programmatic and Declarative transactions and the transaction managers delegate the responsibility to platform specific transaction management APIs such as JPATransaction manager, Hibernate Transaction manager, datasource transaction manager etc. _@Transactional_ annotation can be used on the method to manage the transaction in spring.

Hibernate: Hibernate has a Transaction interface which maintains abstraction from transaction implementation(JTA,JDBC). It is associate with Session and instantiated by calling session.beginTransaction().The transaction interface have two main methods commit()(to end a transcation) and rollback()(rollback the transaction) by the use of which control of a transaction is achieved.
