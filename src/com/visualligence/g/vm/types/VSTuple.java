package com.visualligence.g.vm.types;

import java.lang.reflect.Field;

import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.expressions.Expression;

public class VSTuple extends VObject {

	// pensada para que hereden de ella

	public void put(VString k, Expression<? extends VObject> v) {
		try {
			this.getClass().getDeclaredField(k.raw()).set(this, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		String a = "{";
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			Object val = null;
			try {
				val = field.get(this);
			} catch (Exception e) {
				e.printStackTrace();
			}
			a += field.getName() + ":" + val + ",";
		}
		return a + "}";
	}

	public Object get(VString key) {
		try {
			Field field = this.getClass().getField(key.raw());
			return field.get(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;// this.getValue().get(vString.toString());
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		class circle extends VSTuple {
			int x = 0;
			int y = 0;
		}

		VSTuple vt = new circle();
		vt.put(new VString("x"), new Constant<VScalar>(new VScalar(1)));
		vt.put(new VString("y"), new Constant<VScalar>(new VScalar(1)));
		System.out.println(vt);
	}

}
