package no.remotedm.model;

public class Player {

    private String name;
    private String id;
    private String className;

    public Player(String name, String id, String className) {
        this.name = name;
        this.id = id;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
