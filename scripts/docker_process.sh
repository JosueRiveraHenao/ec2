#!/bin/bash

name_image="ec2_spring_boot"

docker ps -q -f ancestor=$name_image | xargs -r docker stop
docker ps -q -f ancestor=$name_image | xargs -r docker rm

cd ../

docker build -t $name_image .
docker run -d -p 8082:8082 --name $name_image $name_image
