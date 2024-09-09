public class pizza {

    private int price;
    private Boolean veg;
    private int Extracheeseprice =100;
    private int Extratoppingsprice =150;
    private int backpackprice =20;
    private int basepizzaprice;

    private Boolean isExtracheeseadded=false;
    private Boolean isExtratoppingsadded=false;
    private Boolean isoptedfortakeaway=false;


    public pizza(Boolean veg) {
//        public pizza(Boolean veg): This is a constructor for a class named pizza
        this.veg = veg;
        if(this.veg) {
            this.price=300;
        } else{
            this.price=400;
        }
        basepizzaprice=this.price;
    }
//    public void getpizzaprice(){
//        System.out.println(this.price);
//    }
public void addExtracheese(){
        isExtracheeseadded=true;
        System.out.println("Extra cheese Added : " +Extracheeseprice);

//    When you use + between a string and a variable, Java automatically converts the variable to a string and concatenates (join or link) it with the string.
        this.price += Extracheeseprice;

}
    public void addExtratoppings(){
        isExtratoppingsadded=true;
        System.out.println("Extra toppings Added : " +Extratoppingsprice);
        this.price += Extratoppingsprice;
    }
    public void takeaway(){
        isoptedfortakeaway=true;
        System.out.println("opted for takeaway : " +backpackprice);
        this.price += backpackprice;
    }
    public void getbill()
    {
        String bill ="";
        System.out.println("pizza : "+basepizzaprice);
        if (isExtracheeseadded){
        bill += "Extra cheese added : "+Extracheeseprice+ "\n";
        }
        if (isExtratoppingsadded){
        bill += "Extra toppings added : "+Extratoppingsprice+ "\n";
        }
        if (isoptedfortakeaway){
        bill += "opted for takeaway : "+backpackprice+ "\n";
        }

        bill = "Bill: "+this.price +"\n";
        System.out.println(bill);



    }

}
