#!/usr/bin/bash


eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_rsa14may

# C:\Users\student\My-repo
cd ~/My-repo/

git pull

git add --all

git commit -m "Info: результат работы урока"

git push