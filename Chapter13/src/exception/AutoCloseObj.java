package exception;

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Close() 호출 완료");
	}

	

	
	
}
