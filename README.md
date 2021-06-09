# Application Boot
Run the following command to build the docker image:

    docker build -t config-server:latest .

And then run it:

    docker run -it --rm -p 8888:8888 --net=spring-cloud-app --name=config-server config-server:latest

