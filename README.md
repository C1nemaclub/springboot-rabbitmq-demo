# springboot-rabbitmq-demo

## Run RabbitMQ Docker Container

### Pull the image
```bash
  docker pull rabbitmq:3.10.5-management
```
### Create and Run the container
```bash
  docker run --name container-name --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.10.5-management
```
