
# 🧠 Desafio: Aprendendo na Prática Programação Orientada a Objetos com Java

Bem-vindo(a) ao repositório do projeto **"Aprenda na Prática Programação Orientada a Objetos"**, desenvolvido durante o Bootcamp **"TONNIE - Java and AI in Europe"**, promovido pela [Digital Innovation One (DIO)](https://web.digitalinnovation.one/) em parceria com a **Tonnie**.

📌 **Objetivo do Projeto:** Aplicar os principais pilares da Programação Orientada a Objetos (POO) — **abstração, encapsulamento, herança e polimorfismo** — por meio de um projeto prático em Java que simula uma plataforma de Bootcamp.

👩‍🏫 **Professora:** Projeto guiado por [Camila Cavalcante](https://www.linkedin.com/in/cami-la/), especialista em Java e educadora da DIO.

---

## 🔧 Tecnologias Utilizadas

- Java JDK 21
- VSCode
- Git e GitHub

---

## 📝 Conceitos Praticados

- Abstração
- Encapsulamento
- Herança
- Polimorfismo

---

## 🧱 Estrutura do Projeto

O projeto simula a jornada de um desenvolvedor em um bootcamp, permitindo inscrição em cursos e mentorias, progressão de aprendizado e acúmulo de XP.

### 🧩 Classes e Models

#### 🔷 `Bootcamp`
- `nome`
- `descricao`
- `dataInicial` (data atual)
- `dataFinal` (45 dias após a data inicial)
- `conteudos` (cursos e mentorias)
- `devsInscritos`

#### 🔶 `Curso` _(herda de `Conteudo`)_
- `titulo`
- `descricao`
- `cargaHoraria`
- `calcularXP() → XP_BASE * cargaHoraria`

#### 🔶 `Mentoria` _(herda de `Conteudo`)_
- `titulo`
- `descricao`
- `data`
- `calcularXP() → XP_BASE + 20`

#### 🔷 `Dev`
- `nome`
- `conteudosInscritos`
- `conteudosConcluidos`
- `inscreverEmBootcamp(bootcamp)`
- `progredir()`
- `calcularTotalXP()`
- `exibirCursos()`

#### 🔸 `Conteudo` _(abstrata)_
- `titulo`
- `descricao`
- `XP_BASE = 10`
- `calcularXP()` _(abstrato)_

---

## 📌 Regras de Negócio

### Bootcamp
- Duração fixa de 45 dias
- Lista de devs inscritos
- Lista de conteúdos (cursos e mentorias)

### Cursos
- XP = XP_BASE × carga horária

### Mentorias
- XP = XP_BASE + 20

### Devs
- Podem se inscrever em um bootcamp
- Devem concluir os conteúdos em ordem
- XP total é a soma do XP dos conteúdos concluídos

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/laisbastosbg/projeto-bootcamp.git
   ```

2. Abra o projeto na sua IDE Java (recomendado: IntelliJ IDEA).

3. Compile e execute a classe principal (`Main.java` ou similar).

---


## 👩‍💻 Aluna

Feito por [Lais Godinho](https://github.com/laisbastosbg)

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

