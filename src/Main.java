public class Main {
    public static void main(String[] args) {
//Creating the instance of a pizza class
//        pizza basepizza=new pizza(true);
//        pizza basepizza=new pizza(false);
//        basepizza.getpizzaprice();

//        basepizza.addExtracheese();
//        basepizza.addExtratoppings();
//        basepizza.takeaway();
//        basepizza.getbill();

//        basepizza.basepizzaprice();

        Deluxpizza dp=new Deluxpizza(true);
//        dp.addExtratoppings(); User can't do changes cause i dissabled it by @override adding extra cheese and adding toppings
        dp.takeaway();

        dp.getbill();


    }
}