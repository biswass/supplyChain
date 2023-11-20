Downloading and running :
git clone https://github.com/biswass/supplyChain.git
git checkout master
cd <to the directory>
mvn clean compile
Set JAVAPATH to your jdk directory eg : C:\Program Files\Java\jdk-1.8
Add jdk/bin folder to your PATH variable eg : C:\Program Files\Java\jdk-1.8
Download Eclipse or any other IDE and setup maven
Import this sourcecode as maven project
Right Click on project > Maven > Update project
Go to IAM Application.java > Right click > Run as > Java application
Hit localhost:8083/health

Dockerization :

mvn clean package 
java -jar .\target\supplyChain-0.0.1-SNAPSHOT.jar
docker build --tag=supplyChain:latest .
docker run -p8886:8083 supplyChain:latest 	// You can access the supplyChain service on http://localhost:8888/health
docker tag supplyChain:latest <yourDockerId>/supplyChain:latest
docker push <yourDockerId>/supplyChain:latest	// You should be logged into docker with your dockerId <yourDockerId>

// Now anyone can pull your docker image above