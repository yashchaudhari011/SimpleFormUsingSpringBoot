make sure you have spring installed on your local machine.
Open this project in VS Code.
Start mySql workbench and create a new connection or use an existing one. make sure to check for the port number and match it with the port number in `application.properties` of the spring app.
open the terminal and build the project using `./gradlew clean build --warning-mode all`
run the project using `./gradlew bootRun`
open chrome or any web browser and open this URL: http://localhost:8080/
add required info and submit the form.
once submitted, open sql workbench you should be able to see the newly created table and the user entry will reflected in the table. 
