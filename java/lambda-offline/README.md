## Serverless Offline lambda

#### Requirements:
* Nodejs - [guide][node_guide]
* Java
* Gradle - [guide][gradle_guide]
* aws-cli 


### Setup
Setting up the code
```shell script
git clone https://github.com/pratik-vii/sls-templates.git
cd ./sls-templates/java/lambda-offline
```

### Install
Install serverless
```shell script
npm install -g serverless
```

Install npm dependencies, [serverless-offline][serverless_offline]
```shell script
npm install
```


### Build
Build java zip for lambda
```shell script
gradle build buildZip
```
This will create zip file at `build/distributions/lambda-offline-1.0.zip`


### Run
Now use serverless offline plugin to run serverless application offline!
```shell script
serverless offline
```
```
offline: Starting Offline: dev/us-east-1.
offline: Offline [http for lambda] listening on http://localhost:3002
offline: Function names exposed for local invocation by aws-sdk:
           * hello: lambda-offline-dev-hello

   ┌─────────────────────────────────────────────────────────────────────────┐
   │                                                                         │
   │   GET | http://localhost:3000/dev/hello                                 │
   │   POST | http://localhost:3000/2015-03-31/functions/hello/invocations   │
   │                                                                         │
   └─────────────────────────────────────────────────────────────────────────┘

offline: [HTTP] server ready: http://localhost:3000 🚀
offline: 
offline: Enter "rp" to replay the last request

```
As you can see the serverless endpoint will be http://localhost:3002 <br/>


### Invoke
Our implemented lambda can be invoked as REST API or as lambda function.

#### API
endpoint: http://localhost:3000/dev/hello <br/>
method: GET 

#### Invoke Lambda
Now use aws-cli to invoke our offline lambda, It requires to setting up the default credentials, but you can set some
dummy values

```shell script
$ aws configure 
AWS Access Key ID [None]: ABC
AWS Secret Access Key [None]: ABC
Default region name [None]: us-east-1
Default output format [None]: 
```


Lambda invoke command,
* Endpoint url: by default `http://localhost:3002` for `serverless offline`
* Function name: {service}-{stage}-(function_name}
* Lambda response output file: `"hello-out"`
```shell script
aws lambda invoke --endpoint-url http://localhost:3002 --function-name lambda-offline-dev-hello --payload {} "hello-out"
```

As you can see in hello-out file created in current working dir will contain,
```
{"body":"Hello World!"}
```


#### This flow with is tested with 
* Java11
* Node v14.10.1
* serverless
    * Framework Core: 2.1.1
    * Plugin: 4.0.4
    * SDK: 2.3.2
    * Components: 3.1.4
* serverless-offline 6.8.0


[serverless_deploy]: https://www.serverless.com/framework/docs/providers/aws/guide/deploying
[node_guide]: https://nodejs.org/en/download
[gradle_guide]: https://gradle.org/install
[aws_docs]: https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html
[serverless_offline]: https://www.npmjs.com/package/serverless-offline