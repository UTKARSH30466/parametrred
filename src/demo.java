public class demo {
    int id;
    String name;
    int age;
    demo(int i,String n)
    {
        id = i;
        name = n;
    }
    demo(int i,String n,int a)
    {
        id = i;
        name = n;
        age = a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void Main (String args[])
    {
        demo d1 = new demo(111,"ravi");
        demo d2 = new demo(2214,"nt" );
    }
}
