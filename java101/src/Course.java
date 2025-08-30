public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branchT.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen Ve Ders Alanı Uyumsuz");
        }
        this.teacher = teacher;
    }

   void printTeacher(){
       this.teacher.show();
    }

}
