import java.util.Scanner;
public class Two_charCountInString{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        scan.close();
        int hash=0, star=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*')
                star++;
            else
                hash++;
        }
        if(star>hash){
            System.out.println(1);
        }
        else if(star<hash){
            System.out.println(-1);
        }
        else 
            System.out.println(0);
    }
}