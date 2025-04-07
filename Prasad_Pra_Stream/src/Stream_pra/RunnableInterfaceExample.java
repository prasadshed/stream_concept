package Stream_pra;

public class RunnableInterfaceExample {

	public static void main(String[] args) {
		/*
		 * before java 8 features
		 */
		Runnable runnable= new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inside runnable interface with overiden");
			}
		};
		new Thread(runnable).start();
		/*
		 * after java 8 features
		 */
		Runnable runs=() -> {
			System.out.println("its java 8 lambda experssion");
		};
		new Thread(runs).start();
		
	}

}
