package carnival.runner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/userStory01.feature"
        },
        tags = {"@SmokeTest"},
        glue = {"carnival.stepsdefinition"}
)


public class smokeTest {


}
