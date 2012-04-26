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
	public void model_i_o() throws Exception {
		File dir = new File("models-io");
		assertTrue(dir.isDirectory());
		for (File test : dir.listFiles()) {
			if (test.isDirectory()) {
				File body = new File(dir, test.getName() + ".vml");

				byte[] buffer_vml = new byte[(int) body.length()];
				new FileInputStream(body).read(buffer_vml);

				Module module = parser.parse(new String(buffer_vml));
				assertNotNull(module);

				File inputs = new File(test, "input");
				File outputs = new File(test, "output");
				for (File input : inputs.listFiles()) {
					File output;
					try {
						output = new File(outputs, input.getName());

						byte[] buffer_in = new byte[(int) body.length()];
						new FileInputStream(input).read(buffer_in);

						byte[] buffer_out = new byte[(int) body.length()];
						new FileInputStream(output).read(buffer_out);

						
						
//						System.out.println(new String(buffer_in));
//						System.out.println(new String(buffer_out));
//						System.out.println(new String(buffer_vml));

					} catch (Exception e) {

					}
				}
			}
		}
	}
}
