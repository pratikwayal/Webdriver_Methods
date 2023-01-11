package methodchanging;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gamma a = new Gamma();
Beta  b =a.memo();
Alpha c = b.demo();
c.test();
a.memo().demo().test();
	}

}
