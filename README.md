# spring-boot-disable-web-environment
Demo for Spring boot how to disable web environment
Not Work
```
new SpringApplication().setWebEnvironment(false);
@SpringBootApplication(exclude={SpringDataWebAutoConfiguration.class})
@SpringBootApplication(exclude = {EmbeddedServletContainerAutoConfiguration.class, WebMvcAutoConfiguration.class})
```
Work
```
spring.main.web-environment=false
```
