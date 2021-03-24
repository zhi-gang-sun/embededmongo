# embededmongo
Use embeded mongodb in spring boot

Comment out the properties in Application.properties file to use embeded mongodb.

Comment out below in pom.xml to use external mongodb.
		<dependency>
			<groupId>de.flapdoodle.embed</groupId>
			<artifactId>de.flapdoodle.embed.mongo</artifactId>
			<scope>test</scope>
		</dependency>
