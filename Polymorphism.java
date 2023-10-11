//public class Polymorphism {
//    public static void main(String[] args) {
////        bye h = new bye();
////        h.hello(5);
////        h.hello();
//        school sc1 = new school();
//        ei obj1 = new ei();
//        sc1.solve();
//        obj1.solve();
//    }
//}
////class bye{
////    void hello(){
////        System.out.println("welcome to the hello world");
////    }
////    void hello(int x){
////        System.out.println("Welcome to the world of "+ x);
////    }
////}
//
//class ei{
//    int students;
//    int teachers;
//    ei(){
//        System.out.println("i am the constructor of ei");
//    }
//    void solve(){
//        System.out.println("welcome to the world of ei");
//    }
//}
//class school extends ei{
//    int ground;
//    school(){
//        System.out.println("i am the constructor of school");
//    }
//    @Override
//    void solve(){
//        System.out.println("welcome to the world or school");
//    }
//}

public class Polymorphism{
    static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        human h1=new human(25,"rishu",15000,"male");
        h1.print();
        human h2= new human(24,"paakhi",1000000,"female");
        h2.print();
        Test a = new Test("kunal");
        Test b = new Test("mukesh");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
class human{
    int age;
    String name;
    int salary;
    String gender;
    static long population;

    public human(int age, String name, int salary, String gender) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        human.population += population;
    }

    void print(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Salary : "+this.salary);
        System.out.println(this.gender);
        System.out.println("how many humans in this class : " + human.population);
    }
}
