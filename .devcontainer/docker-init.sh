#!/usr/bin/env bash

if docker volume create --name test &> /dev/null; then
  echo "Created volume test"
else
  echo "Failed to create volume test"
fi

docker network create test-network &> /dev/null
if [ "$?" -ne "0" ]; then
  echo "Network test-network already exists"
else
  echo "Created docker network test-network"
fi