package fundamentos.ra.gradle.dominio;

// Classe utilizada para auxiliar a serializacao do objeto
public class Usuario {

    // eh como se definisse os campos que vao ser preenchidos no body
    private String name;
    private String job;

    // boa pratica criar construtor sem nada
    public Usuario(){}

    public Usuario(String name, String job) {
        this.name = name;
        this.job = job;
    }

    // Necessario os gets para ocorrer a serializacao.
    // no java apenas pode ocorrer a serializacao se o atributo ou metodo for publico
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
