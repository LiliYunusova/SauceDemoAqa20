1.mvn versions:display-dependency-updates
[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   io.github.bonigarcia:webdrivermanager ................. 5.3.2 -> 5.3.3
[INFO]   org.seleniumhq.selenium:selenium-java .............. 3.141.59 -> 4.9.1
[INFO]   org.testng:testng ..................................... 7.7.1 -> 7.8.0
2. mvn clean test
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 18.22 s - in TestSuite
3. mvn test -Dlogin=standard_user -Dpassword=secret_sauce
