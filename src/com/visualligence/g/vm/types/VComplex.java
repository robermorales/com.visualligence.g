package com.visualligence.g.vm.types;

public class VComplex {

	private VScalar real, imag;

	public VComplex() {
	}

	public VComplex(VScalar real, VScalar imag) {
		this.real = real;
		this.imag = imag;
	}

	public VScalar getReal() {
		return real;
	}

	public void setReal(VScalar real) {
		this.real = real;
	}

	public VScalar getImag() {
		return imag;
	}

	public void setImag(VScalar imag) {
		this.imag = imag;
	}

	public VComplex times(VComplex right) {
		VComplex r = new VComplex();
		VScalar a = this.real;
		VScalar b = this.imag;
		VScalar c = right.getReal();
		VScalar d = right.getImag();
		r.setReal((VScalar) a.times(c).minus(b.times(d)));
		r.setImag((VScalar) b.times(c).plus(a.times(d)));
		return r;
	}

	public VComplex plus(VComplex c) {
		VComplex r = new VComplex();
		r.setReal((VScalar) this.getReal().plus(c.getReal()));
		r.setImag((VScalar) this.getImag().plus(c.getImag()));
		return r;
	}

	public VScalar abs() {
		return (VScalar) this.getReal().times(this.getReal())
				.plus(this.getImag().times(this.getImag())).sqrt();
	}

	@Override
	public String toString() {
		return "(" + this.getReal() + "," + this.getImag() + "j)";
	}

	public static void main(VString[] args) {
		VComplex c = new VComplex();
		System.out.println(c);
	}

	// return max - number of iterations to check if c = a + ib is in Mandelbrot
	// set
	public int mand(int max) {
		VComplex z = this;
		for (int t = 0; t < max; t++) {
			if (z.abs().greater(new VScalar(2.0)))
				return max - t;
			z = z.times(z).plus(this);
		}
		return 0;
	}
}
