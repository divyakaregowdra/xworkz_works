class Park{
String parkName;
String location;
double area;
int noOfGames;
int noOfTrees;
int peoples;
int price;
String openings;
String closing;

Park()
{
	super();
System.out.println("invoking no arg const of park");
}

Park( String parkName)
{
this();
this.parkName=parkName;
System.out.println("invoking String const of park");
}

Park( String parkName,String location)
{

this(parkName);
this.location=location;
System.out.println("invoking String,String in const  park");
}

Park(String parkName,String location,double area)
{
this(parkName,location);
this.area=area;
System.out.println("invoking String,String,double in const  park");
}

Park(String parkName,String location,double area,int noOfGames)
{
this(parkName,location,area);
this.noOfGames=noOfGames;
System.out.println("invoking String,String,double,int const of park");
}

Park(String parkName,String location,double area,int noOfGames,int noOfTrees)
{
this(parkName,location,area,noOfGames);
this.noOfTrees=noOfTrees;
System.out.println("invoking String,String,double,int,int const of park");
}


Park(String parkName,String location,double area,int noOfGames,int noOfTrees,int peoples)
{
this(parkName,location,area,noOfGames,noOfTrees);
this.peoples=peoples;
System.out.println("invoking String,String,double,int,int,int const of park");
}
Park(String parkName,String location,double area,int noOfGames,int noOfTrees,int peoples,int price)
{
this(parkName,location,area,noOfGames,noOfTrees,peoples);
this.price=price;
System.out.println("invoking String,String,double,int,int,int,int const of park");
}

Park(String parkName,String location,double area,int noOfGames,int noOfTrees,int peoples,int price,String openings)
{
this(parkName,location,area,noOfGames,noOfTrees,peoples,price);
this.openings=openings;
System.out.println("invoking String,String,double,int,int,int,int,String const of park");
}

Park(String parkName,String location,double area,int noOfGames,int noOfTrees,int peoples,int price,String openings,String closing )
{

this(parkName,location,area,noOfGames,noOfTrees,peoples,price,openings);
this.closing=closing;
System.out.println("invoking String,String,double,int,int,int,int,String,String const of park");
}


}