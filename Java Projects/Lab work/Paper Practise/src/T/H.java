package T;

public class H {
    private String reapperName;
    private String topics;

    public H(String reapperName, String topics) {
        this.reapperName = reapperName;
        this.topics = topics;
    }

    public H song(H o){
        String songLirics = "Hail";
        return this;
    }

    @Override
    public String toString() {

        this.song(this);

        return "HipHop{" +
                "rapperName='" + reapperName + '\'' +
                ", topics='" + topics + '\'' +
                '}';
    }
}
