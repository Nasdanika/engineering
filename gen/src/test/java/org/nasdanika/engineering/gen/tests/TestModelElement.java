package org.nasdanika.engineering.gen.tests;

import org.junit.Test;

/**
 * General UI tests.
 * @author Pavel
 *
 */
public class TestModelElement extends TestEngineeringGenBase {
	
	@Test
	public void testImageEmbeddingAndInclusion() throws Exception {
		generate(getClass().getResource("image-embedding-and-inclusion.yml"), "image-embedding-and-inclusion");
	}

}
