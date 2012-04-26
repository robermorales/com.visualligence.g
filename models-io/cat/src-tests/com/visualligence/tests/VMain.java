package com.visualligence.tests;

import java.util.Map;

import com.visualligence.g.vm.streams.StreamInput;
import com.visualligence.g.vm.streams.StreamOutput;
import com.visualligence.g.vm.types.VScalar;

import com.visualligence.gen.cat.cat;

public class VMain {
	public static void main(String[] args) {
		System.out.println("Content-type: text/plain;");
		System.out.println();
		long start = System.currentTimeMillis();
		{
			new Plot_model().run();
		}
		long end = System.currentTimeMillis();
		System.err.println(end - start + " ms.");
		System.gc();
	}

	public static void env(StreamInput<VScalar> sin, StreamOutput<VScalar> sout) {
		Map<String, String> env = System.getenv();
		for (String envName : env.keySet()) {
			System.out.format("%s=%s%n", envName, env.get(envName));
		}
		sout.attach(sin);
		sout.exec();
	}
}
