public class Runner{
	
	public static void main(String args[]){
		
		System.out.println("Ladder");
		int amt=8,length=10,price=1000;
		String climb="climb",use="climbing",name="wiring",owner="Ramesh",loc="tumkur",stable="stable";
		char in='v';
		double speed=13.88;
		boolean folding=true,wide=false;
		
		Ladder.ladderStairs(amt);
		Ladder.ladderLength(length);
		Ladder.ladderPrice(price);
		Ladder.ladderclimb(climb,speed);
		Ladder.ladderUse(use,name);
		Ladder.ladderShop(owner,in,loc);
		Ladder.ladderType(folding,stable,wide);
		
		System.out.println("FoodItem:");
		String fname="panipuri",hName="Nirmala hotel",location="Tamilnadu",room="Storage",type="fridge",country="Indian",cookname="madhav";
		int cost=100,time=10;
		boolean vornvg=false,start=true,spicy=true;
		char sec='B';
		FoodItem.foodName(fname);
		FoodItem.foodCost(cost);
		FoodItem.foodNonVeg(vornvg);
		FoodItem.foodHotel(hName,location);
		FoodItem.foodCook(start,time);
		FoodItem.foodStore(room,sec,type);
		FoodItem.foodType(country,spicy,cookname);
		
		System.out.println("Paper:");
		String made="Treepulp",size="A4",color="white",companyName="Mk4",pen="pen",penType="ball",inkColor="blue";
		String writer="Philips",purpose="biography";
		long ph=986792964;
		float thick=0.5f;
		boolean good=false,handwriring=true;
		Paper.paperMade(made);
		Paper.paperSize(size);
		Paper.paperColor(color);
		Paper.paperComanpany(companyName,ph);
		Paper.paperQuality(thick,good);
		Paper.paperInk(pen,penType,inkColor);
		Paper.paperWriting(handwriring,writer,purpose);
		
		System.out.println("Beer");
		String beerName="tiger",barName="fiction bar",barLocation="Goa",bcname="Kingfisher";
		name="Sarthak";
		long phno=987734653;
		int age=19,liter=5;
		boolean adult=true,strong=true;
		owner="Vaibhav";price=60;
		Beer.beerName(beerName);
		Beer.barName(barName);
		Beer.barLocation(barLocation);
		Beer.bar(owner,phno);
		Beer.beerCompany(bcname,price);
		Beer.beerDrinker(name,age,adult);
		Beer.beerRecord(liter,strong,price);
		
		System.out.println("WhiteBoard");
		String projecting="projecting",align="center",teacher="Anand",penColor="Black";
		int hours=2,distance=10;
		float height=30.5f,width=40.69f;
		boolean writing=true;
		use="writing";
		name="SDIT";
		char section='C';
		WhiteBoard.boardUse(use);
		WhiteBoard.boardProjecting(projecting);
		WhiteBoard.boardAllign(align);
		WhiteBoard.boardTeach(teacher,hours);
		WhiteBoard.boardDetails(height,width);
		WhiteBoard.boardColor(color,penColor,writing);
		WhiteBoard.boardInstitute(name,distance,section);
		
		
		System.out.println("Whiskey");
		String whiskeyName="Jack and Daniels",whname="J & D",mix="soda";
		int whprice=10000,peg=7;
		boolean hangover=true;
		name="Raj";
		age=13;adult=false;
		Whiskey.whiskeyName(whiskeyName);
		Whiskey.barName(barName);
		Whiskey.barLocation(barLocation);
		Whiskey.bar(owner,phno);
		Whiskey.whiskeyCompany(whname,whprice);
		Whiskey.whiskeyWaiter(name,age,adult);
		Whiskey.noofpeg(peg,mix,hangover);
		
		System.out.println("Dmart");
		String dname="Dmart",category="mens",branch="Kuntikan";
		type="jeans";
		int floor=4,nfloor=3,noofcounters=10;
		color="Red";
		char rack='t';
		location="manglare";
		Dmart.dmart(dname);
		Dmart.dmartfloors(floor);
		Dmart.uniformColor(color);
		Dmart.groceries(nfloor,rack);
		Dmart.dress(category,type);
		Dmart.dmartInfo(location,branch,noofcounters);
	
	}
}