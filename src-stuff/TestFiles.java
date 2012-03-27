package com.visualligence.g.tests;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.visualligence.g.VMLInjectorProvider;

@InjectWith(VMLInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class TestFiles extends XtextTest {

	@Test
	public void test() {
		suppressSerialization();

		File dir = new File("models");
		assertTrue(dir.isDirectory());
		for (File test : dir.listFiles())
		testFile(test.getName());
	}

}
