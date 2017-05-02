package example.com.teachme.Connection;

import example.com.teachme.api.CourseAPIInterface;
import example.com.teachme.api.GameAPIInterface;
import example.com.teachme.api.QuestionAPIInterface;
import example.com.teachme.api.UserAPIInterface;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://10.0.2.2:8080";

    public static CourseAPIInterface getAPICourse() {
        return RetrofitClient.getClient(BASE_URL).create(CourseAPIInterface.class);
    }

    public static UserAPIInterface getAPIUser() {
        return RetrofitClient.getClient(BASE_URL).create(UserAPIInterface.class);
    }

    public static GameAPIInterface getAPIGame() {
        return RetrofitClient.getClient(BASE_URL).create(GameAPIInterface.class);
    }

    public static QuestionAPIInterface getAPIQuestion() {
        return RetrofitClient.getClient(BASE_URL).create(QuestionAPIInterface.class);
    }
}