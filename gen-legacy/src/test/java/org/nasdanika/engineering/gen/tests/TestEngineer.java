package org.nasdanika.engineering.gen.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.OutputStreamWriter;
import java.nio.file.Files;

import org.junit.Test;
import org.nasdanika.common.ProgressRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.Yaml;

/**
 * Engineer UI tests.
 * @author Pavel
 *
 */
public class TestEngineer extends TestEngineeringGenBase {
	
	@Test
	public void testEngineer() throws Exception {
		WebDriver webDriver = new ChromeDriver(); 		
		try {
			ProgressRecorder progressRecorder = new ProgressRecorder();
			File outputDir = generate(getClass().getResource("engineer.yml"), "engineer", progressRecorder);

			DumperOptions dumperOptions = new DumperOptions();
			dumperOptions.setDefaultFlowStyle(FlowStyle.BLOCK); dumperOptions.setIndent(4); 
			new Yaml(dumperOptions).dump(progressRecorder.toMap(5, false), new OutputStreamWriter(System.out));
			
			
			File engineerPage = new File(outputDir, "e-reference/engineers/joe-doe/index.html");
			String ownsSelector = "body > div.container-fluid.nsd-app-container.border.mt-1 > div.row.nsd-app-content-row > div.nsd-app-content-panel.border-left.col.p-1 > div > div.row.nsd-app-content-panel-body-row > div > div > h3";									
			
			// Selenium		
			webDriver.get(engineerPage.toURI().toURL().toString());
			if (webDriver instanceof TakesScreenshot) {
				byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
				Files.write(new File(outputDir, "screenshot.png").toPath(), screenshot);
			}
			WebElement element = webDriver.findElement(By.cssSelector(ownsSelector));
			assertNotNull("Owns header not found", element);
			assertEquals("Owns", element.getText());		
		} finally {
			webDriver.quit();
		}		
	}

}
