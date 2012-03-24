package com.visualligence.g.validation;

import org.eclipse.xtext.validation.Check;

import com.visualligence.g.vML.Module;
import com.visualligence.g.vML.Stream;
import com.visualligence.g.vML.TypeRef;
import com.visualligence.g.vML.VMLPackage;

public class VMLJavaValidator extends AbstractVMLJavaValidator {

	@Check
	public void checkNameOfModule(Module m) {
		String filename = m.eResource().getURI().lastSegment();
		String filebase = filename.substring(0, filename.indexOf('.'));
		if (m.getName() != null && !m.getName().equals(filebase))
			error("Names of module and file should be equal: " + m.getName()
					+ "," + filebase, VMLPackage.Literals.MODULE__NAME);
	}

	@Check
	public void checkTypeOfInput(Stream s) {
		// TypeRef stype = s.getType();
		// TypeRef itype = ((Model)s.eContainer()).getInputtype();
		// if( ! equals( stype, itype ) )
		// warning( "Stream type should be the same as input type",
		// VMLPackage.Literals.STREAM__TYPE );
	}

	public boolean equals(TypeRef l, TypeRef r) {
		return true;
		// if( l.getAliastype() != null && r.getAliastype() != null )
		// return equals( l.getAliastype().getType(), r.getAliastype().getType()
		// );
		// if( l.getNumbertype() != null )
		// return l.getNumbertype() == r.getNumbertype();
		// if( l.getAuxtype() != null )
		// return l.getAuxtype() == r.getAuxtype();
		// if( l.getReftype() != null )
		// return l.getReftype() == r.getReftype();
		// if( l.getShapetype() != null )
		// return l.getShapetype() == r.getShapetype();
		//
		// return false;
	}

}
