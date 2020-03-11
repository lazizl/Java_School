public class School {
    public String name;
    private Section[] Section = new Section [200];
    private int sectionCount;

    public School(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section[] getSection() {
        return Section;
    }

    public void setSection(Section[] section) {
        Section = section;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public String toString(){
        return "The school named " + this.name + " has " + sectionCount + " sections";
    }

    public void addSections(Section s) {
        Section[sectionCount] = s;
        sectionCount++;
    }
}