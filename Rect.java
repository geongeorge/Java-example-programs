class Shape {
	int area,peri;
	Shape() {
		area = 100;
		peri = 75;
	}
	protected void showData() {
		System.out.println("Area = "+area);
		System.out.println("Perimeter = "+peri);
		System.out.println();
	}
}
class Rect extends Shape {
	/*
	Rect() {
		super();
	}*/
	//cannot assign weaker privilage like default or private to overridden method
	public void showData() {
		System.out.println("Overridden Perimeter = "+peri);
	}
	public static void main(String args[]) {
		Rect rec = new Rect();
		rec.showData();
	}
}