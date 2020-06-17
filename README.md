# fundamentos-ra-gradle
Aprendendo fundamentos do Rest Assured e criando um projeto com o gradle

### Instalando o gradle no Ubuntu 18.04

```shell
$ wget https://services.gradle.org/distributions/gradle-6.4.1-bin.zip

$ sudo mkdir /opt/gradle

$ sudo unzip -d /opt/gradle gradle-6.4.1-bin.zip
```

### Setando variáveis de ambiente

```shell
$ sudo vi /etc/profile.d/gradle.sh
```
> Dentro do arquivo colocar os seguintes comandos:

* export GRADLE_HOME=/opt/gradle/gradle-6.4.1
* export PATH=${GRADLE_HOME}/bin:${PATH}

```shell
$ source /etc/profile.d/gradle.sh
```

### Comandos Gradle


* `$ gradle init` - cria um projeto gradle
* `$ gradle wrapper` - necessário para criar o Gradle wrapper para poder rodar o gradlew
* `$ .gradlew tasks` - mostra todas as tarefas disponíveis
* `$ ./gradlew test` - roda todos os testes do pacote 'src/test'
