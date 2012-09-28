package com.visualligence.g.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.inject.Inject;
import com.visualligence.g.VMLInjectorProvider;
import com.visualligence.g.vML.Module;

@InjectWith(VMLInjectorProvider.class)
@RunWith(Parameterized.class)
public class ParserTest {

	private File input;
	private File output;
	private File model;

	public ParserTest(File model, File input, File output) {
		this.model = model;
		this.input = input;
		this.output = output;
	}

	@Inject
	static ParseHelper<Module> parser;

	private static Logger log = Logger.getLogger(ParserTest.class);

	public static byte[] read(File body) throws IOException {
		byte[] byte_array = new byte[(int) body.length()];
		FileInputStream fos = new FileInputStream(body);
		fos.read(byte_array);
		fos.close();
		return byte_array;
	}

	@Test
	public void model_i_o() throws Exception {
		log.debug(MessageFormat.format("Test [{0}] [{1}]",
				this.model.getName(), this.input.getName()));

		byte[] buffer_in  = read( this.input );
		byte[] buffer_out = read( this.output );
		byte[] buffer_vml = read( this.model );

		log.debug(MessageFormat.format("Test [{0}] [{1}] [parse]    ",
				this.model.getName(), this.input.getName()));

		// Module module = parser.parse(new String(buffer_vml));
		// assertNotNull(module);

		log.debug(MessageFormat.format("Test [{0}] [{1}] [generate] ",
				this.model.getName(), this.input.getName()));

		// VMLGenerator vml = new VMLGenerator();
		// IFileSystemAccess fsa;
		// vml.doGenerate( module, fsa );

		log.debug(MessageFormat.format("Test [{0}] [{1}] [comparate]",
				this.model.getName(), this.input.getName()));

		assertTrue( buffer_in .equals( buffer_in ) );
		assertTrue( buffer_out.equals( buffer_out ) );
		assertTrue( buffer_vml.equals( buffer_vml ) );
	}

	@Parameters
	public static Collection<Object[]> data() throws IOException {
		Collection<Object[]> data = new ArrayList<Object[]>();

		File dir = new File("models-io");
		assertTrue(dir.isDirectory());

		for (File test : dir.listFiles()) {
			if (test.isDirectory()) {

				File model = new File(dir, test.getName() + ".vml");
				File inputs = new File(test, "input");
				File outputs = new File(test, "output");
				for (File input : inputs.listFiles()) {
					File output = new File(outputs, input.getName());
					data.add(new Object[] { model, input, output });
				}
			}
		}
		return data;
	}

	public void sandbox() throws Exception {

		String s = " module example                      \n"
				+ "  input void                          \n"
				+ "  output void                         \n"
				+ "  author \"Rober Morales-Chaparro\"   \n"
				+ "  creation \"2012/03/24\"             \n"
				+ "  more \"http://visualligence.com/\"  \n"

				+ " <<<--->> asdf;; ";

		Module module = parser.parse(s);
		String name = module.getName();
		System.out.println(name);

	}
}
