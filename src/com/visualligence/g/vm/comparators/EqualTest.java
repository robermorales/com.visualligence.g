package com.visualligence.g.vm.comparators;

import com.visualligence.g.vm.core.Producer;

public class EqualTest implements Producer<Boolean> {

	private Producer<Number> a;
	private Producer<Number> b;

	public EqualTest(Producer<Number> a, Producer<Number> b) {
		this.a = a;
		this.b = b;
	}

	public Boolean get() {
		Number na = this.a.get();
		Number nb = this.b.get();
		if (na != null && nb != null && !na.equals(Double.NaN)
				&& !nb.equals(Double.NaN))
			return na.doubleValue() == nb.doubleValue();
		return null;
	}

	public Producer<Number> getA() {
		return a;
	}

	public void setA(Producer<Number> a) {
		this.a = a;
	}

	public Producer<Number> getB() {
		return b;
	}

	public void setB(Producer<Number> b) {
		this.b = b;
	}

}
