public class Section {
    private String Name;
    public Section(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return '\'' + Name + '\'';
    }
}
