package fundamentos.ra.gradle.teste;

import fundamentos.ra.gradle.dominio.Usuario;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

// Usa heranca para pegar o setup
public class RegistroTeste extends BaseTeste {

    private static final String REGISTRA_USUARIO_ENDPOINT = "/register";

    @Test
    public void testNaoEfetuaRegistroQuandoSenhaEstaFaltando(){

        Usuario usuario = new Usuario();
        usuario.setEmail("sydney@fife");

        given().
                body(usuario).

        when().
                post(REGISTRA_USUARIO_ENDPOINT).

        then().
                statusCode(HttpStatus.SC_BAD_REQUEST).
                body("error",is("Missing password"));


    }



}
