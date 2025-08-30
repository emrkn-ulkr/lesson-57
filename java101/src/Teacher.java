public class Teacher {

    String nameT;
    String branchT;
    String phoneNo;

    Teacher(String name,  String branchT, String phoneNo){
        this.nameT = name;
        this.branchT = branchT;
        this.phoneNo = phoneNo;
    }
    void show(){
        System.out.println("Öğretmenin İsmi:\t"+this.nameT);
        System.out.println("Öğretmenin Alanı:\t"+this.branchT);
        System.out.println("Öğretmenin Sekreter Nosu:\t"+phoneNo);
    }

}
