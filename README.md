# Java to generate Application Log with Log4J.
  
Java project with examples to generate Application Log with Log4J.

  ## Getting Started
  
The project, done in Java 8 using IntelliJ 2019.3 and Maven, simply shows examples of using org.apache.logging.log4j for log file generation **only for reference**:

The logs configuration is in /resource/log4j2.xml.

Contains examples of use:
  - CustomLevels: BACKUP (350), NOTICE (390) and REPAIR (380)
  - Level Range Filter:
     - From DEBUG (500) to TRACE (600) to the debug.log file
     - Less than INFO (400) for app.log
  - RollingRandomAccessFile.

### Maven:

        <dependencies>  
            <dependency> 
                <groupId>org.apache.logging.log4j</groupId>  
                <artifactId>log4j-api</artifactId>  
                <version>2.11.2</version>  
            </dependency> 
            <dependency>           
                <groupId>org.apache.logging.log4j</groupId>  
                <artifactId>log4j-core</artifactId>  
                <version>2.11.2</version>  
            </dependency>
            </dependencies>
            <build>  
                <plugins> 
                    <plugin> 
                        <groupId>org.apache.maven.plugins</groupId>  
                        <artifactId>maven-compiler-plugin</artifactId>  
                        <configuration> 
                            <source>1.8</source>  
                            <target>1.8</target>  
                        </configuration> 
                    </plugin> 
                </plugins>
            </build>


### Log Files

Location: /logs

## Authors

-   **Fausto Branco** - _Initial work_ - [Git faustobranco](https://github.com/faustobranco)
