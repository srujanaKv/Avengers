public class Factory {
    private String location;
    private int workers;

    public Factory(String location, int workers) {
        this.location = location;
        this.workers = workers;
    }

    public void manufacture() {
        System.out.println("Factory is manufacturing");
    }

    @Override
    public String toString() {
        return "Factory{location='" + location + "', workers=" + workers + "}";
    }
}
