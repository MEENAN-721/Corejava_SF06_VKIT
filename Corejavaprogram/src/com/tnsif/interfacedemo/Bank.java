package com.tnsif.interfacedemo;

public interface Bank {
	float rateofinterest();
	}

	package com.tnsif.interfacedemo;

	public class SBI implements Bank {

		@Override
		public float rateofinterest() {
			
			return 7.9f;
		}

}
