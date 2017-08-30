# Valtech2
Valtech QA challenge

Before running this test, you may be required to;

Have Maven installed on the machine in which you're going to run the tests.

Download and unzip the chrome web driver for selenium and place somewhere convenient http://chromedriver.storage.googleapis.com/index.html?path=2.31/ (you'll have to select the zip file that fits the OS of the machine you'll be running the test on) and store it in a suitable location.

Go into the configuration file (https://github.com/arthurogunfiye/Valtech2/blob/master/Valtech/configuration/config.properties) and edit it to the location where the chromedriver is stored i.e. chromeDriver = PATH_TO_YOUR_CHROME_DRIVER

You might also need to change some parameters in the TestNG xml file (https://github.com/arthurogunfiye/Valtech2/blob/master/Valtech/runTestCases.xml) with which you'll run the test depending on the machine and OS of the machine e.g. If you're running the test on a MAC - parameter name="os" value="OS X", parameter name="osVersion" value="Sierra".

To run the tests, in your IDE (I used Eclipse), just right-click on runTestCases.xml, scroll down to "Run As" and select "TestNG Suite".

You could also run the tests from the command-line with the following commands (Ensure you're pointing to the location where the pom.xml file is);

mvn clean

mvn generate-sources

mvn test -DbrowserName=chrome -Dos=OS X -DosVersion=Sierra -Dversion=60 -Denvironment=LIVE -DxmlFileName=runTestCases.xml

mvn test -DbrowserName=chrome -Dos=WINDOWS -DosVersion=10 -Dversion=60 -Denvironment=LIVE -DxmlFileName=runTestCases.xml if running on a WINDOWS 10 machine
