package come.jerry.fengzhuang;

public class TextArea {
	public static void main(String[] args) {
		Rect rect=new Rect();
		rect.a=2;
		rect.b=2;
		Shape shape=new Shape();
		double c=shape.getArea(rect.a, rect.b);
		System.out.println(c);
	
	}

}
