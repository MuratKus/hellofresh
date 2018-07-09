# Home test task

**What do you already have?**
-----
 * web application with url http://automationpractice.com/index.php;
 * 3 [test cases](TESTCASES.md);
 * 3 automated tests.
 
We give the initial version of tests in order to save your time on extracting locators. 

**What do you need to do?**
----
You need to improve given automated tests as much as you can by designing your own solution to develop such kinds of tests for similar applications.
Feel free to replace any tool we used in initial version of tests(maven, junit) or add other ones, if you need.

Your solution can include:
* logging;
* taking screenshot on failed tests;
* generation human readable report;
* generating random values for insignificant test data, for example, for new user;
* WebDriver factory;
* encapsulation layers like test data, logic of tests, actions on web pages and so on;
* configurator:
  * run tests in parallel mode;
  * ability to run tests for different browsers/OS by configuring;
  * ability to run tests for different environments(urls) by configuring/by command-line.
* reading test data from file, for example, the name of dress, size and color in the checkout test.

If you would like to impress us cover as much point as you can!

**Evaluation Criteria**
-------------------
1. The improvements are done in efficient and effective manner.
2. The improved tests pass stably and follow described cases.
3. The solution is well and logically organised.
4. Tests execution does not take more time than initial version.
5. The code is documented and is easy to-follow.
6. The application is supplied with all the information required for us to run and validate it as well as a description and purpose of used additional libraries.

Answers:

Your solution can include:

* logging;
Resolved with Log4j.

* taking screenshot on failed tests;
We can see that in the class Steps in the part of @After.

* generation human readable report;
*  Is completed, we can see after the execution a log where we can see the path.

* generating random values for insignificant test data, for example, for new user;
For this point I am taking data from the api:
https://jsonplaceholder.typicode.com/users

For create a new user, you can see the setup for this in the class DataGenerator.

* WebDriver factory;
I resolved that at the moment to execute the automation, depending of the kind of test we are running.

* encapsulation layers like test data, logic of tests, actions on web pages and so on;
I resolved that with the framework architecture.

* configurator:
  * run tests in parallel mode;
This part is resolved just for mobile, in case of native applications and is resolved with the maven profiles, is possible see that in the pom file.

  * ability to run tests for different browsers/OS by configuring;
  * ability to run tests for different environments(urls) by configuring/by command-line.
This is resolved with the variable -Denv in maven and is possible see the configuration in the ParentScenario class.

* reading test data from file, for example, the name of dress, size and color in the checkout test.
This point is resolved in the class TestData where we setup all the data for all the test.


New features added:
1_Architecture,
I create the new architecture with the pattern design Page Object, with modifications to include the parallel executions for different real devices in Android or IOS, and to include in the same framework all the kind of testing like Backend, Web, Web-Mobile. In the same way this include the possibility to make end to end testing sharing information or result of test from backend and use in mobile in example.

2_Scalability,
With this new architecture is possible expand the testing more easy and is possible too the possibility to store in just one place all the automation testing, reducing the time of maintenance.

3_Mobile-Web Testing,
This framework include too 1 automation of Mobile-Web.

4_Page Object Patern,
The biggest recommendation of Selenium team, the pattern design, is included in this framework too.

5_Cucumber,
Included in the framework to make automations from the text of steps.

6_Ready for Mobile Native
The framework is ready to execute Native Mobile applications, in Android and IOS.

7_Ready for Mobile Farm
The framework is ready to execute in parallel different real devices of Android and IOS, with the end of reduce the time of execution.

8_End to End Testing,
Is included too the part to create different kind of testing too, Backend, Web, Web-Mobile, Native Android, and Native IOS, allowing to the team execute a test in backend and share the result in other test in Web or some Native App.


Video demo de la execution:
https://youtu.be/gMV6SHdOp2Q


String to execute Maven:

Mandatory variables to execute:

	testingType
	This include the definition to execute a test, the possible web, or web-mobile, or backend.
	
	parallelStatus
	This include the configuration to execute real devices in parallel.
	
	env
	This include the definition to execute in different enviroments.

Example:
mvn package -DparallelStatus=false -Denv=dev -Dcucumber.options="--tags @test" -DtestingType=web


