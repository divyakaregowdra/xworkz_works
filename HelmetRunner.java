class HelmetRunner{
public static void main(String[] args){
System.out.println("invoking Helmet");

Helmet helmet=new Helmet();
System.out.println(helmet.name);
System.out.println(helmet.brand);
System.out.println(helmet.color);
System.out.println(helmet.price);

Helmet helmet1=new Helmet();
System.out.println("honda");
System.out.println("good");
System.out.println(750);
System.out.println("red");

Helmet helmet2=new Helmet("deo","neon");

Helmet.printstatic();
helmet.printInstance();



}
}