# NomoFramework

NomoFramework is a Java framework designed for automated testing of mobile applications using Appium and Cucumber.

## Project Structure

The project structure consists of the following key components:

- `pages`: Contains page object classes representing different screens or components of the mobile application.
- `tests`: Contains test classes implementing test scenarios for the mobile application.
- `runner`: Contains the test runner class responsible for executing Cucumber scenarios.

## Dependencies

This project uses the following dependencies:

- [Cucumber](https://cucumber.io/): A behavior-driven development (BDD) tool that supports the development of software through executable specifications.
- [Appium Java Client](http://appium.io/docs/en/about-appium/intro/): A Java client for Appium, which is an open-source tool for automating mobile applications.
- [TestNG](https://testng.org/doc/): A testing framework inspired by JUnit and NUnit but introducing new functionalities that make it more powerful and easier to use.

## Installation

To use this project, follow these steps:

1. Clone the repository:
    ```bash
    git clone https://github.com/iamaakrutis/NomoInterview.git
    cd NomoProject
    ```

2. Install dependencies:
    ```bash
    mvn install
    ```

## Usage

To write and run tests using this framework, follow these steps:

1. Create your test scenarios using Cucumber feature files and step definitions.
2. Utilize the page object model provided in the `pages` package
