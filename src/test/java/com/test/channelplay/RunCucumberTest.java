package com.test.channelplay;

import io.cucumber.testng.*;
import org.testng.annotations.DataProvider;

@CucumberOptions(
		features = "src/test/resources/com/test/channelplay/feature",
		glue = {"com.test.channelplay.stepDefinition"},
		plugin = {"pretty", "rerun:target/rerun.txt", "timeline:target/timeline"},



		dryRun = false,
		tags = "@AUT10 and @Scenario1",

		

		monochrome=true

		)


public class RunCucumberTest extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}
