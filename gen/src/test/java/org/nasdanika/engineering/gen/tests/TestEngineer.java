package org.nasdanika.engineering.gen.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

/**
 * Generates Nasdanika Engineering Demo site.
 * @author Pavel
 *
 */
public class TestEngineer extends TestEngineeringGenBase {
	
	@Test
	public void testEngineer() throws Exception {
		File outputDir = generate(getClass().getResource("engineer.yml"), "engineer");
		File engineerPage = new File(outputDir, "e-reference/engineers/joe-doe/index.html");
		String ownsSelector = "body > div.container-fluid.nsd-app-container.border.mt-1 > div.row.nsd-app-content-row > div.nsd-app-content-panel.border-left.col.p-1 > div > div.row.nsd-app-content-panel-body-row > div > div > h3";
		
//		// JSoup
//		Document doc = Jsoup.parse(engineerPage, StandardCharsets.UTF_8.name());
//		Elements owns = doc.select(ownsSelector);
//		assertEquals("Owns header not found", 1, owns.size());
//		Element fOwns = owns.first();
//		assertEquals("Owns", fOwns.text());		
						
		// Selenium		
		webDriver.get(engineerPage.toURI().toURL().toString());
		if (webDriver instanceof TakesScreenshot) {
			byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
			Files.write(new File(outputDir, "screenshot.png").toPath(), screenshot);
		}
		WebElement element = webDriver.findElement(By.cssSelector(ownsSelector));
		assertNotNull("Owns header not found", element);
		assertEquals("Owns", element.getText());		
	}

}
