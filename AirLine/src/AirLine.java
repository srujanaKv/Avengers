    public class AirLine {
        int flightNumber;
        String airlineName;
        String source;
        String destination;
        double ticketPrice;
        int totalSeat;
        int availableSeats;
        int noOfPassenger;
        String departureTime;
        String arrivalTime;

        public AirLine(int flightNumber){
            this.flightNumber=flightNumber;

        }

        public AirLine(int flightNumber,String airlineName){
            this(flightNumber);
            this.airlineName=airlineName;
        }

        public AirLine(int flightNumber,String airlineName,String source){
            this(flightNumber,airlineName);
            this.source=source;
        }

        public AirLine(int flightNumber,String airlineName,String source,String destination){
            this(flightNumber,airlineName,source);
            this.destination=destination;
        }

        public AirLine(int flightNumber,String airlineName,String source,String destination,int ticketPrice){
            this(flightNumber,airlineName,source,destination);
            this.ticketPrice=ticketPrice;
        }
        public AirLine(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat){
            this(flightNumber,airlineName,source,destination,ticketPrice);
            this.totalSeat=totalSeat;
        }

        public AirLine(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat,int availableSeats){
            this(flightNumber,airlineName,source,destination,ticketPrice,totalSeat);
            this.availableSeats=availableSeats;
        }
        public AirLine(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat,int availableSeats,int noOfPassenger){
            this(flightNumber,airlineName,source,destination,ticketPrice,totalSeat,availableSeats);
            this.noOfPassenger=noOfPassenger;
        }
        public AirLine(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat,int availableSeats,int noOfPassenger,String departureTime){
            this(flightNumber,airlineName,source,destination,ticketPrice,totalSeat,availableSeats,noOfPassenger);
            this.departureTime=departureTime;
        }

        public AirLine(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat,int availableSeats,int noOfPassenger,String departureTime,String arrivalTime){
            this(flightNumber,airlineName,source,destination,ticketPrice,totalSeat,availableSeats,noOfPassenger,departureTime);
            this.arrivalTime=arrivalTime;
        }



        public void airlineInfo(){
            System.out.println("************************************");
            System.out.println("flightNumber:"+this.flightNumber);
            System.out.println("airlineName:"+this.airlineName);
            System.out.println("Source:"+this.source);
            System.out.println("destination:"+this.destination);
            System.out.println("ticketPrice:"+this.ticketPrice);
            System.out.println("totalSeat:"+this.totalSeat);
            System.out.println("availableSeat:"+this.availableSeats);
            System.out.println("noOfPassenger:"+this.noOfPassenger);
            System.out.println("departureTime:"+this.departureTime);
            System.out.println("arrivalTime:"+this.arrivalTime);

        }

    }
    class AirLineRunner {
        public static void main(String[] args) {
            AirLine airline1 = new AirLine(4151);
            AirLine airline2 = new AirLine(4151, "air India");
            AirLine airline3 = new AirLine(5461, "bharat", "India", "tokyo");
            AirLine airline4= new AirLine(8525,"Indigo","delhi","america",5000,50);
            AirLine airline5= new AirLine(7525,"indigo","delhi","bengaluru",5000,50,230);

            airline1.airlineInfo();
            airline2.airlineInfo();
            airline3.airlineInfo();
            airline4.airlineInfo();
            airline5.airlineInfo();
        }

    }

