    // Define the Shape interface
    interface Shape {
        String getColor();
        double getArea();

    
        default String getDescription() {
            return "This is a shape.";
        }
    }


    class Circle implements Shape {
        private double radius;
        private String color;

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        @Override
        public String getColor() {
            return color;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String getDescription() {
            return "This is a circle with color " + color + " and radius " + radius + ".";
        }
    }

    class Rectangle implements Shape {
        private double length;
        private double width;
        private String color;

        public Rectangle(double length, double width, String color) {
            this.length = length;
            this.width = width;
            this.color = color;
        }

        @Override
        public String getColor() {
            return color;
        }

        @Override
        public double getArea() {
            return length * width;
        }

        @Override
        public String getDescription() {
            return "This is a rectangle with color " + color + ", length " + length + ", and width " + width + ".";
        }
    }


    class Sign {
        private Shape shape;
        private String text;

        public Sign(Shape shape, String text) {
            this.shape = shape;
            this.text = text;
        }

        public void displaySign() {
            System.out.println("Sign Text: " + text);
            System.out.println(shape.getDescription());
            System.out.println("Background color: " + shape.getColor());
            System.out.println("Shape area: " + shape.getArea());
        }
    }

    public class practical23 {
        public static void main(String[] args) {
        
            Shape circle = new Circle(5.0, "Red");
        
            Shape rectangle = new Rectangle(4.0, 6.0, "Blue");

        
            Sign circleSign = new Sign(circle, "Welcome to the Campus Center");
            Sign rectangleSign = new Sign(rectangle, "Event Tonight!");

        
            System.out.println("Circle Sign:");
            circleSign.displaySign();
            
            System.out.println("\nRectangle Sign:");
            rectangleSign.displaySign();
        }
    }
