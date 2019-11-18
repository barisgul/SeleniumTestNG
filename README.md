# MavenSeleniumTestNG
This project created with Maven from Scratch and project designed wit Page Object Pattern
For testing framework TestNG used.

#Project Structure 
 
├── src/test/java     
│   ├── enums           # For Different Browser Types`chrome`, `firefox` 
│   ├── helpers         # For properties file reader
│   └── managers   		# for managing different drivers
│	└── pageObjects		# inspecting pages
│	└── testSteps  		# test scenarios (business logic)
├── src/test/resources            
    ├── drivers 		# executable driver(`chromedriver.exe`)
	├── environments    # config parameters like url, credential data etc.

Also you can see all javadoc files under the doc folder.

#Requirements
- java version "1.8.0_181"
- Apache Maven 3.6.2

#Running
For running the project first clone or download project
Go to the project root directory with `cmd` command or `powershell`
type `mvn clean`
type `mcn clean install`
type `mvn test`

#After Execution
The screenshot will be created as `screenShot"+timeStamp+".png` under the temp director
