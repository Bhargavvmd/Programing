package HR;

class B {
	int b1=10;
	static int c = 11;
}

class C extends B {
	public static void main(String[] args) {
		B.c = B.c + 10;
		System.out.println(B.c);
		B q = new B();
		q.b1 = q.b1 + 8;
		System.out.println(q.b1);
	}
}

class A extends B {
	public static void main(String[] args) {
		B a = new B();
		a.b1 = a.b1 + 2;
		System.out.println(a.b1);
		B.c = B.c + 2;
		System.out.println(B.c);
		A bx=new A();
		System.out.println(bx);
	}
}
