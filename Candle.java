class Candle{

 static String color;
 static String shape;
 float price;
 int noOfCandeles;
 
 Candle()
 {
  System.out.println("Invoking const in Candle");
 }
 
 Candle(String color, String shape)
 {
  System.out.println("Invoking String, String const in Candle");
  this.color=color;
  this.shape=shape;
  }
  
  Candle(String color, String shape, float price, int noOfCandeles)
 {
  System.out.println("Invoking String, String, float, int const in Candle");
  this.color=color;
  this.shape=shape;
  this.price=price;
  this.noOfCandeles=noOfCandeles;
  }
  
  static void printstatic()
  {
   System.out.println("Invoking main in Candle");
   System.out.println(color);
   System.out.println(shape);
   }
   
  void printInstance()
  {
   System.out.println("Invoking main in Candle");
   System.out.println(price);
   System.out.println(noOfCandeles);
   }
 }