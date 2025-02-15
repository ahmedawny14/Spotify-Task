package Tests;


import org.testng.annotations.BeforeSuite;
import java.io.File;

public class AllureConfig {

    @BeforeSuite
    public void setupAllure() {
        // Set output directory for Allure results
        String resultsDir = System.getProperty("user.dir") + "/allure-results";
        System.setProperty("allure.results.directory", resultsDir);

        // Ensure the directory exists
        File directory = new File(resultsDir);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }
}
