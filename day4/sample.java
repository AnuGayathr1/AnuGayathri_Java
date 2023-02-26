package day4;

class sample {
	/*public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try {
			return;
		}catch(Exception e){
			System.out.println("Catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
		public static void main(String p[]) {
			sample s=new sample();
			s.mth1();
	}*/
		public void mth1() {
			mth2();
			System.out.println("caller");
		}
		public void mth2() {
			try {
				System.out.println(1/0);
				return;
			}catch(Exception e){
				System.out.println("Catch-mth2");
			}
			finally {
				System.out.println("finally-mth2");
			}
		}
			public static void main(String p[]) {
				sample s=new sample();
				s.mth1();
		}
}
