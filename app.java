public class app 
{
    public static void main(String[] args) 
    {
        String val = "25|65|98|54";
        int i = 0;
        int lasti = 0;

        while (i < val.length())
        {
            if(val.charAt(i) == '|')
            {
                System.out.println(val.substring(lasti , i));
                lasti = i+1;
            }
            if(i == val.length() - 1)
            {
                System.out.println(val.substring(lasti , i+1));
            }
            i++;
        }
    }
}
