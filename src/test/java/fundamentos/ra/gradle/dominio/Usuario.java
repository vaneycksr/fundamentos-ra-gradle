package fundamentos.ra.gradle.dominio;

// Classe utilizada para auxiliar a serializacao do objeto
public class Usuario {

    // eh como se definisse os campos que vao ser preenchidos no body
    private String name;
    private String job;
    private String email;

    // boa pratica criar construtor sem nada
    public Usuario(){}

    public Usuario(String name, String job, String email) {
        this.name = name;
        this.job = job;
        this.email = email;
    }

    // Necessario os gets para ocorrer a serializacao.
    // no java apenas pode ocorrer a serializacao se o atributo ou metodo for publico
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() { return email; }

    public void setEmail(String email){
        this.email = email;
    }
}
