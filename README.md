
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | AMAN JAIN                  |
| Date         | 09/23/2000                 |
| Course       | Fall                       |
| Assignment # | 1                          |

# Assignment Overview
This project implements an Automatic Beverage Vending Machine. It allows users to select a beverage from a set of available options and provides the ability to add condiments from a given list. The machine is capable of calculating the final bill based on the cost of the selected beverage and any additional condiments.

# GitHub Repository Link:
[https://github.com/{YOUR_USERNAME}/cs-665-assignment-{ASSIGNMENT_NUMBER}](https://github.com/Aman23000/SDP_Assignemnt_1.git)

# Implementation Description 
The project implementation involves two major classes that hold the core functionality. The first key class is the "Beverage" class, which is an abstract base class representing the attributes shared by various types of drinks. Derived from this class are two abstract classes, "Coffee" and "Tea", which serve as the base classes for more specific drink types. These abstract classes have several child classes, each representing a specific drink, and they implement the predefined properties and behaviors outlined in their parent classes.

As mentioned, the child classes inherit predefined properties from the parent class and can extend them through the "Tea" or "Coffee" subclasses.

The second major class is the "AutomaticBeverageVendingMachine" class, which contains key methods: "addCondiments", "calculateCostOfBeverage", and "brew".

The "addCondiments" method takes three parameters:
"beverage": an already existing beverage object.
"condiments": the condiment (such as milk or sugar) to be added to the beverage.
"qty": the quantity of units of the condiment to be added.
The "brew" method is used to specify and create the desired beverage object, depending on the type of beverage requested.
The "calculateCostOfBeverage" method takes a beverage object and calculates its total cost by adding the base cost of the beverage to the cost of the condiments (based on the number of units added). The base cost differs depending on whether the beverage is "Coffee" or "Tea".

Flexibility in the Implementation:
The implementation is highly flexible due to the use of abstract classes ("Beverage", "Coffee", and "Tea"). New beverages can easily be added by creating subclasses of "Coffee" or "Tea" without affecting existing code. The "brew" method can be extended to support new types without major changes.

Simplicity and Understandability:
The code is simple and easy to understand due to clear method names like "brew", "addCondiments", and "calculateCostOfBeverage". The use of abstraction and inheritance keeps each class focused on a single responsibility, making the code easier to maintain and extend.

Avoidance of Duplicated Code:
Duplication is avoided by centralizing common functionality in the "Beverage" class, which defines shared properties and methods for all beverages. This allows changes to be made in one place, improving maintainability and reducing bugs.

Design Patterns:
The Factory Method pattern is used in the "brew" method, allowing the creation of different beverages based on input. This decouples the vending machine from specific beverage types, making it easy to extend or modify in the future.


# Maven Commands

We’ll use Apache Maven to compile and run this project. You can install it from https://maven.apache.org/.

Apache Maven is a powerful build automation and project management tool for Java projects. It offers a standardized approach to build, package, and deploy applications.

Maven uses a Project Object Model (POM) file to manage builds and dependencies. The POM file includes details about the project, such as its dependencies, build configurations, and the plugins used for tasks like packaging and testing.

Maven simplifies dependency management by using a centralized repository, making it easier to handle external libraries. It also ensures consistent and repeatable builds across different environments.

Maven integrates well with IDEs and continuous integration tools, streamlining its use in the development workflow. Additionally, it has a wide range of plugins for tasks like compiling code, running tests, generating reports, and creating JAR files, making it highly versatile for Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```

## JUnit Tests
JUnit is a widely used testing framework for Java, designed to automate the testing process and verify that code behaves as expected.

In JUnit, tests are written as methods within a test class, with each method testing a specific functionality. These methods are marked with the @Test annotation. JUnit offers various assertions to validate the behavior of the code being tested.

JUnit tests are run automatically, with results reported to help developers quickly identify and fix issues. This makes it easy to ensure that the code works as intended.

JUnit plays a key role in Test-Driven Development (TDD), where tests are written before the actual code. This approach ensures that the code is testable and that all functionality is covered by tests.

JUnit tests can also be integrated into a continuous integration (CI) pipeline, where they are executed automatically with each code change. This helps catch issues early, reduces the need for manual testing, and ensures the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




