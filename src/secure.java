
import java.io.*;
class secure
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inp;
    
    void get()throws Exception
    {
       System.out.println("please input number in this format:");
       System.out.println("xxx-xx-xxxx");
       inp = br.readLine().trim();;
    }
    void calc()throws Exception
    {
        for(int i = 0; i <= inp.length()-1;i++)
        {
                
                char c = inp.charAt(3);
                char v = inp.charAt(6);
                int tot = inp.length();
                if((c == '-') && (v =='-') && (tot ==11))
                {
                    System.out.println("Your Social Security number is valid");
                    break;
                }
                else
                {
                    System.out.println("Your Social Security Number is not valid");
                    break;
                }
           
        }
    }
    public static void main(String[]args)throws Exception
    {
        secure o1 = new secure();
        o1.get();
        o1.calc();
    }
}