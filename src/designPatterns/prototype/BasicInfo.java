package designPatterns.prototype;

public class BasicInfo implements Prototype<BasicInfo> {
    private String name;
    private String email;

    BasicInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public BasicInfo clone() {
        return new BasicInfo(name, email);
    }

    public String toString() {
        return "BasicInfo{" +
                "name=" + name +
                ", email=" + email +
                "}";
    }
}
