# embededmongo
Use embeded mongodb in spring boot

Comment out the properties in Application.properties file and below in pom.xml file to use embeded mongodb.

		<dependency>
			<groupId>de.flapdoodle.embed</groupId>
			<artifactId>de.flapdoodle.embed.mongo</artifactId>
			<scope>test</scope>
		</dependency>
