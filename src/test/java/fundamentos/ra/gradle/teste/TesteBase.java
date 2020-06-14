package fundamentos.ra.gradle.teste;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

// Classe criada para evitar duplicacao de codigo
public class TesteBase {

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


        // cria um responseSpecification, verifica se a resposta de todos os testes vem
        // em formato de json
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();

    }


}
