# Spring Cloud Config Server backed git

#### read config from restful

create `app1.properties` under `resources/config/dev`

- `http://localhost:8888/GIT_BRANCH/APP_NAME-PROFILE_NAME.properties`
- `http://localhost:8888/master/app1-dev.properties`

