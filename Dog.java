public class Dog {
    
    public String name;
    private int age;
    private int weight;
    private String breed;
    private String color;

    public Dog(String name, int age) { //information you need to enter whenever you create a dog object
        this.name = name;  //this refers to the class's attibutes
        this.age = age;
    }

    public void speak(){
        System.out.println("I am " + this.name + ", and I am " + this.age + " years old.");

    }

    public int getAge() { //getter method
        return this.age; //tim.age wouldn't work, that attribute is private

    }

    public void setAge(int age){
        this.age = age;
    }

    public int add2(){
        return this.age + 2;
    }
}
