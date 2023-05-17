# aws-lambda-cdk-java
A simple AWS Lambda example using Java 17 for the lambda, and AWS CDK for Java + Java 17 for deployment

This repository / project is inspired by Adam Bien's repo:

[https://github.com/AdamBien/aws-lambda-cdk-plain](https://github.com/AdamBien/aws-lambda-cdk-plain)


## Project organization
This project consists of 2 main directories:

- cdk
- lambda

The cdk directory contains the CDK Java code required to build and deploy this simple Java Lambda function.

The lambda directory contains the Lambda Java code itself.


## Build, Deployment and Destruction
The root directory of this repository contains 4 CMD files (Windows scripts) that can 
build and deploy the application to AWS via Maven and CDK.

Note: You need to have AWS CLI configured so it has access to the AWS account you want access to, 
before you can deploy the Lambda code.

The script files are:

- build-cdk.cmd
- build-lambda.cmd
- deploy-app.cmd
- destroy-app.cmd

All four scripts must be run from the root directory of the repo.
Note: As of now, each script cd's into either the cdk or lambda directory and
executes its commands. After command execution, each script attempts to cd .. 
back up to the repo root directory - but this currently fails. Thus, you must
remember to cd .. up to the repo root directory between executing each command
yourself!

