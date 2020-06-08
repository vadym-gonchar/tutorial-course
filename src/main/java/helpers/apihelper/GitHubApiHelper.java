package helpers.apihelper;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class GitHubApiHelper {

  public void createNewRepo(String baseUrl, String requestNewUrl,
                            String token, String newRepoName, String description){

    String createNewRepoBody = "{\n" +
            "  \"name\": \"" + newRepoName + "\",\n" +
            "  \"description\": \"" + description + "\",\n" +
            "  \"homepage\": \"" + baseUrl + "\",\n" +
            "  \"private\": false,\n" +
            "  \"has_issues\": true,\n" +
            "  \"has_projects\": true,\n" +
            "  \"has_wiki\": true\n" +
            "}";

    given().header("Authorization", "Bearer " + token)
            .contentType(ContentType.JSON)
            .body(createNewRepoBody)
            .when()
            .post(baseUrl + requestNewUrl)
            .then().log().all()
            .log().cookies()
            .statusCode(201);
  }

  public String getRepos(String baseUrl, String requestNewUrl, String token, String pathToParam) {
    return given().header("Authorization", "Bearer " + token)
            .when()
            .get(baseUrl + requestNewUrl)
            .then().log().all()
            .log().cookies()
            .statusCode(200)
            .extract()
            .response()
            .jsonPath()
            .getString(pathToParam);
  }
}