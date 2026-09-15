package itau.com.cadastro;

import jakarta.persistence.*;

// Entity ele transforma uma clss em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public Model(){

    }

    public Model(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
