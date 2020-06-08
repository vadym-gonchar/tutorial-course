package apitest;

import helpers.apihelper.GitHubApiHelper;
import org.testng.Assert;

public class GitHubApiTest{
  public final static String TOKEN = "7c07f721ac21eebdb3c75848eb791a43dc34fcc9";
  private final static String URL = "https://api.github.com/";

  public static void main(String[] args) {
    GitHubApiHelper gitHubApiHelper = new GitHubApiHelper();

    gitHubApiHelper.createNewRepo(URL, "user/repos",
            TOKEN, "aNewRepoNameqqqdA", "Test description");

    String htmlUrl = gitHubApiHelper.getRepos(URL,
            "repos/vadym-gonchar/tutorial-course", TOKEN, "html_url" );
    Assert.assertEquals(htmlUrl, "https://github.com/vadym-gonchar/tutorial-course");
  }
}