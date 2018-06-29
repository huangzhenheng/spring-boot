package com.hzh.springboot;

public class MyTestCase extends AbstractCase1 {

	private String sss;

	@Override
	public void getAddress() {
		// TODO Auto-generated method stub
		InnerTest innerTest = new InnerTest();

	}


	private class InnerTest {

		public void getONe() {

			System.out.println(new MyInterface() {

				@Override
				public void getAddress() {
					// TODO Auto-generated method stub

				}

				@Override
				public void getName() {
					// TODO Auto-generated method stub

				}

				@Override
				public void getAge() {
					// TODO Auto-generated method stub

				}
			});
		}
	
	}

	private String getSss() {
		return sss;
	}

	public void setSss(String sss) {
		this.sss = sss;
	}

}
