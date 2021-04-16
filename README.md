# Cloud computing

This is a student project whose goal is to learn best practices and build a simple Spring Boot web application running on Docker using Docker-compose, Load balancer and Github actions.

## Running app
Enter command below in powershell 
> docker-compose build

Your app should be running at localhost:8081

#### Docker-compose file
- launching application and database using docker-compose file
- added volume so that the counter in the application continues to count from the previous value and after shutting down and re-igniting all containers managed by docker-compose
- the credentials for connecting the application to the database are passed as environment variables in docker-compose

#### Load balancer
- running several containers with the application using docker-compose
- each application have a separate counter
- added an environment variable for each of the applications that indicate which application returned the response and value of counter variable
- created a Load balancer and run using the same docker-compose configuration
- Load balancer is balancing traffic between applications 

#### Github actions
- created a github action that builds a Docker container and places its image on the Docker Hub
- docker-compose configuration will no longer work build but will use an image from the Docker registry 
