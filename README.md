# Spring Cloud Config Server backed git

#### pom.xml

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-server</artifactId>
</dependency>
```

#### application.properties

```yaml
spring:
  application:
    name: config-server-git
  profiles:
    active: git
  cloud:
    config:
      server:
        git:
          # public repo doesn't need auth
          uri: https://github.com/w22116972/spring-config-server.git
          # what the path in Git is to look for config files
          search-paths: src/main/resources/config
          clone-on-start: true
server:
  port: 8888
```

## read config from restful

create `app1-dev.properties` under `resources/config/`

#### 1. read config file directly
- `http://localhost:8888/GIT_BRANCH/APP_NAME-PROFILE_NAME.properties`
- `http://localhost:8888/master/app1-dev.properties`

#### 2. read properties
- `http://localhost:8888/CONFIG_FILE_NAME/PROFILE_NAME`
- `http://localhost:8888/app1-dev/dev`


---

# Client

#### pom.xml

```xml
<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```

#### application.properties

```properties
spring.application.name=config-client
spring.cloud.config.uri=http://localhost:8888
```

