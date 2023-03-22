Git and SCM 
============
Landmark-SS -         Paypal:
=============================  
    Develops, Tests, Builds, deploys & monitors applications 
    Applications are the output from Softwares  

Paypal:  
   Releases:
   Releasing an application is taking/deploying it to the client
   In realtime we have multiple Releases.  

Release1 = version 1     = 1000 lines   
  echo "Welcome to Paypal"    

Release2 = version 2     = 2000 lines   
  echo "Welcome to Paypal"  
  echo "Your convenient payment gateway"
  
Release 3  = version 3  = 1000 lines of code  
echo "Paypa the best payment gateway"

Rollout   --> version1 --> version2 ---> version3  
RollBack  --> version3 --> version2

The client is not happy with the latest version of the application.   
What can we do??? RollBack

Versioning in Software Development:
===================================
Version control systems = VCS:
  Local = version1, 
          version2,[5000LINES ] 
          version3 [2000LINES ] 
   cons: Single point of failure
         lacks collaboration
         in-efficient use of resources including time  
         can't RollBack
  pros:  
  Centralised:
    cons: can't RollBack
          The central server can fail 


  Distributed VCS:
  ===============
GIT: DVCs 
  Distributed Version Control system 
  - Git manage data as snapshots. 0 / 10 / 20 / 30 / 40 / 50 / 60 / 
  - It takes a picture of what all your files look like 
     at that moment and stores 
    a reference to that snapshot.

  Benefits: Nearly every operation is local
            git has data intergrity
            Git generally only adds data


  deploy.java  
    echo "Welcome to Paypal"                    = Amaka
    echo "Paypal your payment gateway"          = Obi   
    echo "Paypal is the gateway of the future"  = Landmark   
    echo "Paypal is offering 30% discount"      = Amaka
    echo "Good deals for returing clients"      = Amaka

other DVCs:
SVN --> Sub Version
CVS --> Concurrent Version system
TFS --> Team Foundation Server
Git --> 95% plus of companies are using GIT   

Git is a Distributed Version Control systems. DVCS
In our environments (Landmark) we use Git for Versioning.  

SCM = Source Code management
=======================-====  
SCM service plaforms :
  GitHub - MS
  GitLab
  BitBucket (Stash) - A
  awsCodeCommit 

IQ: As a DevOps Engineer, what are your roles & responsilities in Versioning with Git?
Answer:
  1. We ensure that Developers environments are configured and secured 
     We create an enabling environment for Developers to code/Develope
       DevelopmentServers are created in AWS/GCP.  
       share login details with Developers/Team [ userName/password ]  
       Ensure that git package/Software is installed 

  2. Project Onboarding: 
       Create organisations where applicable in a SCM['GitHub']  
       Create repositories in SCM [GitHub] 
       Create teams in SCM and assign members[Developers, etc.] 

 3. Paypal: 
  1. Create a github account where applicable - 1:200 [0.5%]  or 
     Login into a github account
        https://github.com/
        Email address: sales@mylandmarktech.com   
        userName: Landmark31    
        password: Admin@123..

  2. Create organisation in your GitHub account for the client [Paypal] where applicable. 1:10 [10%]
        userName: legah2045    
        password: Admin@123..     
        
        organisation url =  https://github.com/LandmarkTek  


  3. Create project TEAM(S) and add members & collaborators and 
         url = https://github.com/orgs/LandmarkTek/teams/paypal   

  4. assign roles to Team members using 
     security best practices including Least Priviledges  

  4. Create repositories in the GitHub organisation for the client  : 9:10 
       url = https://github.com/LandmarkTek/paypal     = public 
       url = https://github.com/LandmarkTek/paypal-be  = private  

  6. Ensure that Git and relevant IDEs are installed by Developers 

Class31Teams:
Project:
  1a. Create your GitHub account 
  1b. Onboard our new project for ZionTech FinTech Client

  2. Managers and assistant
       Create a Team in your created organisation for paypal and add members of your 
       your group with write access 


Git Installations
-----------------
Git Installations differs depending on your operating system:
Pre Requisite Software Download/ Registration :
Install git in Windows   :  
  Install gitbash @ https://git-scm.com/downloads [git.exe]
  $ git -v
    git version 2.38.1.windows.1

Install in RedHAT Linux servers:
    sudo yum install git  -y 

Install in ubuntu Linux servers:
    sudo apt install git  -y 
===============================================================

Remote repository created in the SCM[github]  :
  https://github.com/LandmarkTek/paypal 

mkdir paypal && cd paypal

Assume the role of a Developer
We are developing for our paypal FinTech client. 
1. create a directory for Development   
   mkdir paypal && cd paypal  
2. Initialise this directory to keep track of 
   any change or changes in the files/codes  

Git Commands:
  git status 
  git init 
    create a Local repository [.git]  
  git add 
  git init  

 workingArea  stagingArea LocalRepo RemoteRepo
          git add     git commit  git push

  working area        staging     localRepo     RemoteRepo[GitHub]    :
  -----------        -------      ---------     ------------------  
  Untracked files     git add     git commit    git push 
    red                green     
 
with THE "git commit command -m " a version is created with a version number[commitID]  

git init          = to initialised a git empty repository
                    create the default branch[master, main]
git status        = to track files location
git log           = list all commits  
git add           = move files to staging area from working area
git commit -m     = move files to the local repository FROM STAGING AREA
                    good commit message for tracking changes created by authors are recommended

Walmart Back to school app   
Walmart Black Friday app  

git commit -m "1st commit of the Walmart Back to school app"

git commit -m "my 1st commit"

  DevelopmentTeam / Develop:
    Legah 
    Landmark 
    Amaka 
    chidi 
    Anna  

git config --global user.email "legah2000@gmail.com"
git config --global user.name "Legah"

git commit -m "my 1st commit"

git show commitID   
git show  98da6b1


git remote -v  

 https://github.com/LandmarkTek/paypal 

git remote add aliasName RemoteRepoURL 
git remote add pay https://github.com/LandmarkTek/paypal  

git push aliasName branchName  
git push pay master 

  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

git pull aliasName branchName   

We use git for Versioning. 

git commit -a -m "great application"
good ONLY for modify files  

Git Branch :
  In git a branch is a line of Development  
    development branch
    stage branch 
    master branch

        dev 
        stage 
        master branch




git branch -help  
==================
  binding legal document be signed
  Your integrity is the one and only binding document. 

git branch branchName   = creates a new branch
git branch development  = created the development branch 

master branch is the upstream of the Development branch  

upstream branch = development :
  development branch =  usermgt.java  = 10,000 lines  
downstream branch = stage :
  git branch stage   =  usermgt.java  = 10,000 lines    


git switch master
git diff development 
git merge development

git push aliasName --all  = push changes to all branches 
git push pay --all 

0e62e04086

IQ: How many branches are you supporting in your projects?
    Branches are used to create lines of development in git. 
    A branch is a line development 
  We maintain a minimun of 3 branches:
        development branch  
           app.java     
        staging branch  
           app.java
        master branch  
           app.java

  git branch  = list all the branches [lines of development]
  git branch branchName  = create a new branch     
  git checkout branchName = switch branches 


git remote -v 

  git fetch --> It brings changes in the code to the LocalRepo
  git pull --> It brings changes in the code to the localRepoand Working area 
  git clone --> It brings the entire code to the working area 

   From LocalRepo to RemoteRepo  = git push 
   From RemoteRepo to LocalRepo  = git fetch or git pull    


Pull Request- PR:
  PR is use to review changes in one branch before merging in another branch. 
  This is recommended for any merge in the master/release branch 
    Legah 
    Landmark 
    Amaka 
    chidi 
    Anna 
    Obi  


IDEs – Integrated Development Environment  : 
  facilitates how to Create and edit files using plugins/extensions 
    Eclipse  -  open source Java BASED IDE
    MyEclipse - not
    NetBeans  OS Heavy
    Intellij - not
    Front – End 
           VS Code
           Atom 
  files created by IDEs:      
     .classpath
    .project
    node_modules

git is use to track changes in files and for Versioning.  
  app.java 
  usermgt.java 
  test.java    
  deploy.sh  

     .classpath
    .project
    node_modules

Use the .gitignore to ignore in IDE generated files which are not part of the project.  


touch .classpath .project && mkdir node_modules  

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


IQ: Which Atlassian tools have you used in your project?  :
    BitBucket  ---> scm          = GitHub
    Bamboo --> CI/CD             = Jenkins 
    Jira -->  Ticketing tool and bug tracking
    Confluence  --> Documentation  

  working area        staging     localRepo     RemoteRepo    :
  -----------        -------      ---------     ---------  
  Untracked files     git add     git commit    git push 
    red                green     

Resloving issues:  debugging:
app.java [java project]  
app.py [python] 
  git clean -n  = Indicates files to deleted in the working area   
  git clean -f  = Delete files in the working area

app.py = print('Welcome to paypal')
app.sh = echo 'Welcome to paypal'

git reset   = Moves files from staging back to working area
      echo 'Application is Ready for deployment' >> deploy.sh 

git revert Cid = Delete the latest committed files 
                 in the LocalRepo for a specific commit

git show 3c0541aeb 

git revert 3c0541aeb 

     git add *.java 
     git add *.py 
     git add *sh 
     git add test*
     git add app*
     git add fileName 
     git add . 
     git add * 





===============================
Git video 1 - Feb 21, 2023
============================
https://landmarkmetropolitanuniversity.zoom.us/rec/share/DwgS92V9G_E6no63ZTiuJWbqytEfQsNL8Q90FdTfJZSIhByyV7bNCkSO5ZPSwC7Y.2imsVu7GgNSlyAJR

==============================
Git video 2 - Feb 25, 2023
============================
https://landmarkmetropolitanuniversity.zoom.us/rec/share/VVhAGiqXWMDdmFLJt_haVtMB6CjJTD9iP5rAxPqSZyXisW-rcnPMBUkep7sRBKVt.8N-kGWUFXqgQs-lo


==============================
Git video 3 - Feb 27, 2023
============================
https://landmarkmetropolitanuniversity.zoom.us/rec/share/CsJLgoYvQO_TbFsJds72mIvVJ5edHURdLaT8_8NUp5vkGmvzbe0dGA8sDquiBvcW.D8RpcQ8Y7KfeijGr

Do not share any Landmark resources [videos, notes, etc.] except for those on youtube
============================================================================================


