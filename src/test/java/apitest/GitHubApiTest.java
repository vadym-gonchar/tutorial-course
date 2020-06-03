package apitest;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class GitHubApiTest{
  private final String token = "b15ad9d59e9e7a0a12e151ee175af8839257765e";
  private final String Url = "https://api.github.com/";

  public static void main(String[] args) {
    GitHubApiTest gitHubApiTest = new GitHubApiTest();
    gitHubApiTest.getRepos();
    gitHubApiTest.createRepo();
  }

  public void getRepos() {
    given().header("Authorization", "Bearer " + token)
            .when()
            .get(Url + "user/repos")
            .then().log().all()
            .log().cookies()
            .statusCode(200);

  }

  public void createRepo() {
    given().header("Authorization", "Bearer " + token)
            .contentType(ContentType.JSON)
            .body(
                    "{\n" +
                            "  \"name\": \"Tests\",\n" +
                            "  \"description\": \"This is your first repository\",\n" +
                            "  \"homepage\": \"https://github.com\",\n" +
                            "  \"private\": false,\n" +
                            "  \"has_issues\": true,\n" +
                            "  \"has_projects\": true,\n" +
                            "  \"has_wiki\": true\n" +
                            "}"
            )
            .when()
            .post(Url + "user/repos")
            .then().log().all()
            .log().cookies()
            .statusCode(201);
  }
}