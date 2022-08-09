package entities;

public class Rooms {

    private String name;
    private String email;

    public Rooms(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString(){
        return name + ", " + email;
    }

}
