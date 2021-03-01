# Java - IDE - Git - Maven :: introductory exercises 

**Task 1 - Java**
- Install one of the newest Java (JDK 13/14/15): [jdk-link](https://www.oracle.com/java/technologies/javase-downloads.html)
- Set environment variable: *JAVA_HOME* in your operating system
- Using command line or terminal, type: *java -version*
- ![](https://github.com/zzpj/pl-java2021/blob/master/java_config_13.jpg "jdk13 windows")

**Task 2 - Git**
- Github account creation: [sign up](https://github.com/)
- Git familiarization: [learn git branching](https://learngitbranching.js.org/)

**Task 3 - IDE**
- If you do not have Integrated Development Environment (IDE), it is a perfect time to install!
- **Recommendation:** IntelliJ
- Other: Eclipse or Netbeans

**Task 4 - Maven I (+ Lombok)**
- Familiarize with some theory - [short presentation](https://github.com/zzpj/pl-java2021/blob/master/ZZPJ2021-maven.pdf)
- [Download maven package](https://maven.apache.org/download.cgi?Preferred=http%3A%2F%2Fapache.mirrors.tworzy.net%2F#)
- Set environment variable: `MAVEN_HOME`
- Using command line or terminal, check your maven version: `mvn -v` or `mvn --version`
- Generate project with the archetype „quickstart” (default): `mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4`
- Import project into IDE
- Review `pom.xml`
- Build package using Maven (using command line): `mvn clean install`
- Add project's lombok dependency 
    ```
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.6</version>
      <scope>provided</scope>
    </dependency>
    ```
- Create simple Java class with lombok annotation
- Build again using Maven

**Task 5 - Maven II**
- Create two independent projects
- First provides model-api (use lombok lib)
- Second uses provided api (create model class instances and prints them on console)
- Provide several release versions with updated api
- Localize where model the jars have been deployed
 
**Task 6 - Maven III**
- Create two separate profiles and three properties files 
- First `dev` profile is for developing purposes and reads `config.dev.properties` file 
- Second `prod` profile is for release purpose and reads `config.prod.properties` file
- Third properties file should be named: `config.properties`
    - All useful code snippets could be found [here](https://github.com/zzpj/pl-java2021/blob/master/maven-helpful-snippets.md) 




