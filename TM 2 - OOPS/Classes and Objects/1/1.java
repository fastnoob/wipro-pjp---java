class Box{
	double w,h,d;
	Box(double width,double height,double depth) {
		w=width;
		h=height;
		d=depth;
	}
	double Volume() {
		double v;
		v=w*h*d;
		return v;
	}
	public static void main(String args[]) {
		Box b = new Box(8,2,2);
		System.out.println(b.Volume());
	}
}