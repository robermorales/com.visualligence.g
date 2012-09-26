package com.visualligence.g.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.visualligence.g.VMLInjectorProvider;
import com.visualligence.g.generator.VMLGenerator;
import com.visualligence.g.vML.Module;

@InjectWith(VMLInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ParserTest {

	@Inject
	ParseHelper<Module> parser;

	private static Logger log = Logger.getLogger(ParserTest.class);
	private String space = "           ";

	@Test
	public void model_i_o() throws Exception {
		File dir = new File("models-io");
		assertTrue(dir.isDirectory());
		for (File test : dir.listFiles()) {
			if (test.isDirectory()) {
				File body = new File(dir, test.getName() + ".vml");

				log.debug("Test " + test.getName());
				byte[] buffer_vml = new byte[(int) body.length()];
				new FileInputStream(body).read(buffer_vml);
				log.debug(space + "[parse]");

				Module module = parser.parse(new String(buffer_vml));
				assertNotNull(module);
				
				VMLGenerator vml = new VMLGenerator();
				// vml.doGenerate( module );

				File inputs = new File(test, "input");
				File outputs = new File(test, "output");
				int input_i = 0;
				for (File input : inputs.listFiles()) {
					log.debug(space + "[input] [" + (++input_i) + "] "
							+ input.getName());

					File output;
					try {
						output = new File(outputs, input.getName());

						byte[] buffer_in = new byte[(int) input.length()];
						new FileInputStream(input).read(buffer_in);

						byte[] buffer_out = new byte[(int) output.length()];
						new FileInputStream(output).read(buffer_out);
						
						System.out.println( new String( buffer_in ) );
						System.out.println( new String( buffer_out ) );
						
					} catch (Exception e) {

					}
				}
			}
		}
	}
	
	public void sandbox(){
		
		String s = " module example                      \n"
				+ "  input void                          \n"
				+ "  output void                         \n"
				+ "  author \"Rober Morales-Chaparro\"   \n"
				+ "  creation \"2012/03/24\"             \n"
				+ "  more \"http://visualligence.com/\"  \n"
				
				+ " <<<--->> asdf;; "
				;


		try {
			
			Module module = parser.parse( s );
			
			String author = module.getAuthor();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
