public class Calculate
{
    
    int num1,num2;
    Calculate(int x,int y)
    {
        num1=x;
        num2=y;
    }
    int Sum()
    {
        return(num1+num2);
    }
    public static void main(String []args){
        int result;
        Calculate obj=new Calculate(10,20);
        result=obj.Sum();
        System.out.println("your result is:-"+result);
    }
}