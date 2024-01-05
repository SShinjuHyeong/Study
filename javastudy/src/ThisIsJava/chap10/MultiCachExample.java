public class MultiCatchExample{
	public static void main(String[] args) {
		try { 
			String data1= args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" +result);
		}catch(ArrayIndexOutBoundsException | NumberFormatException e) {		//동일하기 처리하고 싶은 예외를 |  로 연결하면 된다.
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		}catch(Exception e) {
			System.out.println("알수없는 예외 발생");
		}finally {
			Systm.out.println("다시 실행하세요.");
		}
	}
}