#!/bin/bash

TAG=prod
SERVICE_NAME=sapient-test-harish

echo "--- RUNNING MAVEN BUILD ---";
mvn clean
mvn compile
mvn package
echo "--- MAVEN BUILD COMPLETED ---";


echo "---- BUILDING DOCKER FILE ---";
docker build -t $SERVICE_NAME:$TAG .
echo "---- COMPLETED DOCKER BUILD ----";

login=$(aws ecr get-login --no-include-email --region ap-south-1)
echo $login
$login

docker run -p 8080:8080 --rm -it $SERVICE_NAME:$TAG