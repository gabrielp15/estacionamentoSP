# Estacionamento SP
Sistema gerenciador de estacionamentos, escrito em Java, com uso do Spring, e aplicação de conceitos de construção de API RESTFull.

Sistema sustenta-se com base em API RESTFull construida com o Spring, com base de dados PostgreSQL, e Front-end construido no Vaadin.

Ainda estou fazendo ligações entre o Back e o Front end, e irei documentar tudo por meio deste README.

Versão atual: V0.1(Alpha) - Funcionalidades básicas da API RESTFull, banco de dados, e página "home" do Front-end.

Roadmap do sistema:

## **A ser Feito/Implementado:**

- [ ] Tratamento de exceções
- [ ] Sistema de login
- [ ] Testes unitários
- [ ] Testes de integração 
- [ ] Resto do Front-end
- [ ] Integração com API de pagamento
- [ ] Geração de NFs
- [ ] Implementação em container do Docker
- [ ] Implementação em infraestrutura de nuvem.

## Métodos implementadas na API do programa

`/cliente/new` - Método POST, utilizada para cadastrar novo cliente no BD \
`/cliente/(ID)` - Método GET, utilizada para buscar os dados de um cliente específico, informando sua PK na BD \
`/cliente/all` - Método GET, utilizada para exibir a lista de todos os clientes registrados na BD \
`/cliente/update/(ID)` - Método PUT, utilizado para atualizar dados de determinado cliente, identificado por sua PK. \
`/cliente/delete/(ID)` - Método DELETE, utilizado para excluir o registro de um cliente determinado por sua PK do BD.



## Formatação básica do JSON do método POST API RESTFull

Para enviar os dados dos clientes para o BD da aplicação, no momento de desenvolvimento, utilizei o Postman para fazer as requisições HTTP. O seu arquivo JSON tinha a seguinte estrutura:

```
{
    "nome": "AAAAAA",
    "sobrenome": "AAAAA",
    "telefone": "99 999999999",
    "placaVeiculo": "AAA9999",
    "modeloVeiculo": "Corolla 1.6 XE",
    "marcaVeiculo": "Toyota",
    "tipoUso": "Dia",
    "valorUso": 35.00,
    "tipoPagamento": "Contrato - Empresa",
    "dataEntrada": "2024-12-01T12:35",
    "dataSaida": "2024-12-02T02:34"
}
```

Onde os campos `nome`, `sobrenome`, `telefone`, `placaVeiculo`, `modeloVeiculo`, `marcaVeiculo`, `tipoUso`, `tipoPagamento` são dados fornecidos pelo cliente - que poderá ser puxado do BD, caso o cliente já seja cadastrado. \
Os campos `dataEntrada`, `dataSaida`, são preenchidos automaticamente, de acordo com o tipo de operação chamada. \
O campo `valorUso` será calculado automaticamente de acordo com a lógica de negócio do programa.
