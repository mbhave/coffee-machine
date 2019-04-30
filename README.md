# Coffee Machine Problem Set

In this problem set, you will be simulating part of an automatic coffee dispensing machine.

## System Requirements

- Java 8: If you don't have it installed, you can download it here: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html. 
Once installed, you should be able to go to the command-line and type `java -version` which should show you the version of java.
- IDE for Java development: If you don't have an IDE installed, you can download the community version of Intellij here: 
https://www.jetbrains.com/idea/download
- git: If you don't have git installed you can do that from https://git-scm.com/downloads. Once installed, you should be able to go to the command-line
and type `git –version` to get the version.

NOTE: Once you have Git installed, you’ll need to create an account on Github. All you need is the free version of the account. If
you already have an account, feel free to use it. To create your account:
1. Go to github.com
2. Enter a username, your email address, and a password. Click Sign up for Github.
3. Follow the instructions for the rest of the Github signup.

## Project Description

The application currently has two classes. 
- `CoffeeService` can be used to get the menu and make a drink from the menu. The menu contains the name of the drink and the cost.
Imagine this class to be an intermediate layer that can be called from something like a Spring MVC Controller which controls the UI.
- `Inventory`: This is an interface used to manage ingredients available to the coffee machine. Implementations of this interface should 
be able to list all the ingredients available and deduct an ingredient based on the amount used. 

## Requirements
 
Initially, the inventory contains 10 units of coffee, sugar and cream. The coffee machine should be capable of making the following drinks:

| 	Drink       | 	Ingredients										| Cost  |
| ------------- | ------------------------------------------------- | ----- |
| coffee      	| coffee (2 units), sugar (1 unit)				 	| $2.75 |
| cappuccino  	| coffee (2 units), sugar (1 unit), cream (1 unit) | $2.90 |
| caffe mocha 	| coffee (1 unit), sugar (1 unit), cream (1 unit) 	| $3.90 |

NOTE: This initial configuration does not need to be dynamic. In particular, it is acceptable to perform this initialization in code, rather than
reading the configuration from an external file or database. However, your program should be flexible enough to allow new drinks to be added to the menu 
without requiring extensive code changes.

Begin by creating a test class for an implementation of the `Inventory` interface. The test class will extend `InventoryTests` which already has tests for
how the `Inventory` should behave. You need to do override the `getInventory()` method and return an instance of your `Inventory` implementation class.

If you run the tests in `InventoryTests` now, you should see assertion failures. Modify your `Inventory` implementation to make these tests pass.
 
Move on to `CoffeeServiceTests` next. These are unit tests for `CoffeeService` which is why
the `Inventory` class is a "mock" object. You can find documentation on mocking objects in tests with Mockito [here](http://static.javadoc.io/org.mockito/mockito-core/2.22.0/org/mockito/Mockito.html).
Modify the methods in `CoffeeService` so that the `CoffeeServiceTests` pass.

NOTE: If you want to add additional functionality that is not currently defined by the tests, you can modify the tests to reflect that. However,
when doing so do not change the existing assertions in the tests.

Once those tests pass, provide the ability to add a drink to the coffee machine menu. Remember to add a test for this functionality too. 

Follow these steps to begin:

- Create a fork of this repository (https://help.github.com/articles/fork-a-repo/#fork-an-example-repository)
- Create a local copy of your fork (https://help.github.com/articles/fork-a-repo/#step-2-create-a-local-clone-of-your-fork)
- Open the project in an IDE.
- To test your setup, run `CoffeeServiceTests` in the IDE. You should get test assertion failures.
- Once you're done, commit your changes and push them to your fork. (https://help.github.com/articles/pushing-to-a-remote)
