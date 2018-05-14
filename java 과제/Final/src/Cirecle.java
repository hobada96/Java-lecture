//class Circle	{
//    public static double PI	=3.14;	 	 //	static field
//    double radius;
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public double calculateArea() {
//        return radius * radius * PI;
//    }
//}

class Circle{
    public static final double PI	=3.14;	//	static field
    double radius;	//	field
    public static double computeArea(double radius)	{	 	 //	static method
        return PI*radius*radius;
    }
}