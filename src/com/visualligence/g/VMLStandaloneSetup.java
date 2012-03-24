
package com.visualligence.g;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class VMLStandaloneSetup extends VMLStandaloneSetupGenerated{

	public static void doSetup() {
		new VMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

