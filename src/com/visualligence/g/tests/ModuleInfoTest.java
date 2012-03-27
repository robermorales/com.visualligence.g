package com.visualligence.g.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.visualligence.g.VMLInjectorProvider;
import com.visualligence.g.vML.Module;
import com.visualligence.g.vML.VoidTypeRef;

@InjectWith(VMLInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ModuleInfoTest {

	@Inject
	ParseHelper<Module> parser;

	@Test
	public void parse() throws Exception {

		String s = " module example                      \n"
				+ "  input void                          \n"
				+ "  output void                         \n"
				+ "  author \"Rober Morales-Chaparro\"   \n"
				+ "  creation \"2012/03/24\"             \n"
				+ "  more \"http://visualligence.com/\"  \n";

		Module module = parser.parse(s);
		assertNotNull(module);
		assertEquals(module.getName(), "example");
		assertEquals(module.getAuthor(), "Rober Morales-Chaparro");
		assertEquals("a", module.getLink(), "http://visualligence.com/");
		assertEquals(module.getCreation(), "2012/03/24");
		assertTrue(module.getInputtype() instanceof VoidTypeRef);
		assertTrue(module.getOutputtype() instanceof VoidTypeRef);
	}
}
