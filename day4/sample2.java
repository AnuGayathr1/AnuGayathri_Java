package day4;

class sample2 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	public void mth2() {
		try {
			System.exit(0);
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
