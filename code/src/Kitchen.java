import java.util.List;

public class Kitchen {
    private String name;
    private List<Chef> chefs;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Chef> getChefs() {
        return chefs;
    }
    public void setChefs(List<Chef> chefs) {
        this.chefs = chefs;
    }
}