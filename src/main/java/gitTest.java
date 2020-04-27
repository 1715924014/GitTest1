import java.sql.SQLOutput;

public class gitTest {
//    int i=10;
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        for(int i=0;i<10;i++){
           if (i%2==0){
               num1+=i;
           }else {
               num2+=i;
           }
       }
        System.out.println(num1);
        System.out.println(num2);
    }
}
