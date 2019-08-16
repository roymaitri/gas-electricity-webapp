Pre-requisites: Java, Eclipse for Java with Maven plugin

# Project structure:
* assignment.runpath.webapp: contains the class to glue the feature files with the srep definition in Selenium. Run this file as a JUnit test to run the project.
* assignment.runpath.webapp.features: has the feature file where we have written the tests in BDD syntax.
* assignment.runpath.webapp.pages has the classes to manipulate the web elements in invidual pages and the correspoding step definitions.
* assignment.runpath.webapp.setup: contains the initial, close functionalities, where the webdriver is opened and closed. IT also contains Utils class which manages different waiting schemes.
	assignment.runpath.genreport has the file to generate a report.

# Steps to execute
* HomePageTest.java as a JUnit Test.
* Then run the GenerateHtmlReport to get the report in html
