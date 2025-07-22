package in.sruj.Cigaratte;

public class CigaratteRunner {
    public static void main(String[] args) {
        Cigaratte cigaratte = new Cigaratte();
        Addiction addiction = new Addiction(cigaratte);
        cigaratte.smoke();
}


}
