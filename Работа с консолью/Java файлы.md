# Запуск Java файлов на компьютере

javac 

Компиляция в исходный байт-код:
```bash
javac -encoding UTF-8 Hello.java

```

Запуск "Class" файла
```bash 
java -Dfile.encoding=UTF-8 Hello
```

В cmd консоли на Windows команда
```shell
chcp 65001
```

## Компиляция нескольких файлов

```bash
javac -d <имя_папки_куда_скомпилировать> <кодировка> <расположение java файлов с указанием маски для компиляции>
```

```bash
javac -d bin -encoding UTF-8 ./src/*.java
```
// папку bin он создаст автоматически
много файлов одновременно, после тестирования нужно приводить файлы к исходному виду


```bash
java -cp bin Main
```

##  JAR 
это Java Archieve для 
передачи другим
нужны как библиотеки для модулей
### Файл Манифеста JAVA программы
`MANIFEST.MF`
В архиве `META-INF/MANIFEST.MF`
какая информация хранится в манифесте?
- версия спецификации для манифестов
- Created-by: кем создана спецификация
- Main-Class (Application Entry Point) for more details see Anton's link 
### Как работать с JAR
1. Сначала нужно все файлы скомпилировать в байт код командой javac
Далее упаковать файлы в архив командой:
```bash
jar cfe <имя jar файла> <имя_стартового_класса> <список файлов>
```

```bash
javac -d bin -encoding UTF-8 ./src/*.java
```
/c/Users/student/Svetlana Java Git/QA-java-example-repo-02
java -jar libray.jar

СМ. файл Антона "Запуск Java", перенести ИНФО 
2. 
```bash
jar cfe libray.jar Main -C bin .
```

Флаги для команды jar (Options)
- `c` create создать новый файл  `-c` or `--create` Creates the archieve
- `f` (filename) предупреждает, что после него будет имя создаваемого jar-файла
- `e` (entrypoint) указывает на название класса, с которого нужно начать выполнение программы
Это флаги как выше `cfe` 


3. Запускаем
```bash
java -jar library.jar
```
