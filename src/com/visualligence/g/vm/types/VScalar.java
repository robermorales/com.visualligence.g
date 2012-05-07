package com.visualligence.g.vm.types;

import java.math.BigDecimal;
import java.util.Scanner;

public class VScalar extends VObject {

	private BigDecimal value = new BigDecimal(0);

	public VScalar(int value) {
		this.value = new BigDecimal(value);
	}

	public VScalar(double value) {
		this.value = new BigDecimal(value);
	}

	public VScalar(Number value) {
		this.value = new BigDecimal(value.doubleValue());
	}

	public VScalar(BigDecimal value) {
		this.value = value;
	}

	protected BigDecimal getValue() {
		return value;
	}

	public String toString() {
		return getValue().toEngineeringString();
	}

	public boolean greaterOrEqual(VObject b) {
		if (b instanceof VScalar)
			return this.getValue().doubleValue() >= ((VScalar) b).getValue()
					.doubleValue();
		return false;
	}

	public boolean lessOrEqual(VObject b) {
		if (b instanceof VScalar)
			return this.getValue().doubleValue() <= ((VScalar) b).getValue()
					.doubleValue();
		return false;
	}

	public boolean less(VObject b) {
		if (b instanceof VScalar)
			return this.getValue().doubleValue() < ((VScalar) b).getValue()
					.doubleValue();
		return false;
	}

	public boolean greater(VObject b) {
		if (b instanceof VScalar)
			return this.getValue().doubleValue() > ((VScalar) b).getValue()
					.doubleValue();
		return false;
	}

	public boolean equal(VObject b) {
		if (b instanceof VScalar)
			return this.getValue().doubleValue() == ((VScalar) b).getValue()
					.doubleValue();
		return false;
	}

	public VObject times(VObject b) {
		if (b instanceof VScalar)
			return new VScalar(this.getValue().multiply(
					((VScalar) b).getValue()));
		return null;
	}

	public VObject plus(VObject b) {
		if (b instanceof VScalar)
			return new VScalar(this.getValue().doubleValue()
					+ ((VScalar) b).getValue().doubleValue());
		return null;
	}

	public VObject minus(VObject b) {
		if (b instanceof VScalar)
			return new VScalar(this.getValue().doubleValue()
					- ((VScalar) b).getValue().doubleValue());
		return null;
	}

	public static void main(String[] args) {
		VScalar a = new VScalar(124);
		VScalar b = new VScalar(123);
		System.out.println(a.greaterOrEqual(b));
	}

	public VScalar sqrt() {
		return new VScalar(Math.sqrt((Double) this.getValue().doubleValue()));
	}

	public VObject modulo(VScalar c) {
		return new VScalar(this.getValue().doubleValue()
				% c.getValue().doubleValue());
	}

	public static VObject getNext(Scanner in) {
		return new VScalar(in.nextBigDecimal());
	}

}
