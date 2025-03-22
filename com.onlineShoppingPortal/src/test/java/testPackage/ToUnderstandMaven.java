package testPackage;

public class ToUnderstandMaven {
	
	/*
	==== FOR EXECUTING MAVEN BUILDS -->CREATE BUILD AND EXECUTE ALL THE BATCH FILES CREATED AT A TIME ====
	-- After end of <dependencies/> tag  and before end of <Project> tag
	-- Need to create build from <build tag>
	-- To run this --> right click within pom.xml file --> run as Maven test -- will execute all the testcases ends with _Test from mentioned batch i.e. .xml files
	
	 </dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.2.5</version>
				<configuration>
				<suiteXmlFiles>
				<suiteXmlFile>BikesBatch.xml</suiteXmlFile>
				<suiteXmlFile>CarsBatch.xml</suiteXmlFile>
				</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>
	 */
	
	/*
	==== MAVEN PROFILING ====
	-- If we created the batch(.xml) file which contains the Testcases needs to run and don't want to execute all of the .xml files 
	-- So, will go for profiling --means executing a selected/single build (batch file) -- using command prompt
	-->Click on pom.xml file then shown in system explorer -->click at the top where it is showing folder path
    -->type cmd and enter -->will open the command prompt --> then use the following commands as -->
    --> mvn test -P IDname   (ID name -- is id given for build which we want to execute)
    -- After end of <dependencies/> tag  and before end of <Project> tag --> Within <profiles> tag we can use <profile> tag as per requirement depends on build to execute
    -- Can give any name as ID	 
	 </dependencies>
	<profiles>
		<profile> 
			<id>B</id>   
			<build>
				<plugins>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-surefire-plugin</artifactId>
						<version>3.2.5</version>
						<configuration>
							<suiteXmlFiles>
								<suiteXmlFile>BikesBatch.xml</suiteXmlFile>
							</suiteXmlFiles>
						</configuration>
					</plugin>
				</plugins>
			</build>
		</profile>
		<profile>
			<id>C</id>
			<build>
				<plugins>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-surefire-plugin</artifactId>
						<version>3.2.5</version>
						<configuration>
							<suiteXmlFiles>
								<suiteXmlFile>CarsBatch.xml</suiteXmlFile>
							</suiteXmlFiles>
						</configuration>
					</plugin>
				</plugins>
			</build>
		</profile>
	</profiles>
</project>
	 */
	
	/*
	 ==== HOW TO CREATE MAVEN PROJECT ====
	 File > New > Project > Maven Project > Check the option Create simple project > Give Group Id means organization name > Give Artifact Id means project name > Click on Finish
	 
	 == For setting up JRE System Library
	 Always make sure system Java version and the eclipse java version should match --usually should be above 18
	 To check System Java version: In command prompt type as: java --version
	 
	 Right click on JRE System Library > Build Path > Configure Build Path > Within Libraries tab > 
	 >Double click on JRE System Library > Set Execution Environment as same version as system java -currently set as java 22 >
	 >Set Alternate JRE as same version as system java -currently set as java 22 -- if not available don't select anything
	 */
}
