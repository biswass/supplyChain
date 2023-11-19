Dockerization :

mvn clean package 
java -jar .\target\supplyChain-0.0.1-SNAPSHOT.jar
docker build --tag=supplyChain:latest .
docker run -p8886:8083 supplyChain:latest 	// You can access the supplyChain service on http://localhost:8888/health
docker tag supplyChain:latest <yourDockerId>/supplyChain:latest
docker push <yourDockerId>/supplyChain:latest	// You should be logged into docker with your dockerId <yourDockerId>

// Now anyone can pull your docker image above