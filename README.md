# dsmeta
Para rodar a parte de front voce precisa ter: 
## Node 16
Linux:

    sudo apt update

    curl -sL https://deb.nodesource.com/setup_16.x | sudo -E bash -

    sudo apt-get install nodejs
Windows:

NodeJS 16.x (https://nodejs.org/en/download/)
## YARN
Linux: 

No Debian e no Ubuntu:

     curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | sudo apt-key add -

     echo "deb https://dl.yarnpkg.com/debian/ stable main" | sudo tee /etc/apt/sources.list.d/yarn.list

     sudo apt-get update && sudo apt-get install yarn
