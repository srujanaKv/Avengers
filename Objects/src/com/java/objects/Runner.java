package com.java.objects;

import com.java.objects.internal.*;

import java.util.Objects;
public class Runner {
    public static void main(String[] args) {

        System.out.println("Corn is running");

        Corn corn = new Corn("Sweetcorn", "yellow", 10, true);
        Corn corn1 = new Corn("butter", "yellow", 15, false);
        Corn corn2 = new Corn("Sweetcorn", "yellow", 10, true);

        System.out.println("Corn is not matching:" + corn.equals(corn2));
        System.out.println("Corn is matching:" + corn2.equals(corn1));


        System.out.println("...........................");
        Binocular binocular = new Binocular("Nikon", "grey", 15000, 500);
        Binocular binocular1 = new Binocular("Krevia", "black", 10000, 600);
        Binocular binocular2 = new Binocular("Nikon", "grey", 15000, 500);

        System.out.println("Binocular is matching:" + binocular.equals(binocular2));
        System.out.println("binocular is not matching:" + binocular1.equals(binocular));


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


        System.out.println("watch");

        System.out.println("Equals method");

        Watch watch1 = new Watch();
        watch1.setBrand("Fossil");
        watch1.setColor("Brown");
        watch1.setType("Digital");
        watch1.setPrice(5000.0);

        Watch watch2 = new Watch();
        watch2.setBrand("Fossil");
        watch2.setColor("Brown");
        watch2.setType("Digital");
        watch2.setPrice(5000.0);

        Watch watch3 = new Watch();
        watch3.setBrand("Casio");
        watch3.setColor("Silver");
        watch3.setType("Analog");
        watch3.setPrice(4200.0);

        boolean w1 = watch1.equals(watch2);
        boolean w2 = watch1.equals(watch3);
        boolean w3 = watch2.equals(watch3);

        System.out.println("watch1 and watch2 isMatching? " + w1);
        System.out.println("watch1 and watch3 isMatching? " + w2);
        System.out.println("watch2 and watch3 isMatching? " + w3);


        System.out.println("Using setter");
        System.out.println("toString");

        IronBox iron = new IronBox();
        iron.setBrand("Philips");
        iron.setType("Steam");
        iron.setColor("White");
        iron.setPrice(1800.0);

        System.out.println(iron);

        System.out.println("Equals method");

        IronBox iron1 = new IronBox();
        iron1.setBrand("Bajaj");
        iron1.setType("Dry");
        iron1.setColor("Blue");
        iron1.setPrice(1200.0);

        IronBox iron2 = new IronBox();
        iron2.setBrand("Bajaj");
        iron2.setType("Dry");
        iron2.setColor("Blue");
        iron2.setPrice(1200.0);

        IronBox iron3 = new IronBox();
        iron3.setBrand("Usha");
        iron3.setType("Steam");
        iron3.setColor("Black");
        iron3.setPrice(2000.0);

        boolean i1 = iron1.equals(iron2);
        boolean i2 = iron1.equals(iron3);
        boolean i3 = iron2.equals(iron3);

        System.out.println("iron1 and iron2 isMatching? " + i1);
        System.out.println("iron1 and iron3 isMatching? " + i2);
        System.out.println("iron2 and iron3 isMatching? " + i3);


        System.out.println("Using setter");
        System.out.println("toString");

        Lorry lorry = new Lorry();
        lorry.setModel("Tata 407");
        lorry.setColor("White");
        lorry.setFuelType("Diesel");
        lorry.setCapacity(3.5);

        System.out.println(lorry);

        System.out.println("Equals method");

        Lorry lorry1 = new Lorry();
        lorry1.setModel("Eicher Pro");
        lorry1.setColor("Blue");
        lorry1.setFuelType("Diesel");
        lorry1.setCapacity(4.5);

        Lorry lorry2 = new Lorry();
        lorry2.setModel("Eicher Pro");
        lorry2.setColor("Blue");
        lorry2.setFuelType("Diesel");
        lorry2.setCapacity(4.5);

        Lorry lorry3 = new Lorry();
        lorry3.setModel("Ashok Leyland");
        lorry3.setColor("Red");
        lorry3.setFuelType("CNG");
        lorry3.setCapacity(5.0);

        boolean l1 = lorry1.equals(lorry2);
        boolean l2 = lorry1.equals(lorry3);
        boolean l3 = lorry2.equals(lorry3);

        System.out.println("lorry1 and lorry2 isMatching? " + l1);
        System.out.println("lorry1 and lorry3 isMatching? " + l2);
        System.out.println("lorry2 and lorry3 isMatching? " + l3);


        System.out.println("Using setter");
        System.out.println("toString");

        Auto auto = new Auto();
        auto.setBrand("Bajaj");
        auto.setColor("Yellow");
        auto.setFuelType("CNG");
        auto.setMileage(40.5);

        System.out.println(auto);

        System.out.println("Equals method");

        Auto auto1 = new Auto();
        auto1.setBrand("TVS");
        auto1.setColor("Green");
        auto1.setFuelType("Petrol");
        auto1.setMileage(35.0);

        Auto auto2 = new Auto();
        auto2.setBrand("TVS");
        auto2.setColor("Green");
        auto2.setFuelType("Petrol");
        auto2.setMileage(35.0);

        Auto auto3 = new Auto();
        auto3.setBrand("Piaggio");
        auto3.setColor("Red");
        auto3.setFuelType("Electric");
        auto3.setMileage(70.0);

        boolean a1 = auto1.equals(auto2);
        boolean a2 = auto1.equals(auto3);
        boolean a3 = auto2.equals(auto3);

        System.out.println("auto1 and auto2 isMatching? " + a1);
        System.out.println("auto1 and auto3 isMatching? " + a2);
        System.out.println("auto2 and auto3 isMatching? " + a3);


        System.out.println("Using setter");
        System.out.println("toString");

        Helicopter heli = new Helicopter();
        heli.setModel("Bell 429");
        heli.setColor("White");
        heli.setEngineType("Twin-engine");
        heli.setSpeed(287.0);

        System.out.println(heli);

        System.out.println("Equals method");

        Helicopter heli1 = new Helicopter();
        heli1.setModel("Apache");
        heli1.setColor("Camouflage");
        heli1.setEngineType("Turboshaft");
        heli1.setSpeed(293.0);

        Helicopter heli2 = new Helicopter();
        heli2.setModel("Apache");
        heli2.setColor("Camouflage");
        heli2.setEngineType("Turboshaft");
        heli2.setSpeed(293.0);

        Helicopter heli3 = new Helicopter();
        heli3.setModel("Robinson R44");
        heli3.setColor("Red");
        heli3.setEngineType("Piston");
        heli3.setSpeed(240.0);

        boolean h1 = heli1.equals(heli2);
        boolean h2 = heli1.equals(heli3);
        boolean h3 = heli2.equals(heli3);

        System.out.println("heli1 and heli2 isMatching? " + h1);
        System.out.println("heli1 and heli3 isMatching? " + h2);
        System.out.println("heli2 and heli3 isMatching? " + h3);


        System.out.println("Using setter");
        System.out.println("toString");

        Plane plane = new Plane();
        plane.setModel("Boeing 737");
        plane.setAirline("Air India");
        plane.setEngineType("Turbofan");
        plane.setRange(5600.0);

        System.out.println(plane);

        System.out.println("Equals method");

        Plane plane1 = new Plane();
        plane1.setModel("Airbus A320");
        plane1.setAirline("IndiGo");
        plane1.setEngineType("Turbofan");
        plane1.setRange(6100.0);

        Plane plane2 = new Plane();
        plane2.setModel("Airbus A320");
        plane2.setAirline("IndiGo");
        plane2.setEngineType("Turbofan");
        plane2.setRange(6100.0);

        Plane plane3 = new Plane();
        plane3.setModel("Boeing 777");
        plane3.setAirline("Emirates");
        plane3.setEngineType("GE90");
        plane3.setRange(9700.0);

        boolean p1 = plane1.equals(plane2);
        boolean p2 = plane1.equals(plane3);
        boolean p3 = plane2.equals(plane3);

        System.out.println("plane1 and plane2 isMatching? " + p1);
        System.out.println("plane1 and plane3 isMatching? " + p2);
        System.out.println("plane2 and plane3 isMatching? " + p3);


        System.out.println("Using setter");
        System.out.println("toString");

        Rocket rocket = new Rocket();
        rocket.setName("PSLV-C51");
        rocket.setCountry("India");
        rocket.setFuelType("Solid");
        rocket.setHeight(44.0);

        System.out.println(rocket);

        System.out.println("Equals method");

        Rocket rocket1 = new Rocket();
        rocket1.setName("Falcon 9");
        rocket1.setCountry("USA");
        rocket1.setFuelType("Liquid");
        rocket1.setHeight(70.0);

        Rocket rocket2 = new Rocket();
        rocket2.setName("Falcon 9");
        rocket2.setCountry("USA");
        rocket2.setFuelType("Liquid");
        rocket2.setHeight(70.0);

        Rocket rocket3 = new Rocket();
        rocket3.setName("Ariane 5");
        rocket3.setCountry("France");
        rocket3.setFuelType("Liquid");
        rocket3.setHeight(55.0);

        boolean r1 = rocket1.equals(rocket2);
        boolean r2 = rocket1.equals(rocket3);
        boolean r3 = rocket2.equals(rocket3);

        System.out.println("rocket1 and rocket2 isMatching? " + r1);
        System.out.println("rocket1 and rocket3 isMatching? " + r2);
        System.out.println("rocket2 and rocket3 isMatching? " + r3);



/*

        System.out.println("Using setter");
        System.out.println("toString");

        Sunglasses sunglasses = new Sunglasses();
        sunglasses.setBrand("Ray-Ban");
        sunglasses.setFrameColor("Black");
        sunglasses.setLensType("Polarized");
        sunglasses.setPrice(4999.0);

        System.out.println(sunglasses);

        System.out.println("Equals method");

        Sunglasses sg1 = new Sunglasses();
        sg1.setBrand("Oakley");
        sg1.setFrameColor("Blue");
        sg1.setLensType("Mirror");
        sg1.setPrice(3799.0);

        Sunglasses sg2 = new Sunglasses();
        sg2.setBrand("Oakley");
        sg2.setFrameColor("Blue");
        sg2.setLensType("Mirror");
        sg2.setPrice(3799.0);

        Sunglasses sg3 = new Sunglasses();
        sg3.setBrand("Fastrack");
        sg3.setFrameColor("Brown");
        sg3.setLensType("UV");
        sg3.setPrice(2599.0);

        boolean s1 = sg1.equals(sg2);
        boolean s2 = sg1.equals(sg3);
        boolean s3 = sg2.equals(sg3);

        System.out.println("sg1 and sg2 isMatching? " + s1);
        System.out.println("sg1 and sg3 isMatching? " + s2);
        System.out.println("sg2 and sg3 isMatching? " + s3); */


        System.out.println("Using setter");
        System.out.println("toString");

        Helmet helmet = new Helmet();
        helmet.setBrand("Vega");
        helmet.setColor("Black");
        helmet.setType("Full Face");
        helmet.setPrice(1800.0);
        System.out.println(helmet);

        System.out.println("Equals method");

        Helmet helmet1 = new Helmet();
        helmet1.setBrand("Studds");
        helmet1.setColor("Red");
        helmet1.setType("Open Face");
        helmet1.setPrice(1500.0);

        Helmet helmet2 = new Helmet();
        helmet2.setBrand("Studds");
        helmet2.setColor("Red");
        helmet2.setType("Open Face");
        helmet2.setPrice(1500.0);

        Helmet helmet3 = new Helmet();
        helmet3.setBrand("Steelbird");
        helmet3.setColor("White");
        helmet3.setType("Modular");
        helmet3.setPrice(2200.0);

        System.out.println("helmet1 and helmet2 isMatching? " + helmet1.equals(helmet2));
        System.out.println("helmet1 and helmet3 isMatching? " + helmet1.equals(helmet3));
        System.out.println("helmet2 and helmet3 isMatching? " + helmet2.equals(helmet3));






        System.out.println("Using setter");
        System.out.println("toString");

        Frock frock = new Frock();
        frock.setBrand("Zara");
        frock.setColor("Pink");
        frock.setSize("M");
        frock.setPrice(2999.0);
        System.out.println(frock);

        System.out.println("Equals method");

        Frock frock1 = new Frock();
        frock1.setBrand("H&M");
        frock1.setColor("Blue");
        frock1.setSize("S");
        frock1.setPrice(2499.0);

        Frock frock2 = new Frock();
        frock2.setBrand("H&M");
        frock2.setColor("Blue");
        frock2.setSize("S");
        frock2.setPrice(2499.0);

        Frock frock3 = new Frock();
        frock3.setBrand("Max");
        frock3.setColor("Yellow");
        frock3.setSize("L");
        frock3.setPrice(1999.0);

        System.out.println("frock1 and frock2 isMatching? " + frock1.equals(frock2));
        System.out.println("frock1 and frock3 isMatching? " + frock1.equals(frock3));
        System.out.println("frock2 and frock3 isMatching? " + frock2.equals(frock3));



        System.out.println("Using setter");
        System.out.println("toString");

        Saree saree = new Saree();
        saree.setBrand("Nalli");
        saree.setFabric("Silk");
        saree.setColor("Red");
        saree.setPrice(5500.0);
        System.out.println(saree);

        System.out.println("Equals method");

        Saree saree1 = new Saree();
        saree1.setBrand("Pothys");
        saree1.setFabric("Cotton");
        saree1.setColor("Blue");
        saree1.setPrice(2500.0);

        Saree saree2 = new Saree();
        saree2.setBrand("Pothys");
        saree2.setFabric("Cotton");
        saree2.setColor("Blue");
        saree2.setPrice(2500.0);

        Saree saree3 = new Saree();
        saree3.setBrand("Kanchipuram");
        saree3.setFabric("Silk");
        saree3.setColor("Green");
        saree3.setPrice(8000.0);

        System.out.println("saree1 and saree2 isMatching? " + saree1.equals(saree2));
        System.out.println("saree1 and saree3 isMatching? " + saree1.equals(saree3));
        System.out.println("saree2 and saree3 isMatching? " + saree2.equals(saree3));




        System.out.println("Using setter");
        System.out.println("toString");

        Dupatta dupatta = new Dupatta();
        dupatta.setBrand("FabIndia");
        dupatta.setFabric("Cotton");
        dupatta.setColor("White");
        dupatta.setPrice(799.0);
        System.out.println(dupatta);

        System.out.println("Equals method");

        Dupatta dupatta1 = new Dupatta();
        dupatta1.setBrand("Biba");
        dupatta1.setFabric("Chiffon");
        dupatta1.setColor("Pink");
        dupatta1.setPrice(899.0);

        Dupatta dupatta2 = new Dupatta();
        dupatta2.setBrand("Biba");
        dupatta2.setFabric("Chiffon");
        dupatta2.setColor("Pink");
        dupatta2.setPrice(899.0);

        Dupatta dupatta3 = new Dupatta();
        dupatta3.setBrand("W");
        dupatta3.setFabric("Georgette");
        dupatta3.setColor("Green");
        dupatta3.setPrice(999.0);

        System.out.println("dupatta1 and dupatta2 isMatching? " + dupatta1.equals(dupatta2));
        System.out.println("dupatta1 and dupatta3 isMatching? " + dupatta1.equals(dupatta3));
        System.out.println("dupatta2 and dupatta3 isMatching? " + dupatta2.equals(dupatta3));




        System.out.println("Using setter");
        System.out.println("toString");

        Handbag handbag = new Handbag();
        handbag.setBrand("Guess");
        handbag.setMaterial("Leather");
        handbag.setColor("Brown");
        handbag.setPrice(3499.0);
        System.out.println(handbag);

        System.out.println("Equals method");

        Handbag handbag1 = new Handbag();
        handbag1.setBrand("Caprese");
        handbag1.setMaterial("PU");
        handbag1.setColor("Black");
        handbag1.setPrice(2999.0);

        Handbag handbag2 = new Handbag();
        handbag2.setBrand("Caprese");
        handbag2.setMaterial("PU");
        handbag2.setColor("Black");
        handbag2.setPrice(2999.0);

        Handbag handbag3 = new Handbag();
        handbag3.setBrand("Lavie");
        handbag3.setMaterial("Canvas");
        handbag3.setColor("Red");
        handbag3.setPrice(2199.0);

        System.out.println("handbag1 and handbag2 isMatching? " + handbag1.equals(handbag2));
        System.out.println("handbag1 and handbag3 isMatching? " + handbag1.equals(handbag3));
        System.out.println("handbag2 and handbag3 isMatching? " + handbag2.equals(handbag3));





        System.out.println("Using setter");
        System.out.println("toString");

        Headphones headphones = new Headphones();
        headphones.setBrand("Sony");
        headphones.setType("Over-Ear");
        headphones.setColor("Black");
        headphones.setPrice(3999.0);
        System.out.println(headphones);

        System.out.println("Equals method");

        Headphones headphones1 = new Headphones();
        headphones1.setBrand("JBL");
        headphones1.setType("In-Ear");
        headphones1.setColor("Blue");
        headphones1.setPrice(1299.0);

        Headphones headphones2 = new Headphones();
        headphones2.setBrand("JBL");
        headphones2.setType("In-Ear");
        headphones2.setColor("Blue");
        headphones2.setPrice(1299.0);

        Headphones headphones3 = new Headphones();
        headphones3.setBrand("Boat");
        headphones3.setType("Wireless");
        headphones3.setColor("Red");
        headphones3.setPrice(1999.0);

        System.out.println("headphones1 and headphones2 isMatching? " + headphones1.equals(headphones2));
        System.out.println("headphones1 and headphones3 isMatching? " + headphones1.equals(headphones3));
        System.out.println("headphones2 and headphones3 isMatching? " + headphones2.equals(headphones3));




        System.out.println("Using setter");
        System.out.println("toString");

        Speaker speaker = new Speaker();
        speaker.setBrand("JBL");
        speaker.setType("Bluetooth");
        speaker.setColor("Black");
        speaker.setPrice(3499.0);
        System.out.println(speaker);

        System.out.println("Equals method");

        Speaker speaker1 = new Speaker();
        speaker1.setBrand("Sony");
        speaker1.setType("Wired");
        speaker1.setColor("White");
        speaker1.setPrice(2799.0);

        Speaker speaker2 = new Speaker();
        speaker2.setBrand("Sony");
        speaker2.setType("Wired");
        speaker2.setColor("White");
        speaker2.setPrice(2799.0);

        Speaker speaker3 = new Speaker();
        speaker3.setBrand("Boat");
        speaker3.setType("Portable");
        speaker3.setColor("Blue");
        speaker3.setPrice(1999.0);

        System.out.println("speaker1 and speaker2 isMatching? " + speaker1.equals(speaker2));
        System.out.println("speaker1 and speaker3 isMatching? " + speaker1.equals(speaker3));
        System.out.println("speaker2 and speaker3 isMatching? " + speaker2.equals(speaker3));




        System.out.println("Using setter");
        System.out.println("toString");

        Curtain curtain = new Curtain();
        curtain.setFabric("Cotton");
        curtain.setColor("Blue");
        curtain.setPattern("Floral");
        curtain.setPrice(799.0);
        System.out.println(curtain);

        System.out.println("Equals method");

        Curtain curtain1 = new Curtain();
        curtain1.setFabric("Silk");
        curtain1.setColor("Red");
        curtain1.setPattern("Plain");
        curtain1.setPrice(999.0);

        Curtain curtain2 = new Curtain();
        curtain2.setFabric("Silk");
        curtain2.setColor("Red");
        curtain2.setPattern("Plain");
        curtain2.setPrice(999.0);

        Curtain curtain3 = new Curtain();
        curtain3.setFabric("Polyester");
        curtain3.setColor("Grey");
        curtain3.setPattern("Striped");
        curtain3.setPrice(649.0);

        System.out.println("curtain1 and curtain2 isMatching? " + curtain1.equals(curtain2));
        System.out.println("curtain1 and curtain3 isMatching? " + curtain1.equals(curtain3));
        System.out.println("curtain2 and curtain3 isMatching? " + curtain2.equals(curtain3));

    }

    }
















