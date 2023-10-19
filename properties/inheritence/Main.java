package properties.inheritence;

public class Main {
    public static void main(String[] args) {
        Box box=new Box(4);
        Box box1 = new Box(box);
        System.out.println(box.l+" "+box.h+" "+box.w);
        System.out.println(box1.l+" "+box1.h+" "+box1.w);
        BoxWeight box3 = new BoxWeight(4.5,5.5,6.6,9);
        System.out.println(box3.l+" "+ box3.weight);
//        BoxWeight box4 = new box(2,3,4); we can't call the parent constructor like this
        Box box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5.weight); can't access without type cast
//        System.out.println(((BoxWeight) box5).weight); we have to typecast like this
    }
}
