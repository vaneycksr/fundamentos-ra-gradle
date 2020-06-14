package fundamentos.ra.gradle.teste;

import fundamentos.ra.gradle.dominio.Usuario;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

// Usa heranca para pegar o setup
public class TesteRegistro extends TesteBase {

    private static final String REGISTRA_USUARIO_ENDPOINT = "/register";
    private static final String LOGIN_USUARIO_ENDPOINT = "/login";

    // cria um setup especifico para a classe
    @BeforeClass
    public static void setUpRegistro(){

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_BAD_REQUEST)
                .build();

    }

    @Test
    public void testNaoEfetuaRegistroQuandoSenhaEstaFaltando(){

        Usuario usuario = new Usuario();
        usuario.setEmail("sydney@fife");

        given().
                body(usuario).

        when().
                post(REGISTRA_USUARIO_ENDPOINT).

        then().

                body("error",is("Missing password"));

    }

    // Esse teste deveria estar no TesteLogin
    @Test
    public void testLoginNaoEfetuadoQuandoSenhaEstaFaltando(){

        Usuario usuario = new Usuario();
        usuario.setEmail("sydney@fife");

        given().
                body(usuario).

        when().
                post(LOGIN_USUARIO_ENDPOINT).

        then().

                body("error",is("Missing password"));

    }


}
