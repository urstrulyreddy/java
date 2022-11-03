public class const_overload
{
    int id;
    String name;
    const_overload()
    {
        System.out.println("this is default");
    }
    
        const_overload(int i, String n)
        {
            id=i;
            name=n;
        }
        public static void main(String[] args)
         {
            const_overload s=new const_overload();
            System.out.println("default constructor values");
            System.out.println("student id: "+ s.id+"student name:"+s.name);
            
        }
    
}