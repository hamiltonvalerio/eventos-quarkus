<p align="center">
  <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" width="100" alt="project-logo">
</p>
<p align="center">
    <h1 align="center">EVENTOS-QUARKUS</h1>
</p>
<p align="center">
    <em><code>► Exemplo de aplicação com 2 microsserviços utilizando arquitetura hexagonal, quarkus, kafka, mongo</code></em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/hamiltonvalerio/eventos-quarkus?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/hamiltonvalerio/eventos-quarkus?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/hamiltonvalerio/eventos-quarkus?style=default&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/hamiltonvalerio/eventos-quarkus?style=default&color=0080ff" alt="repo-language-count">
<p>
<p align="center">
	<!-- default option, no dependency badges. -->
</p>

<br><!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary><br>

- [ Overview](#-overview)
- [ Features](#-features)
- [ Repository Structure](#-repository-structure)
- [ Modules](#-modules)
- [ Getting Started](#-getting-started)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Tests](#-tests)
- [ Contributing](#-contributing)
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)
</details>
<hr>

##  Overview

<code>►  Microsserviços em Java 17 e Quarkus, utilizando arquitetura hexagonal, kafka, mongo</code>

![](hexagonal-reserva.drawio.png)
---

##  Features

<code>► Java 17
► Quarkus
► Docker
► Kafka
► Mongo
► Feign</code>

---

##  Repository Structure

```sh
└── eventos-quarkus/
    ├── Docker
    │   └── docker-compose.yml
    ├── README.md
    ├── ms-eventos-quarkuskafkamongo
    │   ├── .dockerignore
    │   ├── .gitignore
    │   ├── .mvn
    │   ├── README.md
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   └── src
    └── ms-eventos-restquarkuskafka
        ├── .dockerignore
        ├── .gitignore
        ├── .mvn
        ├── README.md
        ├── mvnw
        ├── mvnw.cmd
        ├── pom.xml
        └── src
```

---

##  Modules

<details closed><summary>Docker</summary>

| File                                                                                                           | Summary                         |
| ---                                                                                                            | ---                             |
| [docker-compose.yml](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/Docker/docker-compose.yml) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo</summary>

| File                                                                                                             | Summary                         |
| ---                                                                                                              | ---                             |
| [mvnw](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/mvnw)         | <code>► INSERT-TEXT-HERE</code> |
| [mvnw.cmd](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/mvnw.cmd) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo..mvn.wrapper</summary>

| File                                                                                                                                                                | Summary                         |
| ---                                                                                                                                                                 | ---                             |
| [MavenWrapperDownloader.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/.mvn/wrapper/MavenWrapperDownloader.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.infra.kafka.reserva</summary>

| File                                                                                                                                                                                              | Summary                         |
| ---                                                                                                                                                                                               | ---                             |
| [ReservaConsumerImpl.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/infra/kafka/reserva/ReservaConsumerImpl.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.adapter.input.dto</summary>

| File                                                                                                                                                                          | Summary                         |
| ---                                                                                                                                                                           | ---                             |
| [ReservaDTO.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/adapter/input/dto/ReservaDTO.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.adapter.input.mapper</summary>

| File                                                                                                                                                                                   | Summary                         |
| ---                                                                                                                                                                                    | ---                             |
| [MapperReserva.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/adapter/input/mapper/MapperReserva.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.adapter.input.controller</summary>

| File                                                                                                                                                                                                         | Summary                         |
| ---                                                                                                                                                                                                          | ---                             |
| [ReservaMongoController.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/adapter/input/controller/ReservaMongoController.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.adapter.output.reserva</summary>

| File                                                                                                                                                                                                 | Summary                         |
| ---                                                                                                                                                                                                  | ---                             |
| [ReservaMongoAdapter.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/adapter/output/reserva/ReservaMongoAdapter.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.adapter.output.mongo</summary>

| File                                                                                                                                                                                           | Summary                         |
| ---                                                                                                                                                                                            | ---                             |
| [ReservaRepository.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/adapter/output/mongo/ReservaRepository.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.adapter.output.kafka.consumer</summary>

| File                                                                                                                                                                                                | Summary                         |
| ---                                                                                                                                                                                                 | ---                             |
| [ReservaConsumer.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/adapter/output/kafka/consumer/ReservaConsumer.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.coredomain.entity</summary>

| File                                                                                                                                                                    | Summary                         |
| ---                                                                                                                                                                     | ---                             |
| [Reserva.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/coredomain/entity/Reserva.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.coredomain.usecase</summary>

| File                                                                                                                                                                                                   | Summary                         |
| ---                                                                                                                                                                                                    | ---                             |
| [ReservaUseCasePortImpl.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/coredomain/usecase/ReservaUseCasePortImpl.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.application.ports.in</summary>

| File                                                                                                                                                                                             | Summary                         |
| ---                                                                                                                                                                                              | ---                             |
| [ReservaUseCasePort.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/application/ports/in/ReservaUseCasePort.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.java.br.eti.valerio.application.ports.out</summary>

| File                                                                                                                                                                                | Summary                         |
| ---                                                                                                                                                                                 | ---                             |
| [ReservaPort.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/java/br/eti/valerio/application/ports/out/ReservaPort.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-quarkuskafkamongo.src.main.docker</summary>

| File                                                                                                                                                           | Summary                         |
| ---                                                                                                                                                            | ---                             |
| [Dockerfile.native](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/docker/Dockerfile.native)             | <code>► INSERT-TEXT-HERE</code> |
| [Dockerfile.jvm](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/docker/Dockerfile.jvm)                   | <code>► INSERT-TEXT-HERE</code> |
| [Dockerfile.legacy-jar](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/docker/Dockerfile.legacy-jar)     | <code>► INSERT-TEXT-HERE</code> |
| [Dockerfile.native-micro](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-quarkuskafkamongo/src/main/docker/Dockerfile.native-micro) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka</summary>

| File                                                                                                            | Summary                         |
| ---                                                                                                             | ---                             |
| [mvnw](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/mvnw)         | <code>► INSERT-TEXT-HERE</code> |
| [mvnw.cmd](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/mvnw.cmd) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka..mvn.wrapper</summary>

| File                                                                                                                                                               | Summary                         |
| ---                                                                                                                                                                | ---                             |
| [MavenWrapperDownloader.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/.mvn/wrapper/MavenWrapperDownloader.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.infra.kafka.reserva</summary>

| File                                                                                                                                                                                             | Summary                         |
| ---                                                                                                                                                                                              | ---                             |
| [ReservaProducerImpl.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/infra/kafka/reserva/ReservaProducerImpl.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.adapter.input.dto</summary>

| File                                                                                                                                                                         | Summary                         |
| ---                                                                                                                                                                          | ---                             |
| [ReservaDTO.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/adapter/input/dto/ReservaDTO.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.adapter.input.mapper</summary>

| File                                                                                                                                                                                  | Summary                         |
| ---                                                                                                                                                                                   | ---                             |
| [MapperReserva.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/adapter/input/mapper/MapperReserva.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.adapter.input.controller</summary>

| File                                                                                                                                                                                              | Summary                         |
| ---                                                                                                                                                                                               | ---                             |
| [ReservaController.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/adapter/input/controller/ReservaController.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.adapter.output.restproxy</summary>

| File                                                                                                                                                                                            | Summary                         |
| ---                                                                                                                                                                                             | ---                             |
| [ReservaRestProxy.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/adapter/output/restproxy/ReservaRestProxy.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.adapter.output.reserva</summary>

| File                                                                                                                                                                                      | Summary                         |
| ---                                                                                                                                                                                       | ---                             |
| [ReservaAdapter.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/adapter/output/reserva/ReservaAdapter.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.coredomain.entity</summary>

| File                                                                                                                                                                   | Summary                         |
| ---                                                                                                                                                                    | ---                             |
| [Reserva.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/coredomain/entity/Reserva.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.coredomain.usecase</summary>

| File                                                                                                                                                                                                  | Summary                         |
| ---                                                                                                                                                                                                   | ---                             |
| [ReservaUseCasePortImpl.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/coredomain/usecase/ReservaUseCasePortImpl.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.application.ports.in</summary>

| File                                                                                                                                                                                            | Summary                         |
| ---                                                                                                                                                                                             | ---                             |
| [ReservaUseCasePort.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/application/ports/in/ReservaUseCasePort.java) | <code>► INSERT-TEXT-HERE</code> |
| [ReservaProducer.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/application/ports/in/ReservaProducer.java)       | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.java.br.eti.valerio.application.ports.out</summary>

| File                                                                                                                                                                               | Summary                         |
| ---                                                                                                                                                                                | ---                             |
| [ReservaPort.java](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/java/br/eti/valerio/application/ports/out/ReservaPort.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>ms-eventos-restquarkuskafka.src.main.docker</summary>

| File                                                                                                                                                          | Summary                         |
| ---                                                                                                                                                           | ---                             |
| [Dockerfile.native](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/docker/Dockerfile.native)             | <code>► INSERT-TEXT-HERE</code> |
| [Dockerfile.jvm](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/docker/Dockerfile.jvm)                   | <code>► INSERT-TEXT-HERE</code> |
| [Dockerfile.legacy-jar](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/docker/Dockerfile.legacy-jar)     | <code>► INSERT-TEXT-HERE</code> |
| [Dockerfile.native-micro](https://github.com/hamiltonvalerio/eventos-quarkus/blob/master/ms-eventos-restquarkuskafka/src/main/docker/Dockerfile.native-micro) | <code>► INSERT-TEXT-HERE</code> |

</details>

---

##  Getting Started

**System Requirements:**

* **Java**: `version x.y.z`

###  Installation

<h4>From <code>source</code></h4>

> 1. Clone the eventos-quarkus repository:
>
> ```console
> $ git clone https://github.com/hamiltonvalerio/eventos-quarkus
> ```
>
> 2. Change to the project directory:
> ```console
> $ cd eventos-quarkus
> ```
>
> 3. Install the dependencies:
> ```console
> $ mvn clean install
> ```

###  Usage

<h4>From <code>source</code></h4>

> Run eventos-quarkus using the command below:
> ```console
> $ java -jar target/myapp.jar
> ```

###  Tests

> Run the test suite using the command below:
> ```console
> $ mvn test
> ```

---

##  Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Report Issues](https://github.com/hamiltonvalerio/eventos-quarkus/issues)**: Submit bugs found or log feature requests for the `eventos-quarkus` project.
- **[Submit Pull Requests](https://github.com/hamiltonvalerio/eventos-quarkus/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- **[Join the Discussions](https://github.com/hamiltonvalerio/eventos-quarkus/discussions)**: Share your insights, provide feedback, or ask questions.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/hamiltonvalerio/eventos-quarkus
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="center">
   <a href="https://github.com{/hamiltonvalerio/eventos-quarkus/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=hamiltonvalerio/eventos-quarkus">
   </a>
</p>
</details>

---

##  License

This project is protected under the GNU AGPLv3 License. For more details, refer to the LICENSE file.

---

##  Acknowledgments

- List any resources, contributors, inspiration, etc. here.

[**Return**](#-overview)

---
