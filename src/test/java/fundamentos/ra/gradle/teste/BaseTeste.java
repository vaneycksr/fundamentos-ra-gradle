package fundamentos.ra.gradle.teste;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

// Classe criada para evitar duplicacao de codigo
public class BaseTeste {

    @BeforeClass
    public static void setUp(){

        // quando o teste falha, habilita os logs da requisicao
        // permitndo mostrar como a requisicao foi feita
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        // configura para todos os testes o endpoint
        baseURI = "https://reqres.in";
        // configura o path para todos os testes
        basePath = "/api";


        // cria um requestSpecification configurando o contentType para json
        // evita de ficar colocando o tipo da requisicao em cada request
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();


    }


}
