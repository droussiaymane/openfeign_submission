# openfeign_submission
!important :
- Add OpenFeign dependency from maven repository.
-----------------------------------------------------
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-openfeign</artifactId>
		</dependency>
-----------------------------------------------------
- Annotate our entrypoint class for our microservice with @EnableFeignClients
