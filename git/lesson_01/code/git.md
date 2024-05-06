## GIT - распределенная система контроля версий

**Git** — это набор консольных утилит, которые отслеживают и фиксируют изменения в файлах (чаще всего речь идет об исходном коде программ, но вы можете использовать его для любых файлов на ваш вкус)

С его помощью вы можете сравнивать, анализировать, редактировать, сливать изменения и возвращаться назад к последнему сохранению. Этот процесс называется контролем версий.

Для чего он нужен?

Ну, во-первых, чтобы отследить изменения, произошедшие с проектом, со временем.
Во-вторых, он чрезвычайно полезен при одновременной работе нескольких специалистов, над одним проектом.

Git является **распределенным**, то есть не зависит от одного центрального сервера, на котором хранятся файлы. Вместо этого он работает полностью локально, сохраняя данные в директориях на жестком диске, которые называются репозиторием.
Тем не менее вы можете хранить копию репозитория онлайн, это сильно облегчает работу над одним проектом для нескольких людей.

Для этого используются сайты вроде github и bitbucket.

## Часто используемые команды 

`git init` - Позволяет проинициализировать репозиторий в текущей папке

`git status` - Показывает текущий статус репозитория. Она показывает, какие файлы изменены, подготовлены к коммиту или не отслеживаются

### git add
`git add` Отслеживает изменения файлов 

`git add index.html` - добавляет index.html

`git add .` - добавляет все файлы в проекте 

### git commit
Команда `git commit` сохраняет изменения в коммит.

`git commit` - Сохраняет изменения в коммит

`git commit -m 'commit message'` - создает коммит с сообщением


### git branch
Работа с ветками в репозитории

`git branch` - показывает список веток 

`git branch branch-name` - создает новую ветку branch-name

`git branch -D branch-name` - удаляет ветку branch-name 

`git checkout` - Переключается на другую ветку

`git checkout branch-name` - переключается на последний коммит в ветке branch-name

`git checkout -b branch-name` - создает и переключается на ветку branch-name 



### git merge
Совмещает текущую ветку с выбранной 

`git merge branch-name` - совмещает текущую ветку с branch-name 


### git config
Конфигурация и параметры git 


`git config --global user.name` - Показывает имя пользователя 

`git config --global user.name “new user”` - Изменяет имя пользователя 

`git config --global user.email` - Показывает email пользователя 

`git config --global user.email “test@mail.com”` - Изменяет email пользователя 

`git remote add origin https://github.com/tutorial/awesome-project.git` = Связать локальный репозиторий с репозиторием на GitHub


`git push` - Заливает текущие локальные коммиты в удаленный репозиторий

`git pull` - Забирает изменения с удаленного репозитория в локальный

`git clone` = Клонирует проект с удаленного репозитория 


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

## GIT - Distributed Version Control System

**Git** is a set of command-line utilities that track and record changes in files (usually referring to source code of programs, but you can use it for any files you prefer).

With its help, you can compare, analyze, edit, merge changes, and revert back to previous states. This process is called version control.

### Why is it needed?

Firstly, to track changes that have occurred in a project over time.
Secondly, it's extremely useful when multiple specialists are working concurrently on a single project.

Git is **distributed**, meaning it doesn't rely on a single central server to store files. Instead, it operates entirely locally, storing data in directories on the hard drive, which are called repositories.
However, you can also store a copy of the repository online, greatly facilitating collaboration on a project among multiple people.

For this purpose, websites like GitHub and Bitbucket are used.


## Commonly Used Commands

`git init` - command allows you to initialize a repository in the current directory. This sets up the necessary Git infrastructure for version control

`git status` - command provides information about the current status of your repository. It shows you which files are modified, staged, or untracked.

### git add
`git add` The command is used to track changes in files

`git add index.html` - stages changes in index.html

`git add .` - stages all files in the project

### git commit
`git commit` command saves changes in a commit.

`git commit` - opens the commit editor to save changes

`git commit -m 'commit message'` - creates a commit with a specified message

These commands are crucial for managing your version control workflow effectively.

### git branch

In this section, we'll cover important Git commands for working with branches in your repository.

`git branch` - shows a list of branches

`git branch branch-name` - creates a new branch named branch-name

`git branch -D branch-name` - deletes the branch branch-name

`git checkout` - switches to another branch

`git checkout branch-name` - switches to the latest commit in the branch branch-name

`git checkout -b branch-name` -creates and switches to the branch branch-name


These commands are vital for managing branches and organizing your development workflow.


### git merge
Combines the current branch with another branch

`git merge branch-name` - merges the current branch with branch-name


### git config
Configuration and Git parameters.

`git config --global user.name` - displays the user's name

`git config --global user.name “new user”` - changes the user's name

`git config --global user.email` - displays the user's email

`git config --global user.email “test@mail.com”` - changes the user's email

`git remote add origin https://github.com/tutorial/awesome-project.git` - links the local repository with a repository on GitHub.



`git push` - Uploads current local commits to a remote repository

`git pull` - Fetches changes from a remote repository to the local repository

`git clone` - Clones a project from a remote repository

</details>
