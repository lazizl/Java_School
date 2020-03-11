public class Runner {
    public static void main(String[] args) {
        School Berk = new School ("Berkeley High");

        Section Math = new Section ("Math");
        Section Biology = new Section ("Biology");
        Section compSi = new Section ("Computer Science");

        Teacher albinson = new Teacher ("Albinson","Computer Science");
        Teacher Albrecht = new Teacher ("Albrecht","Math");
        Teacher Mueller = new Teacher ("Mueller", "Biology");

        Berk.addSections(Math);
        Berk.addSections(Biology);
        Berk.addSections(compSi);

        System.out.println(Berk.toString());

        //Teacher
        albinson.addSections(compSi);
        compSi.setTeacher(albinson);
        albinson.addSections(Math);
        Math.setTeacher(albinson);
        System.out.println(albinson.toString());

        Albrecht.addSections(Biology);
        Biology.setTeacher(Albrecht);
        System.out.println(Albrecht.toString());

        Mueller.addSections(Math);
        Math.setTeacher(Mueller);
        System.out.println(Mueller.toString());

        //students
        Student Andrew = new Student("Andrew", 11);
        Andrew.addSections(Math);
        Math.addStudents(Andrew);

        Andrew.addSections(Biology);
        Biology.addStudents(Andrew);

        Andrew.addSections(compSi);
        compSi.addStudents(Andrew);

        System.out.println(Andrew.toString());

        Student Logan = new Student("Logan", 11);
        Logan.addSections(Math);
        Math.addStudents(Logan);

        Logan.addSections(Biology);
        Biology.addStudents(Logan);

        Logan.addSections(compSi);
        compSi.addStudents(Logan);

        System.out.println(Logan.toString());

        Student Noam = new Student("Noam", 11);
        Noam.addSections(Math);
        Math.addStudents(Noam);

        Noam.addSections(Biology);
        Biology.addStudents(Noam);

        Noam.addSections(compSi);
        compSi.addStudents(Noam);

        System.out.println(Noam.toString());

        Student Lucas = new Student("Lucas", 11);
        Lucas.addSections(Math);
        Math.addStudents(Lucas);

        Lucas.addSections(Biology);
        Biology.addStudents(Lucas);

        Lucas.addSections(compSi);
        compSi.addStudents(Lucas);

        System.out.println(Lucas.toString());

        Student Huaerzeng = new Student("Huaerzeng", 11);
        Huaerzeng.addSections(Math);
        Math.addStudents(Huaerzeng);

        Huaerzeng.addSections(Biology);
        Biology.addStudents(Huaerzeng);

        Huaerzeng.addSections(compSi);
        compSi.addStudents(Huaerzeng);

        System.out.println(Huaerzeng.toString());

        Student Failure = new Student("Failure", 11);
        Failure.addSections(Math);
        Math.addStudents(Failure);

        Failure.addSections(Biology);
        Biology.addStudents(Failure);

        Failure.addSections(compSi);
        compSi.addStudents(Failure);

        System.out.println(Failure.toString());

        System.out.println(Math.toString());
        System.out.println(Biology.toString());
        System.out.println(compSi.toString());
    }
}

