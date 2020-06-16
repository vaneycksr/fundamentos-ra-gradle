package fundamentos.ra.gradle.dominio;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

// Classe utilizada para auxiliar a serializacao do objeto
@JsonIgnoreProperties(ignoreUnknown = true) // ignora propriedades que nao esta mapeadas
//@Getter // cria um get para todos os atributos da classe
//@Setter // cria um set para todos os atributos da classe
@Data // equivalente a usar o notation Getter e Setter
@AllArgsConstructor // cria um construtor com os atributos da classe
@NoArgsConstructor // cria o construtor sem argumento
public class Usuario {

    // eh como se definisse os campos que vao ser preenchidos no body
    @JsonAlias("first_name") // propriedade que indica que um atributo pode ter outro nome
    private String name;
    private String job;
    private String email;
    @JsonAlias("last_name")
    private String lastname;

    // boa pratica criar construtor sem nada
    //public Usuario(){}
//
//    public Usuario(String name, String job, String email) {
//        this.name = name;
//        this.job = job;
//        this.email = email;
//    }

    // Necessario os gets para ocorrer a serializacao.
    // no java apenas pode ocorrer a serializacao se o atributo ou metodo for publico
    // COMENTEI OS GETS E SETS POR CAUSA DO LOMBOK
//    public String getName() {
//        return name;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public String getEmail() { return email; }

    //public void setEmail(String email){
      //  this.email = email;
   // }


    // em geral get eh usado para serializar, transformar objeto em json
    // compara objeto com um campo do json
    //public String getLastname() {
   //     return lastname;
   // }

    // em geral set eh usado para deserializar, transformar json em objeto
    // torna um objeto em um campo do json
   // public void setLastname(String lastname) {
   //     this.lastname = lastname;
   // }
}
