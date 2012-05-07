package com.visualligence.g.vm.examples.stuff;

import com.visualligence.g.vm.core.Node;
import com.visualligence.g.vm.expressions.Constant;
import com.visualligence.g.vm.operations.Operation;
import com.visualligence.g.vm.sequences.IterableLoop;
import com.visualligence.g.vm.sequences.SequenceByRange;
import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamInputNumber;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VComplex;
import com.visualligence.g.vm.types.VScalar;

public class mandelbrot_test extends Node {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new mandelbrot_test().run();
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms.");
		System.gc();
	}

	@Override
	public void run( StreamInput sin, StreamOutput sout ) {
		Constant<VScalar> xc = new Constant<VScalar>(new VScalar(-0.6));
		Constant<VScalar> yc = new Constant<VScalar>(new VScalar(0.0));
		Constant<VScalar> sizex = new Constant<VScalar>(new VScalar(2.5));
		Constant<VScalar> sizey = new Constant<VScalar>(new VScalar(2.0));
		Constant<VScalar> Nx = new Constant<VScalar>(new VScalar(50));
		Constant<VScalar> Ny = new Constant<VScalar>(new VScalar(12));
		// 25000;-0.743;0.10;0.0005;0.0002;

//		SequenceByRange sbrx = new SequenceByRange(xc.get() - sizex.get() / 2,
//				sizex.get() / Nx.get(), xc.get() + sizex.get() / 2);
//		SequenceByRange sbry = new SequenceByRange(yc.get() - sizey.get() / 2,
//				sizey.get() / Ny.get(), yc.get() + sizey.get() / 2);

		// IterableLoop<Number> ix = new IterableLoop<Number>(sbrx.get());
		// IterableLoop<Number> iy = new IterableLoop<Number>(sbry.get());

		// Constant<Integer> max = new Constant<Integer>(1000);
		// for (Number numberI : sbry) {
		// for (Number numberR : sbrx)
		// System.out.print((new Complex(numberR.doubleValue(), numberI
		// .doubleValue())).mand(max.get()) == 0 ? '■' : ' ');// ▰□
		// System.out.println();
		// }

		// StreamInput si = new StreamInput();
		// // node op
		// Operation op = new Operation();
		// // op.n <- I
		// op.setInput(0);// si.getInt());
		// // O <- op.result
		// System.out.println(op.getResult());
	}
}
