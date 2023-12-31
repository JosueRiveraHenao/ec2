#!/bin/bash

name_image="ec2_spring_boot"

docker stop $(docker ps -q --filter name=$name_image)
docker rm $(docker ps -aq --filter name=$name_image)

cd ../

docker build -t $name_image .
docker run -e PORT_APP=${{ vars.PORT_APP }} -e CONTEXT_PATH_APP=${{ vars.CONTEXT_PATH_APP }} -d -p 8082:8082 --name $name_image $name_image
