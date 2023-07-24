class Helmet{
static String name;
static String brand;
String color;
float price;
Helmet()
{
super();
System.out.println("invoking const of Helmet");
}
Helmet(String name,String brand)
{
System.out.println("invoking string,string of Helmet");
this.name=name;
this.brand=brand;
}
Helmet(String name,String brand,String color,float price)
{
System.out.println("invoking string,string,String,float of Helmet");
this.name=name;
this.brand=brand;
this.color=color;
this.price=price;
}
static void printstatic()
{
System.out.println("invoking main of Helmet");
System.out.println(name);
System.out.println(brand);
}
 void printInstance()
{
System.out.println("invoking main of Helmet");
System.out.println(color);
System.out.println(price);
}
}