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
The Hibernate Session can be considered as an object that does a small unit of work, it is short lived and wraps the JDBC 
- It is used to get a physical connection with a database and provides an interface between application and data
  stored in the database.
- 
