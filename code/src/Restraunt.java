import java.util.List;

public class Restraunt {
    private String name;
    private List<Branch> branches;

    public void addBranch(Branch branch) {
        branches.add(branch);
    }
    public void removeBranch(Branch branch) {
        branches.remove(branch);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Branch> getBranches() {
        return branches;
    }
    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}