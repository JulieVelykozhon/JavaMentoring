package hometask3.subTask3;

public class Employee {
    private  String name;
    private String surname;
    private double id;
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String getSurname(){
        return surname;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    Employee (String name, String surname){
        this.id = Math.random() * 9 + 1;
        this.name = name;
        this.surname = surname;
    }
    Employee (){
        this.id = Math.random() * 9 + 1;
    }
    public  void print (){
        System.out.println(getName() + " " + getSurname() + " " + getId());



    }

}
