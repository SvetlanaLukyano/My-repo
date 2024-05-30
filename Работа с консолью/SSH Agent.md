
Получать доступ даже к открытому public репозиторию нужно через безопасный способ, через SSH ключ


#!/usr/bin/bash
```bash
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_rsa14may
```
## C:\Users\student\My-repo
```
cd ~/My-repo/
```

```
git pull
```

```
git add --all
```

```
git commit -m "Info: результат работы урока 42"
```

```
git push
```