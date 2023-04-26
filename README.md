# grpc-protobuf-minimum

## Introduction
This project was built using a tech stack comprising of gRPC, Protobuf, and Kotlin. The build.gradle files declare only the minimum dependencies required to ensure successful compilation and execution. This approach results in a streamlined and efficient solution that provides a comprehensive overview of how Gradle organizes and configures a project. Consequently, this project serves as an excellent demonstration for educational purposes or as a starting point for more complex projects.

## Guide
1. In the root project directory, run:
~~~shell
./gradlew installDist
~~~

2. Go to server directory, run:
~~~shell
 ./build/install/server/bin/server
~~~

3. Go to client directory, run:
~~~shell
 ./build/install/client/bin/client
~~~

## Todo List
[] Introduce Google Guice