# Pre Token Generation Lambda Trigger

Lambda for Pre Token Generation Lambda Trigger, You cna find event details in [AWS Docs][aws_docs].

Implemented Event Structure

```json
{
    "request": {
        "userAttributes": {
            "string": "string",
            . . .
        },
        "groupConfiguration": {
        "groupsToOverride": ["string", . . .],
        "iamRolesToOverride": ["string", . . .],
        "preferredRole": "string",
        "clientMetadata": {
            "string": "string",
            . . .
        }
    },
    "response": {
        "claimsOverrideDetails": {
            "claimsToAddOrOverride": {
                "string": "string",
                . . .
            },
            "claimsToSuppress": ["string", . . .],

            "groupOverrideDetails": {
                "groupsToOverride": ["string", . . .],
                "iamRolesToOverride": ["string", . . .],
                "preferredRole": "string"
            }
        }
    }
}
```

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
[aws_docs]: https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html
