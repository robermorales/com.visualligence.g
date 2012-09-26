/*
 * generated by Xtext
 */
package com.visualligence.g.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.visualligence.g.ui.internal.VMLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return VMLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return VMLActivator.getInstance().getInjector(VMLActivator.COM_VISUALLIGENCE_G_VML);
	}
	
}
