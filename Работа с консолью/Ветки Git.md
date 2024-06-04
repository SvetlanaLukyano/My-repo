## Практика работы с ветками Git
Цель: научиться 

## Создание веток. При инициализации мы автоматически создаём ветку main (master в старых версиях)
Новая ветка возможна только при наличии изменений.
Подразумеваются коммиты.

https://www.git-scm.com/book/ru/v2/%D0%92%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B2-Git-%D0%9E-%D0%B2%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B8-%D0%B2-%D0%B4%D0%B2%D1%83%D1%85-%D1%81%D0%BB%D0%BE%D0%B2%D0%B0%D1%85

git add - Добавление в индекс.
Индекс - это БД.
При добавлении в индекс и создании коммита каждый файл сохраняет в репозиторий (Git называет такой файл _блоб_ — большой бинарный объект)

```bash
git add README test.rb LICENSE
git commit -m 'initial commit'
```

В примере выше добавлены 3 файла: 
README 
test.rb 
LICENSE

Git создаёт объект коммита с метаданными и указателем на основное дерево проекта для возможности воссоздать этот снимок в случае необходимости.

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
==$ git init==
Initialized empty Git repository in C:/Users/student/Documents/gitShowCase/.git/

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
==$ touch file_01.md==

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
==$ date >> file_01.md==

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
==$ cat file_01.md==
==Tue Jun  4 19:48:08 RTZ 2024==

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
==$ git add file_01.md==
warning: in the working copy of 'file_01.md', LF will be replaced by CRLF the next time Git touches it

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ git commit 'file added'
error: pathspec 'file added' did not match any file(s) known to git

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ git commit
[master (root-commit) 77b66d8] Добавить файл
 Committer: Svetlana L <student@top.local>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 2 insertions(+)
 create mode 100644 file_01.md

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ touch file_02.md

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ date >> file_02.md

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ file_02.md >>
bash: syntax error near unexpected token `newline'

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ cat file_02.md
Tue Jun  4 20:01:22 RTZ 2024

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ file
FileAppxStreamingDataSource.dll  file.exe
FileHistory.exe                  filemgmt.dll

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ ls >> file_02.md

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ cat file_02.md
Tue Jun  4 20:01:22 RTZ 2024
file_01.md
file_02.md

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ git add file_02.md
warning: in the working copy of 'file_02.md', LF will be replaced by CRLF the next time Git touches it

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ git commit -m "Добавить второй файл, это новый блоб"
[master 8ebc593] Добавить второй файл, это новый блоб
 Committer: Svetlana L <student@top.local>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 3 insertions(+)
 create mode 100644 file_02.md

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)
$ git log
commit 8ebc5939619468c7ce94df83c6bcdd0ea6c915fb (HEAD -> master)
Author: Svetlana L <student@top.local>
Date:   Tue Jun 4 20:06:37 2024 +0300

    Добавить второй файл, это новый блоб

commit 77b66d870ae9f8adbc5a8566ce046ef2009e2b49
Author: Svetlana L <student@top.local>
Date:   Tue Jun 4 19:52:36 2024 +0300

    Добавить файл

student@10pc4 MINGW64 ~/Documents/gitShowCase (master)



==Ветка в Git — это простой перемещаемый указатель на один из таких коммитов.==== 
=
По умолчанию, имя основной ветки в Git — `master`. Как только вы начнёте создавать коммиты, ветка `main` будет всегда указывать на последний коммит. 

Каждый раз при создании коммита указатель ветки `master` будет передвигаться на следующий коммит автоматически.


## Создание новой ветки
При создании ветки создаётся новый указатель
```bash
git branch dev
```

Куда смотрит указатель при создании ветки

![[рис.png]]
Красиво посмотреть клмандой 
```bash
git log --oneline --decorate
```

## Переключение веток
Для переключения на существующую ветку выполните команду `git checkout`. 

```bash
git checkout dev
```

