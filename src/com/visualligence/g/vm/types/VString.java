package com.visualligence.g.vm.types;

public class VString extends VObject {

	private final String value;

	public VString(String value) {
		this.value = value;
	}

	public String toString() {
		return '"' + getValue() + '"';
	}

	public VString plus(VObject b) {
		return new VString(this.getValue().concat(b.toString()));
	}

	public VString times(VScalar b) {
		VString a = new VString("");
		int limit = ((int) b.getValue().doubleValue());
		for (int i = 0; i < limit; i++) {
			a = a.plus(this);
		}
		return a;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof VString)
			return this.getValue().equals(((VString) obj).getValue());
		return super.equals(obj);
	}

	private String getValue() {
		return value;
	}

	public Integer getNextKey(VObject c) {
		if (this.getValue().contains("%("))
			return getNextKey(c, 0);
		return null;
	}

	public Integer getNextKey(VObject c, Integer init) {
		if (init > 99)
			return null;
		else if (this.getValue().contains("%(" + init.toString() + ")"))
			return init;
		else
			return getNextKey(c, init + 1);
	}

	private String getTextFromObject(VObject c, VScalar key) {
		VObject text = null;
		if (c instanceof VString)
			text = c;
		else if (c instanceof VTuple)
			text = ((VTuple) c).get(new VString(key.toString())).eval();
		else if (c instanceof VSequence<?>)
			text = ((VSequence<?>) c).next();

		if (text == null)
			return "<NULL>";
		return text.toString();
	}

	public VString modulo(VObject c) {
		Integer key = getNextKey(c);
		VString result = this;
		String text = null;
		while (key != null) {
			text = getTextFromObject(c, new VScalar(key));
			result = new VString(result.getValue().replace("%(" + key + ")",
					text));
			key = getNextKey(c, key + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		VString s = new VString("asdf ");
		System.out.println(s.times(new VScalar(5)));

		VString s2 = new VString(s.getValue());
		System.out.println(s.equals(s2));
	}

	public String raw() {
		return this.value;
	}
}
