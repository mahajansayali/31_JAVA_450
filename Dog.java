interface Animal{
void sleep();
}

 interface  cat{
public void eat();
}

class Dog implements Animal,cat{
public void sleep(){
System.out.println(" Dog is sleeping");
}

public void eat(){
System.out.println("Cat is eating");

}
                     
public static void main(String[]args){
Dog d=new Dog();
d.sleep();
d.eat();
}

}