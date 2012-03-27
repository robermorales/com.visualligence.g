package com.visualligence.g.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.visualligence.g.VMLInjectorProvider;
import com.visualligence.g.vML.Module;

@InjectWith(VMLInjectorProvider.class)
@RunWith(XtextRunner.class)
public class OutputCheckTest {

	@Inject
	ParseHelper<Module> parser;

	@Test
	public void imo() throws Exception {
		File dir = new File("i-m-o");
		assertTrue(dir.isDirectory());
		for (File test : dir.listFiles()) {
			assertTrue(test.isDirectory());

			File model = new File(test, test.getName() + ".vml");
			byte[] buffer = new byte[(int) model.length()];
			new FileInputStream(model).read(buffer);

			Module module = parser.parse(new String(buffer));
			assertNotNull(module);

			// File[] inputs = new File(test, "input").listFiles();
			// File[] outputs = new File(test, "output").listFiles();
		}
	}
}
