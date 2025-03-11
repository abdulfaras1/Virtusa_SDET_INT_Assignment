Information and Steps

1- Goto GitHub repo location - https://github.com/abdulfaras1/Virtusa_SDET_INT_Assignment "Automated Testing to verify Stock info display".

2 - Import the entire project as Maven project in IntelliJ IDE

3 - Build Maven project by running command on the Terminal "mvn clean install"

4 - Once its built successfully, it should import all required dependencies

5 - Now, to run the tests, navigate to //testng Files & run the testng.xml file. This will execute the 2 test scripts in parallel on chrome, Edge and firefox browser.

6 - First test is to check 52 week high and 52 week low values of RCOM share against hard coded values in test framework. This is POSITIVE TEST.

7 - Second test is to check check 52 week high and 52 week low values of TATAMOTORS share against hard coded values in test framework. This is NEGATIVE TEST, AS IT WILL FAIL to verify values.

8 - Test execution reports are stored in //reports folder

9 - Evidence Screenshots are also stored in //reports folder

10 - POM is in //test/Java/Pages

11 - Test Scripts are in //test/Java/TestScript

12 - Logs & Reporting classes are in //test/Java/Utilities