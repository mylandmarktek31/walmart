[ec2-user@tomcat webapps]$ history
    1  cd /opt
    2  sudo yum install git wget -y
    3  sudo yum install java-1.8.0-openjdk-devel -y
    4  sudo yum install wget unzip -y
    5  sudo yum install vim -y
    6  vi tomcat.sh
    7  vi testtomcat.sh
    8  sudo wget  https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.73/bin/apache-tomcat-9.0.73.zip
    9  sudo unzip apache-tomcat-9.0.73.zip
   10  ll
   11  sudo rm -rf apache-tomcat-9.0.73.zip
   12  sudo mv apache-tomcat-9.0.73 tomcat9
   13  ll
   14  sudo chmod 777 -R /opt/tomcat9
   15  sudo chown ec2-user -R /opt/tomcat9
   16  sh /opt/tomcat9/bin/startup.sh
   17  sudo ln -s /opt/tomcat9/bin/startup.sh /usr/bin/starttomcat
   18  sudo ln -s /opt/tomcat9/bin/shutdown.sh /usr/bin/stoptomcat
   19  starttomcat
   20  clear
   21  ll
   22  ls -l tomcat9/
   23  systemctl tomcat status
   24  systemctl tomcat
   25  curl -v localhost:8080
   26  clear
   27  ll
   28  cd tomcat9/
   29  ll
   30  ls conf/
   31  vim conf/server.xml
   32  find / -name context.xml
   33  sudo find / -name context.xml
   34  clear
   35  sudo find / -name context.xml
   36  sudo find / -name server.xml
   37  vim /opt/tomcat9/conf/server.xml
   38  sudo find / -name context.xml
   39  sudo find / -name server.xml
   40  vim /opt/tomcat9/conf/server.xml
   41  vi /opt/tomcat9/webapps/manager/META-INF/context.xml
   42  vi /opt/tomcat9/conf/tomcat-users.xml
   43  ls
   44  ls webapps/
   45  cd webapps/
   46  ll
   47  sudo mv maven-web-application-0.0.2-20230321.001301-1.war/ maven-web-app.war
   48  sudo mv maven-web-application-0.0.2-20230321.001301-1/ maven-web-app
   49  ll
   50  sudo rm -rf maven-web-application-0.0.2-20230321.001301-1
   51  ll
   52  sudo rm -rf maven-web-application-0.0.2-20230321.001301-1
   53  cd ..
   54  ll
   55  cd webapps/
   56  ll
   57  ls /opt/tomcat9/webapps/
   58  git clone git clone https://github.com/LandmakTechnology/maven-web-application
   59  git clone https://github.com/LandmakTechnology/maven-web-application
   60  ll
   61  ls maven-web-app
   62  sudo mv maven-web-application-0.0.2-20230321.001301-1.war/ maven-web-app.war
   63  ls
   64  ls /opt/tomcat9/webapps/
   65  history
