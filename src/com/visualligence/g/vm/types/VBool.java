package com.visualligence.g.vm.types;

public class VBool extends VObject {

	Boolean value = null;
	
	public VBool( VString value ){
		this.value = ( value.raw().toUpperCase() == "TRUE" );
	}
	
	public VBool( VScalar value ){
		this.value = !( value.getValue().equals(0) );
	}
	
	public VBool( VObject value ){
		this.value = false;
	}
	
	public VBool( boolean value ){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value ? "true" : "false";
	}
}
