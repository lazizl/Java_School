public class Section {
    private String name;
    private Teacher teacher;
    private int classSize;
    private Student[] Students = new Student[60];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    public Student[] getStudents() {
        return Students;
    }

    public void setStudents(Student[] students) {
        Students = students;
    }

    public Section(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + " is taught by " + this.teacher.getName() + " and has " + this.classSize + " students " + listStudents();
    }
    public String listStudents() {
        String o = "";

        for (int i = 0; i < classSize; i++) {
            o += Students[i].getName() + ", ";
        }
        return o;
    }
    public void addStudents (Student s){
        Students[classSize] = s;
        classSize ++;
    }
}

