public class Student extends Person {
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public Section[] getSection() {
        return sections;
    }

    public void setSection(Section[] section) {
        sections = section;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSectionsCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public String toString() {
        return this.name + " is in " + this.grade + "th" + " grade and is enrolled in the following sections " + listSections();
    }

    public String listSections() {
        String o = "";

        for (int i = 0; i < sectionCount; i++) {
            o += sections[i].getName() + ", ";
        }
        return o;
    }
    public void addSections(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }
}