package Json_Server;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Json_Server_Automation {

    @Test
    public void getPost() {

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/posts");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void postPost() {

        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .body("{\n" +
                                "        \"id\": \"1\",\n" +
                                "        \"title\": \"Api testing\",\n" +
                                "        \"Candidate\": \"Tushar Jadhav\"\n" +
                                "}")
                        .post("http://localhost:3000/posts");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @Test
    public void putRequest() {
        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .body("[\n" +
                                "    {\n" +
                                "        \"0\": {\n" +
                                "            \"id\": \"2\",\n" +
                                "            \"title\": \"Api testing\",\n" +
                                "            \"Candidate\": \"Vaibhav Kumbhar\"\n" +
                                "        },\n" +
                                "        \"id\": \"3a48\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "        \"0\": {\n" +
                                "            \"id\": \"2\",\n" +
                                "            \"title\": \"Api testing\",\n" +
                                "            \"Candidate\": \"Vaibhav Kumbhar\"\n" +
                                "        },\n" +
                                "        \"id\": \"a558\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "        \"id\": \"2\",\n" +
                                "        \"title\": \"Api testing\",\n" +
                                "        \"Candidate\": \"Vaibhav Kumbhar\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "        \"id\": \"3\",\n" +
                                "        \"title\": \"Api testing\",\n" +
                                "        \"Candidate\": \"Tushar Jadhav\"\n" +
                                "    }\n" +
                                "]")
                        .when()
                        .put("http://localhost:3000/posts/");
        response.prettyPrint();
        response.then().statusCode(200);
    }


    @Test
    public void patchRequest() {

        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .body("{\n" +
                                "    \"title\" : \"Automation\"\n" +
                                "}")
                        .when()
                        .patch("http://localhost:3000/posts/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void deleteRequest() {

        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .delete("http://localhost:3000/posts/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }

//    --------------- Test  cases for Comments ---------------

    @Test
    public void getRequest() {
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/comments");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void postRequest() {

        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .body("{\n" +
                                "        \"id\": \"3\",\n" +
                                "        \"body\": \"Hello Vaibhav\",\n" +
                                "        \"postId\": 2\n" +
                                "    }")
                        .post("http://localhost:3000/comments");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void putRequestComments() {
        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .body("[\n" +
                                "    {\n" +
                                "        \"0\": {\n" +
                                "            \"id\": \"2\",\n" +
                                "            \"title\": \"Api testing\",\n" +
                                "            \"Candidate\": \"Vaibhav Kumbhar\"\n" +
                                "        },\n" +
                                "        \"id\": \"3a48\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "        \"0\": {\n" +
                                "            \"id\": \"2\",\n" +
                                "            \"title\": \"Api testing\",\n" +
                                "            \"Candidate\": \"Vaibhav Kumbhar\"\n" +
                                "        },\n" +
                                "        \"id\": \"a558\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "        \"id\": \"2\",\n" +
                                "        \"title\": \"Api testing\",\n" +
                                "        \"Candidate\": \"Vaibhav Kumbhar\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "        \"id\": \"3\",\n" +
                                "        \"title\": \"Api testing\",\n" +
                                "        \"Candidate\": \"Tushar Jadhav\"\n" +
                                "    }\n" +
                                "]")
                        .when()
                        .put("http://localhost:3000/comments/");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void patchRequestComments() {

        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .body("{\n" +
                                "    \"title\" : \"Automation\"\n" +
                                "}")
                        .when()
                        .patch("http://localhost:3000/comments/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void deleteRequestComments() {

        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .delete("http://localhost:3000/comments/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    //---------------- Test cases for Profile ---------------------

    @Test
    public void getRequestProfile() {
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/proflie");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void postPorfile() {

        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .body("{\n" +
                                "        \"id\": \"1\",\n" +
                                "        \"title\": \"Api testing\",\n" +
                                "        \"Candidate\": \"Tushar Jadhav\"\n" +
                                "}")
                        .post("http://localhost:3000/profile");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @Test
    public void putRequestProfile() {
        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .body("[\n" +
                                "    {\n" +
                                "        \"0\": {\n" +
                                "            \"id\": \"2\",\n" +
                                "            \"title\": \"Api testing\",\n" +
                                "            \"Candidate\": \"Vaibhav Kumbhar\"\n" +
                                "        },\n" +
                                "        \"id\": \"3a48\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "        \"0\": {\n" +
                                "            \"id\": \"2\",\n" +
                                "            \"title\": \"Api testing\",\n" +
                                "            \"Candidate\": \"Vaibhav Kumbhar\"\n" +
                                "        },\n" +
                                "        \"id\": \"a558\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "        \"id\": \"2\",\n" +
                                "        \"title\": \"Api testing\",\n" +
                                "        \"Candidate\": \"Vaibhav Kumbhar\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "        \"id\": \"3\",\n" +
                                "        \"title\": \"Api testing\",\n" +
                                "        \"Candidate\": \"Tushar Jadhav\"\n" +
                                "    }\n" +
                                "]")
                        .when()
                        .put("http://localhost:3000/profile/");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void patchRequestProfile() {

        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .body("{\n" +
                                "    \"title\" : \"Automation\"\n" +
                                "}")
                        .when()
                        .patch("http://localhost:3000/profile/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void deleteRequestProfile() {

        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .delete("http://localhost:3000/profile/2");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}
