package Six;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

//추상클래스란? 
//추상메서드를 한개이상 포함하는 클래스
//추상클래스는 인스턴스를 생성할 수 없다.
public abstract class ContentSender {
	String bank;
	String name;

	public ContentSender() {
		// TODO Auto-generated constructor stub
	}

	public ContentSender(String bank, String name) {
		super();
		this.bank = bank;
		this.name = name;
	}
	
	// 추상메서드 --> 상속을 통해서 반드시 재정이 되어야지만 비로소 인스턴스를 생성할 수 있다.
//	public abstract public void sendMsg(String recipient);

	public void timeStamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd hh:mm:ss");
		System.out.println(sdf.format(timestamp));
	}
}
