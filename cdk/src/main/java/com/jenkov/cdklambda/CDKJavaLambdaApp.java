package com.jenkov.cdklambda;

import software.amazon.awscdk.App;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.Tags;


public class CDKJavaLambdaApp {

    public static void main(final String[] args) {

        var app = new App();
        var appName = "cdk-java-lambda";
        Tags.of(app).add("project", "keycore.learning");
        Tags.of(app).add("environment","dev-learning");
        Tags.of(app).add("application", appName);


        var stackProps = StackProps.builder()
                .build();

        new CDKJavaLambdaStack(app, appName, stackProps);
        app.synth();
    }
}