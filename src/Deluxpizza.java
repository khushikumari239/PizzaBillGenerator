public class Deluxpizza extends pizza {

//    Inheritance:
//    The Deluxpizza class extends the pizza class, meaning it inherits all the properties (fields) and methods from the pizza class.
//    Deluxpizza can add its own properties or methods, or override methods from the pizza class.

    @Override
    public void addExtracheese() {
//        super.addExtracheese(); (no need)
    }

    @Override
    public void addExtratoppings() {
//        super.addExtratoppings(); (no need)
    }

    public Deluxpizza(Boolean veg) {
        super(veg);

        super.addExtracheese();
        super.addExtratoppings();


    }
}

