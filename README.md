# simples.etl

Biblioteca desenvolvida em Java com o objetivo de fornecer uma estrutura simples e reutilizável para a implementação de processos **ETL (Extração, Transformação e Carga)**.  
Este projeto é utilizado como dependência pela aplicação [etl.json](https://github.com/eduardoalmeidajesus/etl.json) e [etl.imobiliaria](https://github.com/eduardoalmeidajesus/etl.imobiliaria).

---

## 📚 Descrição do Projeto

O **simples.etl** concentra a lógica base de um processo ETL, permitindo que outras aplicações reutilizem componentes comuns de:

- Extração de dados;
- Transformação de informações;
- Carga de dados em diferentes tecnologias de armazenamento.

O objetivo é evitar duplicação de código e facilitar a manutenção e evolução de aplicações ETL.

---

## 🛠️ Tecnologias Utilizadas

- Java 17  
- Maven  
- Spring Boot  

---

## 📦 Como Utilizar

### Pré-requisitos

- Java 17 ou superior  
- Maven 

### Passos
1. Clonar o repositório:
   ```bash
   git clone https://github.com/eduardoalmeidajesus/etl.json.git

2. Entrar na pasta do projeto
   ```bash
   cd simples.etl

3. Instalar a biblioteca no repositório Maven local:
   ```bash
   mvn clean install

Após esse passo, a biblioteca estará disponível para uso como dependência em outros projetos Maven.

---

## 📌 Exemplo de Dependência Maven

```
<dependency>
    <groupId>br.edu.utfpr.td.tsi</groupId>
    <artifactId>simples.etl</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```


