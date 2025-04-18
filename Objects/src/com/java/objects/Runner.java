package com.java.objects;

import com.java.objects.internal.*;

import java.util.Objects;
public class Runner {
    public static void main(String[] args) {

        System.out.println("Corn is running");

        Corn corn=new Corn("Sweetcorn","yellow",10,true);
        Corn corn1=new Corn("butter","yellow",15,false);
        Corn corn2=new Corn("Sweetcorn","yellow",10,true);

        System.out.println("Corn is not matching:"+corn.equals(corn2));
        System.out.println("Corn is matching:"+corn2.equals(corn1));


        System.out.println("...........................");
        Binocular binocular=new Binocular("Nikon","grey",15000,500);
        Binocular binocular1=new Binocular("Krevia","black",10000,600);
        Binocular binocular2=new Binocular("Nikon","grey",15000,500);

        System.out.println("Binocular is matching:"+binocular.equals(binocular2));
        System.out.println("binocular is not matching:"+binocular1.equals(binocular));



        System.out.println("Chair is running");

        Chair chair = new Chair("Wood", "Brown", 1200, true);
        Chair chair1 = new Chair("Plastic", "White", 600, false);
        Chair chair2 = new Chair("Wood", "Brown", 1200, true);

        System.out.println("Chair is not matching: " + chair.equals(chair1));
        System.out.println("Chair is matching: " + chair.equals(chair2));





        System.out.println("Rubberband is running");

        Rubberband rubberband = new Rubberband("Faber-Castell", "Red", 50, true);
        Rubberband rubberband1 = new Rubberband("Kores", "Blue", 100, false);
        Rubberband rubberband2 = new Rubberband("Faber-Castell", "Red", 50, true);

        System.out.println("Rubberband is not matching: " + rubberband.equals(rubberband1));
        System.out.println("Rubberband is matching: " + rubberband.equals(rubberband2));



        System.out.println("Nailpolish is running");

        Nailpolish polish1 = new Nailpolish("Lakme", "Ruby Red", 150, true);
        Nailpolish polish2 = new Nailpolish("Colorbar", "Ocean Blue", 180, false);
        Nailpolish polish3 = new Nailpolish("Lakme", "Ruby Red", 150, true);

        System.out.println("Nailpolish is not matching: " + polish1.equals(polish2));
        System.out.println("Nailpolish is matching: " + polish1.equals(polish3));






        System.out.println("Mascara is running");

        Mascara mascara1 = new Mascara("Maybelline", "Volume Express", 299, true);
        Mascara mascara2 = new Mascara("L'Oreal", "Lash Paradise", 399, false);
        Mascara mascara3 = new Mascara("Maybelline", "Volume Express", 299, true);

        System.out.println("Mascara is not matching: " + mascara1.equals(mascara2));
        System.out.println("Mascara is matching: " + mascara1.equals(mascara3));





        System.out.println("Lipstick is running");

        Lipstick lipstick1 = new Lipstick("MAC", "Ruby Woo", 999, true);
        Lipstick lipstick2 = new Lipstick("Lakme", "Cherry Chic", 499, false);
        Lipstick lipstick3 = new Lipstick("MAC", "Ruby Woo", 999, true);

        System.out.println("Lipstick is not matching: " + lipstick1.equals(lipstick2));
        System.out.println("Lipstick is matching: " + lipstick1.equals(lipstick3));




        System.out.println("Ironman is running");

        Ironman mark50 = new Ironman("Mark 50", "Arc Reactor MK-IV", 100, true);
        Ironman mark42 = new Ironman("Mark 42", "Arc Reactor MK-II", 85, true);
        Ironman mark50Duplicate = new Ironman("Mark 50", "Arc Reactor MK-IV", 100, true);

        System.out.println("Ironman is not matching: " + mark50.equals(mark42));
        System.out.println("Ironman is matching: " + mark50.equals(mark50Duplicate));






        System.out.println("Spiderman is running");

        Spiderman peter1 = new Spiderman("Stark Suit", "Web Shooter", 95, true);
        Spiderman peter2 = new Spiderman("Classic Suit", "Organic Web", 90, false);
        Spiderman peter3 = new Spiderman("Stark Suit", "Web Shooter", 95, true);

        System.out.println("Spiderman is not matching: " + peter1.equals(peter2));
        System.out.println("Spiderman is matching: " + peter1.equals(peter3));




        System.out.println("Wolverine is running");

        Wolverine logan1 = new Wolverine("Logan", "Adamantium", 100, true);
        Wolverine logan2 = new Wolverine("Weapon X", "Bone", 90, true);
        Wolverine logan3 = new Wolverine("Logan", "Adamantium", 100, true);

        System.out.println("Wolverine is not matching: " + logan1.equals(logan2));
        System.out.println("Wolverine is matching: " + logan1.equals(logan3));





        System.out.println("Avengers are assembling");

        Avengers ironman = new Avengers("Ironman", "Tech Genius", 90, true);
        Avengers hulk = new Avengers("Hulk", "Super Strength", 100, false);
        Avengers ironmanDuplicate = new Avengers("Ironman", "Tech Genius", 90, true);

        System.out.println("Avengers are not matching: " + ironman.equals(hulk));
        System.out.println("Avengers are matching: " + ironman.equals(ironmanDuplicate));





        System.out.println("VintageCar is running");

        VintageCar car1 = new VintageCar("Mustang Fastback", "Ford", 1965, true);
        VintageCar car2 = new VintageCar("Beetle", "Volkswagen", 1960, false);
        VintageCar car3 = new VintageCar("Mustang Fastback", "Ford", 1965, true);

        System.out.println("VintageCar is not matching: " + car1.equals(car2));
        System.out.println("VintageCar is matching: " + car1.equals(car3));





        System.out.println("Cloud is running");

        Cloud cloud1 = new Cloud("Cumulus", "White", 2000, false);
        Cloud cloud2 = new Cloud("Stratus", "Gray", 1500, true);
        Cloud cloud3 = new Cloud("Cumulus", "White", 2000, false);

        System.out.println("Cloud is not matching: " + cloud1.equals(cloud2));
        System.out.println("Cloud is matching: " + cloud1.equals(cloud3));



        System.out.println("Rainbow is running");

        Rainbow rainbow1 = new Rainbow("Red", "Orange", 10, true);
        Rainbow rainbow2 = new Rainbow("Blue", "Green", 8, false);
        Rainbow rainbow3 = new Rainbow("Red", "Orange", 10, true);

        System.out.println("Rainbow is not matching: " + rainbow1.equals(rainbow2));
        System.out.println("Rainbow is matching: " + rainbow1.equals(rainbow3));





        System.out.println("Magie is running");

        Magie fireball = new Magie("Fireball", "Fire", 80, false);
        Magie lightningBolt = new Magie("Lightning Bolt", "Lightning", 90, false);
        Magie darkCurse = new Magie("Dark Curse", "Shadow", 95, true);

        System.out.println("Magie is not matching: " + fireball.equals(lightningBolt));
        System.out.println("Magie is matching: " + fireball.equals(fireball));




        System.out.println("Dragon is flying");

        Dragon dragon1 = new Dragon("Fire Dragon", "Red", 10, true);
        Dragon dragon2 = new Dragon("Ice Dragon", "White", 12, true);
        Dragon dragon3 = new Dragon("Fire Dragon", "Red", 10, true);

        System.out.println("Dragon is not matching: " + dragon1.equals(dragon2));
        System.out.println("Dragon is matching: " + dragon1.equals(dragon3));




        System.out.println("Mobile is running");

        Mobile iphone12 = new Mobile("Apple", "iPhone 12", 64, true);
        Mobile galaxyS21 = new Mobile("Samsung", "Galaxy S21", 128, true);
        Mobile iphone12Duplicate = new Mobile("Apple", "iPhone 12", 64, true);

        System.out.println("Mobile is not matching: " + iphone12.equals(galaxyS21));
        System.out.println("Mobile is matching: " + iphone12.equals(iphone12Duplicate));





        System.out.println("Dog is running");

        Dog dog1 = new Dog("Labrador", "Yellow", 3, true);
        Dog dog2 = new Dog("Bulldog", "Brown", 4, false);
        Dog dog3 = new Dog("Labrador", "Yellow", 3, true);

        System.out.println("Dog is not matching: " + dog1.equals(dog2));
        System.out.println("Dog is matching: " + dog1.equals(dog3));





        System.out.println("Horse is running");

        Horse horse1 = new Horse("Arabian", "White", 5, true);
        Horse horse2 = new Horse("Thoroughbred", "Brown", 6, true);
        Horse horse3 = new Horse("Arabian", "White", 5, true);

        System.out.println("Horse is not matching: " + horse1.equals(horse2));
        System.out.println("Horse is matching: " + horse1.equals(horse3));





        System.out.println("Chocolate is running");

        Chocolate chocolate1 = new Chocolate("Dark", "Mint", 100, true);
        Chocolate chocolate2 = new Chocolate("Milk", "Caramel", 150, false);
        Chocolate chocolate3 = new Chocolate("Dark", "Mint", 100, true);

        System.out.println("Chocolate is not matching: " + chocolate1.equals(chocolate2));
        System.out.println("Chocolate is matching: " + chocolate1.equals(chocolate3));





        System.out.println("Bike is running");

        Bike bike1 = new Bike("Mountain", "Trek", 21, false);
        Bike bike2 = new Bike("Road", "Giant", 18, false);
        Bike bike3 = new Bike("Mountain", "Trek", 21, false);

        System.out.println("Bike is not matching: " + bike1.equals(bike2));
        System.out.println("Bike is matching: " + bike1.equals(bike3));






        System.out.println("Bullet is revving");

        Bullet bullet1 = new Bullet("Bullet 350", "Black", 350, true);
        Bullet bullet2 = new Bullet("Bullet 500", "Red", 500, true);
        Bullet bullet3 = new Bullet("Bullet 350", "Black", 350, true);

        System.out.println("Bullet is not matching: " + bullet1.equals(bullet2));
        System.out.println("Bullet is matching: " + bullet1.equals(bullet3));





        System.out.println("Indian Jeep is roaring");

        IndianJeep jeep1 = new IndianJeep("Mahindra Thar", "Green", 2000, true);
        IndianJeep jeep2 = new IndianJeep("Force Gurkha", "Black", 2600, true);
        IndianJeep jeep3 = new IndianJeep("Mahindra Thar", "Green", 2000, true);

        System.out.println("Indian Jeep is not matching: " + jeep1.equals(jeep2));
        System.out.println("Indian Jeep is matching: " + jeep1.equals(jeep3));





        System.out.println("Bicycle is rolling");

        Bicycle bicycle1 = new Bicycle("Mountain", "Giant", 21, false);
        Bicycle bicycle2 = new Bicycle("Road", "Trek", 18, false);
        Bicycle bicycle3 = new Bicycle("Mountain", "Giant", 21, false);

        System.out.println("Bicycle is not matching: " + bicycle1.equals(bicycle2));
        System.out.println("Bicycle is matching: " + bicycle1.equals(bicycle3));






        System.out.println("Bird is flying");

        Bird bird1 = new Bird("Eagle", "Brown", 220, true);
        Bird bird2 = new Bird("Penguin", "Black and White", 80, false);
        Bird bird3 = new Bird("Eagle", "Brown", 220, true);

        System.out.println("Bird is not matching: " + bird1.equals(bird2));
        System.out.println("Bird is matching: " + bird1.equals(bird3));




        System.out.println("Clock is ticking");

        Clock clock1 = new Clock("Analog", "Black", 12, 30);
        Clock clock2 = new Clock("Digital", "White", 7, 15);
        Clock clock3 = new Clock("Analog", "Black", 12, 30);

        System.out.println("Clock is not matching: " + clock1.equals(clock2));
        System.out.println("Clock is matching: " + clock1.equals(clock3));




        System.out.println("Bucket is ready");

        Bucket bucket1 = new Bucket("Plastic", "Blue", 10, true);
        Bucket bucket2 = new Bucket("Metal", "Red", 15, false);
        Bucket bucket3 = new Bucket("Plastic", "Blue", 10, true);

        System.out.println("Bucket is not matching: " + bucket1.equals(bucket2));
        System.out.println("Bucket is matching: " + bucket1.equals(bucket3));






        System.out.println("Radio is on");

        Radio radio1 = new Radio("Sony", "Black", 108, true);
        Radio radio2 = new Radio("Panasonic", "Silver", 102, false);
        Radio radio3 = new Radio("Sony", "Black", 108, true);

        System.out.println("Radio is not matching: " + radio1.equals(radio2));
        System.out.println("Radio is matching: " + radio1.equals(radio3));





        System.out.println("CD is playing");

        CD cd1 = new CD("Thriller", "Michael Jackson", 42, false);
        CD cd2 = new CD("Back in Black", "AC/DC", 41, false);
        CD cd3 = new CD("Thriller", "Michael Jackson", 42, false);

        System.out.println("CD is not matching: " + cd1.equals(cd2));
        System.out.println("CD is matching: " + cd1.equals(cd3));


      // setter method //

        System.out.println("using setter");
        System.out.println("toString");

        Jacket jacket = new Jacket();
        jacket.setFabric("Leather");
        jacket.setColor("Black");
        jacket.setSize("Medium");
        jacket.setPrice(2500.0);
        System.out.println(jacket);

        System.out.println("Equals method");

        Jacket jacket1 = new Jacket();
        jacket1.setFabric("Cotton");
        jacket1.setColor("Blue");
        jacket1.setSize("Large");
        jacket1.setPrice(1500.0);

        Jacket jacket2 = new Jacket();
        jacket2.setFabric("Cotton");
        jacket2.setColor("Blue");
        jacket2.setSize("Large");
        jacket2.setPrice(1500.0);

        Jacket jacket3 = new Jacket();
        jacket3.setFabric("Leather");
        jacket3.setColor("Brown");
        jacket3.setSize("Medium");
        jacket3.setPrice(2000.0);

        boolean ja1 = jacket1.equals(jacket2);
        boolean ja2 = jacket1.equals(jacket3);
        boolean ja3 = jacket2.equals(jacket3);
        System.out.println("jacket1 and jacket2 isMatching? " + ja1);
        System.out.println("jacket1 and jacket3 isMatching? " + ja2);
        System.out.println("jacket2 and jacket3 isMatching? " + ja3);






        System.out.println("Using setter");
        System.out.println("toString");

        Shoes shoes = new Shoes();
        shoes.setBrand("Nike");
        shoes.setColor("White");
        shoes.setSize("9");
        shoes.setPrice(4500.0);

        System.out.println(shoes);

        System.out.println("Equals method");

        Shoes shoes1 = new Shoes();
        shoes1.setBrand("Adidas");
        shoes1.setColor("Black");
        shoes1.setSize("10");
        shoes1.setPrice(5000.0);

        Shoes shoes2 = new Shoes();
        shoes2.setBrand("Adidas");
        shoes2.setColor("Black");
        shoes2.setSize("10");
        shoes2.setPrice(5000.0);

        Shoes shoes3 = new Shoes();
        shoes3.setBrand("Nike");
        shoes3.setColor("Blue");
        shoes3.setSize("9");
        shoes3.setPrice(4200.0);

        boolean s1 = shoes1.equals(shoes2);
        boolean s2 = shoes1.equals(shoes3);
        boolean s3 = shoes2.equals(shoes3);

        System.out.println("shoes1 and shoes2 isMatching? " + s1);
        System.out.println("shoes1 and shoes3 isMatching? " + s2);
        System.out.println("shoes2 and shoes3 isMatching? " + s3);
    }
}












