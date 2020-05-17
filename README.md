#This is the study project to verify the core aspects of some GitHub parts using Selenium WebDriver.

To launch this code on your local machine you must have installed the following things:
1. JDK
2. Maven compiler and surefire plugins
3. At least one of the following browsers: Chrome, FireFox, IE 11.0, Edge, Opera

The following dependencies are used in pom.xml:
1. Selenium-java 
2. TestNG
3. The following drivers: Chrome driver, Firefox driver, InternetExplorer driver, Edge driver, Opera driver
4. Webdrivermanager
5. Hamcrest

To push the code you should:
1. git init (do it once)
2. git add .
3. git commit -m "write what you did"
4. git push origin master

To run the tests in ONE SPECIFIC BROWSER use the following command: mvn package -DrunnerFile=testng -Dbrowser=CHROME
(instead of CHROME you may also use the next browsers: FIREFOX, IE11, EDGE, OPERA)

To run the tests in ALL BROWSERS use the following command: mvn clean package -DrunnerFile=all_browsers

