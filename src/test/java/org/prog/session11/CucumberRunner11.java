package org.prog.session11;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session11.steps.DBSteps11;
import org.prog.session11.steps.WebSteps11;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.DriverManager;
import java.sql.SQLException;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.prog.session11.steps"
)

public class CucumberRunner11 extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuite() throws ClassNotFoundException, SQLException {
        WebSteps11.driver = new ChromeDriver();
        Class.forName("com.mysql.cj.jdbc.Driver");
        DBSteps11.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db", "root", "password");
    }

    @AfterSuite
    public void tearDown() throws SQLException {
        if (WebSteps11.driver !=null) {
            WebSteps11.driver.quit();
        }

        if (DBSteps11.connection != null) {
            DBSteps11.connection.close();
        }
    }

}
