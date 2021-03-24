# mongoDB Demo

Comment out the properties in Application.properties file to use embeded mongodb:

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=springbootproject

Comment out below in pom.xml and keep the properties in Application.properties to use external mongodb:
		<dependency>
			<groupId>de.flapdoodle.embed</groupId>
			<artifactId>de.flapdoodle.embed.mongo</artifactId>
			<scope>test</scope>
		</dependency>
