import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.Argument;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class Test01_GET {
    @Test

    void test_01()  {

        Response response = get("https://reqres.in/api/users?page=2") ;
        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode,200);


    }
    //@Test

//    @When("^I have to test GET$")
//    public void i_have_to_test_GET() throws Throwable {
//
//    }
//    @Then("I have all the logs of GET request")
//    void test_02() {
//        given()
//                .get("https://reqres.in/api/users?page=2")
//                .then().statusCode(200).log().all();
//
//
//    }


}
