# Consulta de CEP

Este é um projeto simples em Java que realiza consultas de CEP utilizando a API do [OpenCEP](https://opencep.com/) e salva os resultados em um arquivo JSON.

## Funcionalidades

- Consulta de informações de um CEP.
- Salva os dados dos CEPs consultados em um arquivo JSON.
- Interação simples com o usuário via terminal.

## Estrutura do Projeto

- **`app`**: Contém a classe principal e o menu para interação.
- **`service`**: Classes responsáveis pelas operações principais, como consulta de CEPs e geração de arquivos.
- **`model`**: Classes que representam os dados retornados pela API (ex.: `Cep`).

## Tecnologias Utilizadas

- **Java 11+**: Linguagem principal.
- **Gson**: Biblioteca para manipulação de JSON.
- **HttpClient**: Para realizar requisições HTTP.

## Como Usar

1. Clone este repositório.
2. Execute a classe principal (`App`) para iniciar o programa.
3. Digite um CEP (apenas números) para consultar. Para sair, digite `sair`.
4. O programa salvará os resultados no arquivo `Ceps.json`.

## Exemplo de Uso

```bash
Digite o CEP (somente números): 01001000
Buscando...
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308"
}
```

## Arquivo Gerado

```json
[
  {
    "cep": "01001-000",
    "logradouro": "Praça da Sé",
    "complemento": "lado ímpar",
    "bairro": "Sé",
    "localidade": "São Paulo",
    "uf": "SP",
    "ibge": "3550308"
  }
]
