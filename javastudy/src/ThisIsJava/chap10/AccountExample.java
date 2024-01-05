public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.withdraw(3000);
		}catch(BalanceInsufficientException e) {
			String message = e.getMessage();	//예외 메세지 얻기
			System.out.println(message);
			System.out.println();
			e.printStackTrace();	//예외 추적 후 출력
		}
	}
}