package deepclone;
public class MemberExample{
	public static void main(String[] args) {
		//원본 객체 생성
	Member original = new Member("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
	
	//복제 객체를 얻은 후에 참조 객체의 값을 변형
	Member cloned = original.getMember();
	cloned.scores[0] = 100;
	cloned.car.model = "그랜절";
	
	System.out.println("[복제 객체의 필드값]");
	System.out.println("name: " + cloned.name);
	System.out.println("age: " + cloned.age);
	System.out.println("scores: {");
	for(int i=0; i<cloned.scores.length;i++) {
		System.out.println(cloned.scores[i]);
		System.out.print((i == (cloned.scores.length-1))?"":",");
	}
	System.out.println("}");
	System.out.println("car: " + cloned.car.model);
	
	System.out.println();
	
	System.out.println("[원본객체의 필드값]");
	System.out.println("name: " + original.name);
	System.out.println("age: " + original.age);
	System.out.print("scores: {");
	
	for(int i=0; i<cloned.scores.length;i++) {
		System.out.println(cloned.scores[i]);
		System.out.print((i == (cloned.scores.length-1))?"":",");
	System.out.print((i==(original.scores.length-1))?"":",");
	}
	System.out.println("}");
	System.out.println("car: " + original.car.model);
}
}