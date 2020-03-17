# Spring Cloud Config Server backed git

#### read config from restful

create `app1.properties` under `resources/config/dev`


- `http://localhost:8888/dev/app1.properties`
- `http://localhost:8888/prod/app1.properties`

/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties