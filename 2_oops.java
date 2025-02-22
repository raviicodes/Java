package oops;

public class oop {
    public static void main(String[] args){
        Cat cat=new Cat();
        System.out.println(cat.name);
        System.out.println(cat.age);
        cat.name="bob";
        cat.age=23;
        upper(cat);
        System.out.println(cat.name);
        System.out.println(cat.age);
    }
    public static  void upper(Cat newCat){
       newCat.name= newCat.name.toUpperCase();
    }

};
