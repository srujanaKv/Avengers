package com.sruj.accespecifier.external;

    import com.sruj.accespecifier.internal.Templee;

    public class DonationBox {
        public DonationBox(){

            System.out.println("Runnnig external Donationbox const");
        }
        public void Restingarea(){
            System.out.println("Running external Restingarea method and calling public method from temple");
            Templee templee=new Templee();
            templee.ticket_counter();
}
    }

