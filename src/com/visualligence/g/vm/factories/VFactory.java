package com.visualligence.g.vm.factories;

import java.util.HashMap;
import java.util.Map.Entry;

import com.visualligence.g.vm.core.Producer;
import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.sequences.IterableLoop;
import com.visualligence.g.vm.types.VObject;
import com.visualligence.g.vm.types.VScalar;
import com.visualligence.g.vm.types.VString;
import com.visualligence.g.vm.types.VTuple;

@SuppressWarnings("serial")
public class VFactory<T extends VTuple> extends HashMap<VString, Producer<? extends VObject>>
		implements Producer<T> {

	@Override
	public T get() {
		VTuple vt = new VTuple();
		int count = 0;
		for (Entry<VString, Producer<? extends VObject>> it : this.entrySet()) {
			VObject value = it.getValue().get();
			if (value == null)
				count++;
			vt.put(it.getKey(), new Constant<VObject>(value));
		}
		if (count == 0)
			return (T) vt;
		else
			return null;
	}

	public void attach(VString s, Producer<? extends VObject> il) {
		this.put( s, il );
	}
}
