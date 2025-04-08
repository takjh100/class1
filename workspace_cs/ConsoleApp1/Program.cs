using System;
namespace kr.or.human
{
    class program
    {

        //구조체 :자바로 따지면 DTO
        struct Member
        {
            public String name;
            public int age;
        }

        program()
        {
            Member member = new Member();
            member.age = 20;
        }

        //소멸자

        ~program()
        {
            
        }
        static void Main(string[] arge)
        {
        
            Console.WriteLine("Hello World");

            int[] arr = { 1, 2, 3 };
            for (int i = 0; i < arr.Length; i++)
            {
            }

            foreach (int i in arr)
            {
            }

            try
            {
                arge = 3;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally 
            { 
            
            }
        }

        int test(int a)
        { 
            return a;
        }
        
    }

}

