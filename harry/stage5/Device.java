public enum Device {
    iPad;

    private String model;

    public void deviceModel(String s) {
        this.model = s;
    }

    public void display() {
        System.out.println(model);
    }
}
