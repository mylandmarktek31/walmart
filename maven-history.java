    1  sudo hostnamectl set-hostname maven
    2  sudo su - ec2-user
    3  ll
    4  cd java-projects/
    5  ll
    6  cd msa/
    7  ll
    8  vi pom.xml
    9  mvn package
   10  ls
   11  ls java-projects/
   12  ls java-projects/meapp/
   13  ls java-projects/msa/
   14  ls java-projects/mva/
   15  git clone https://github.com/awoyinfa/maven-enterprise-application
   16  ll
   17  ls maven-enterprise-application/
   18  sudo rm -rf maven-enterprise-application/
   19  ll
   20  git clone https://github.com/mylandmarktechs/maven-enterprise-application
   21  ll
   22  sudo rm -rf maven-enterprise-application/
   23  git clone https://github.com/mylandmarktechs/maven-enterprise-application
   24  git clone https://github.com/Landmark-Technologies/maven-standalone-application
   25  ll
   26  mv maven-enterprise-application maven-standalone-application ts
   27  mkdir ts
   28  mv maven-enterprise-application maven-standalone-application ts
   29  cd ts/
   30  ll
   31  git clone https://github.com/LandmakTechnology/maven-web-application
   32  ll
   33  mv maven-web-application/ web
   34  ls
   35  cd web/
   36  ls
   37  ll
   38  mvn package
   39  ll
   40  ls target/
   41  vi key.pem
   42  ls -l key.pem
   43  chmod 400 key.pem
   44  ls -l key.pem
   45  scp -i key.pem tesla.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   46  ll
   47  ls target/
   48  scp -i key.pem tesla.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   49  ls tesla/
   50  ls -l tesla/
   51  ls target/tesla/
   52  scp -i key.pem tesla.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   53  scp -i key.pem maven-web-application-0.0.2-20230321.001301-1.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   54  ll
   55  cd target/
   56  ll
   57  scp -i key.pem tesla.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   58  sudo scp -i key.pem tesla.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   59  sudo scp -i key.pem target/tesla.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   60  sudo scp -i key.pem target/tesla.war ec2-user@3.15.168.218:22/opt/tomcat9/webapps/
   61  sudo scp -i key.pem target/tesla.war ec2-user@3.15.168.218:8080/opt/tomcat9/webapps/
   62  sudo scp -i key.pem target/tesla.war ec2-user@3.15.168.218/opt/tomcat9/webapps/
   63  sudo scp -i key.pem target/tesla.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   64  cd ..
   65  sudo scp -i key.pem target/tesla.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   66  scp -i key.pem target/tesla.war ec2-user@3.15.168.218:/opt/tomcat9/webapps/
   67  history
