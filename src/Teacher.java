public class Teacher extends Person {
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public Section[] getSection() {
        return sections;
    }

    public void setSection(Section[] section) {
        sections = section;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public String toString() {
        return this.name + " teaches the following sections " + listSections();
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
