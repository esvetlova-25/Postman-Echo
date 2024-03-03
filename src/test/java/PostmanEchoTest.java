import org.junit.jupiter.api.Test;
import static  io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class PostmanEchoTest {
    @Test
    void shouldReturnSendData(){
        // Given - When - Then
// Предусловия
        var text = "My name is Ekaterina";
        given()
                .baseUri("https://postman-echo.com")
                .body(text) // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}