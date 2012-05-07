package com.visualligence.g.vm.types;

import java.util.HashMap;
import java.util.Map.Entry;

import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.expressions.Expression;

public class VTuple extends VObject {

	private HashMap<String, Expression<? extends VObject>> value = new HashMap<String, Expression<? extends VObject>>();

	private HashMap<String, Expression<? extends VObject>> getValue() {
		return value;
	}

	public void put(VString k, Expression<? extends VObject> v) {
		this.getValue().put(k.toString(), v);
	}

	// try {
	// Field field = this.getClass().getDeclaredField(k.raw());
	// field.set( this, v.eval() );
	// } catch (SecurityException e) {
	// e.printStackTrace();
	// } catch (NoSuchFieldException e) {
	// e.printStackTrace();
	// } catch (IllegalArgumentException e) {
	// e.printStackTrace();
	// } catch (IllegalAccessException e) {
	// e.printStackTrace();
	// }

	@Override
	public String toString() {
		String a = "{";
		for (Entry<String, Expression<? extends VObject>> it : this.value
				.entrySet()) {
			a += it.getKey() + ":" + it.getValue().eval() + ",";
		}
		return a + "}";
	}

	public static void main(String[] args) {
		VTuple vt = new VTuple();
		vt.put(new VString("1"), new Constant<VScalar>(new VScalar(1)));
		vt.put(new VString("1"), new Constant<VScalar>(new VScalar(1)));
		vt.put(new VString("1"), new Constant<VScalar>(new VScalar(1)));
		System.out.println(vt);
	}

	public Expression<? extends VObject> get(VString vString) {
		return this.getValue().get(vString.toString());
	}
}
