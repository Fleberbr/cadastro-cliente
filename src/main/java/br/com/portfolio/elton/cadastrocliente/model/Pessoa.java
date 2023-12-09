package br.com.portfolio.elton.cadastrocliente.model;

import jakarta.persistence.*;

@Entity //Anotação necessária para o Jpa entender que essa classe é uma entidade e representa uma tabela no banco de dados.
@Table(name = "pessoa")  //esse é o nome que vai criar no h2, banco de dados da memória.
public class Pessoa {

    @Id //Essa notação diz que esse é o identificador da tabela,
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Essa notação vai gerar automaticamente o identificador do cliente, o banco de dados h2 que vai gerar o número do Id.
    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;
    @Embedded //Usado para embarcar o endereço junto com a pessoa, sendo apenas 1 tabela com todos esses dados.
    private Endereco endereco;

    public Pessoa(){}

    public Pessoa(String nome, String cpf, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
