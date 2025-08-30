public class Main {
    public static void main(String[] args) {

        Teacher ogrt1 = new Teacher("Yavuz", "FENB", "95014051");
        Teacher ogrt2 = new Teacher("Şule", "MTMK", "95014159");
        Teacher ogrt3 = new Teacher("Engin", "TRH", "95014255");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(ogrt3);

        Course matematik = new Course("Matematik", "102", "MTMK");
        matematik.addTeacher(ogrt2);

        Course fenBilgisi = new Course("FenBilgisi", "103", "FENB");
        fenBilgisi.addTeacher(ogrt1);

        // Student(Course c1, Course c2, Course c3, String name, String stuNo, String classes)
        Student st1 = new Student(tarih,matematik,fenBilgisi,"Firuze","123","4");
        st1.addExamNote(20,28,50);
        st1.isPass();

        Student st2 = new Student(tarih,matematik,fenBilgisi,"Ali","1234","5");
        st2.addExamNote(55,62,90);
        st2.isPass();
    }
}
