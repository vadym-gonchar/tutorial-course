package apitest;

import helpers.apihelper.GitHubApiHelper;
import org.testng.Assert;

public class GitHubApiTest{
  public final static String TOKEN = "173cf48a20fb19d2ac1e42921748337d242577f2";
  private final static String URL = "https://api.github.com/";

  public static void main(String[] args) {
    GitHubApiHelper gitHubApiHelper = new GitHubApiHelper();

    String htmlUrlTutorialCourse = gitHubApiHelper.getAndCheckRepoParam(URL,
            "repos/vadym-gonchar/tutorial-course", TOKEN, "html_url" );
    Assert.assertEquals(htmlUrlTutorialCourse, "https://github.com/vadym-gonchar/tutorial-course");

    String idAddressbook = gitHubApiHelper.getAndCheckRepoParam(URL,
            "repos/vadym-gonchar/addressbook", TOKEN, "id" );
    Assert.assertEquals(idAddressbook, "249262256");

    String ownerIdPgatour = gitHubApiHelper.getAndCheckRepoParam(URL,
            "repos/vadym-gonchar/pgatour", TOKEN, "owner.id" );
    Assert.assertEquals(ownerIdPgatour, "61626216");

    gitHubApiHelper.createNewRepo(URL, "user/repos",
            TOKEN, "Test", "Test description");

    gitHubApiHelper.updateRepo(URL, "repos/vadym-gonchar/Test",
            TOKEN, "TestRepository", "Test description update");

    gitHubApiHelper.deleteRepo(URL, "repos/vadym-gonchar/TestRepository", TOKEN);
  }
}