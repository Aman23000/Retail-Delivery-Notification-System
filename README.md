| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | AMAN JAIN                  |
| Date         | 09/23/2024                 |
| Course       | Fall                       |
| Assignment # | 1                          |

# Assignment Overview

This project implements a **Fully Automatic Beverage Vending Machine** that allows users to select from a variety of beverages and add condiments. It calculates the final cost based on the selected beverage and condiments. The machine brews various coffee drinks (Espresso, Americano, Latte Macchiato) and tea drinks (Black Tea, Green Tea, Yellow Tea).

# GitHub Repository Link:
[https://github.com/Aman23000/SDP_Assignment_1.git](https://github.com/Aman23000/SDP_Assignment_1.git)

# Implementation Description

The project centers around two key classes: 

1. **Beverage**: This abstract base class defines common attributes for all beverages. It has two abstract subclasses:
   - **Coffee**: For coffee drinks like Espresso, Americano, and Latte Macchiato.
   - **Tea**: For tea drinks like Black Tea, Green Tea, and Yellow Tea.

   Each drink type extends its respective abstract class and inherits predefined properties and behaviors.

2. **AutomaticBeverageVendingMachine**: This class handles key operations, such as:
   - **brew(String beverageName)**: Creates a specific beverage object based on the input.
   - **addCondiments(Beverage beverage, String condiment, int qty)**: Adds condiments like milk or sugar to the selected beverage, with a maximum of 3 units per condiment.
   - **calculateCostOfBeverage(Beverage beverage)**: Calculates the total cost by adding the base cost of the beverage to the cost of the condiments.

### Flexibility
The design is flexible because new beverages can be easily added by extending the **Coffee** or **Tea** classes. The **brew** method can be extended to support new drink types without requiring major changes.

### Simplicity and Understandability
The code is straightforward, with clear method names like **brew**, **addCondiments**, and **calculateCostOfBeverage**, making it easy to maintain. Each class has a focused responsibility, which improves readability.

### Avoidance of Duplicated Code
Code duplication is avoided by centralizing common logic in the **Beverage** class. This ensures that shared attributes (e.g., milk, sugar, cost) are defined in one place and inherited by all subclasses, improving maintainability and reducing bugs.

### Design Patterns
The project uses the **Factory Method** pattern in the **brew** method. This pattern allows the **AutomaticBeverageVendingMachine** to create different beverage objects based on user input, making the system easy to extend with new beverages in the future.

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




