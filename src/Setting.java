public enum Setting{ 		//setting enumerator
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");

	private String value;	// private access variable

	Setting (String aValue) {
		value = aValue;		// access method for Setting
	}

	public String toString() {
		return value;		// Tostring method for setting
	}

}
