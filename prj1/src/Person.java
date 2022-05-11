
class Human {
    String name;
    Address address;
    void print() {
        System.out.println("Name: "+name);
        System.out.println("Address: "+ address.HouseNo+ ", "+ address.AddLine+" Pin: " + address.Pin);
    }

 

}
class Address{
    String HouseNo;
    String AddLine;
    String Pin;
    
}
public class Person{
    public static void main(String[] args) {
        Human h1=new Human();
        h1.name="Abc";
        Address a=new Address();
        a.HouseNo="A1";
        a.AddLine="WhiteField, Bangalore";
        a.Pin="560003";
        h1.address=a;
        h1.print();
        
    }
}