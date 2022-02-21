package lesson11;

public enum OrganizationType {
    OOO(100, "ОАО"), ZAO(200), OAO(300);

    private final int number;
    private String name;

    OrganizationType(int number) {
        this.number = number;
    }
    OrganizationType(int number, String russianName){
        this.number=number;
        this.name=russianName;
    }

    public int getNumber() {
        return number;

    }
}
