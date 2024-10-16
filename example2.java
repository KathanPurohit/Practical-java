class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;

    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.90; // 10% discount
        } else {
            return super.getSalePrice() * 0.80; // 20% discount
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;

    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95; // 5% discount
        } else {
            return super.getSalePrice() * 0.90; // 10% discount
        }
    }
}

public class example2 {
    public static void main(String[] args)
     {
        // Create an instance of Sedan
        Sedan sedan = new Sedan(160, 20000, "Red", 22);
        System.out.println("Sedan Sale Price: $" + sedan.getSalePrice());

        // Create two instances of Ford
        Ford ford1 = new Ford(180, 25000, "Blue", 2022, 3000);
        Ford ford2 = new Ford(200, 30000, "Black", 2023, 4000);
        System.out.println("Ford 1 Sale Price: $" + ford1.getSalePrice());
        System.out.println("Ford 2 Sale Price: $" + ford2.getSalePrice());

        // Create an instance of Truck
        Truck truck = new Truck(140, 40000, "White", 3000);
        System.out.println("Truck Sale Price: $" + truck.getSalePrice());

        // Create an instance of Car
        Car car = new Car(120, 15000, "Green");
        System.out.println("Car Sale Price: $" + car.getSalePrice());
    }
}
