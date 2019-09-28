import java.util.*;

public class Project {
    private String name;
    private String decription;

    public Project () {
    }
    public Project (String name){
        this.name = name;
    }
    public Pitch (String name, String description){
        this.name = name;
        this.description = description;
        return Pitch(name + description)
    }
}