# PreToken Generation Lambda Trigger

### Deployment
Deployment using [Serverless Framework](https://www.serverless.com).

Requirements:
* Nodejs - [guide][node_guide]
* Java
* Gradle - [guide][gradle_guide]

Install Serverless
```shell script
npm install -g serverless
```

Build project package
```shell script
gradle build buildZip
```

Deploy to cloud
```shell script
serverless deploy
```

For more ways to deploy to aws refer to [Serverless Deploy][serverless_deploy].

[serverless_deploy]: https://www.serverless.com/framework/docs/providers/aws/guide/deploying
[node_guide]: https://nodejs.org/en/download
[gradle_guide]: https://gradle.org/install
