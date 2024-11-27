import java.util.Scanner;

public class owlconso {
    public static void main(String[] args) {
        System.out.println(" give any alphabet for searching vowel or consonant ");
     Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        // finding the alphabet  is vowel or consonant using switch statement
        switch(ch){
            case 'a' :
             case 'e':
             case 'i' :
             case 'o' :
             case 'u' :
             case 'A' :
             case 'E' :
             case 'I' :
             case 'O' :
             case 'U' :
             System.out.println(" this is an vowel");
             break;
         default:
             System.out.println("this is an consonant");
     }

    //  finding the alphabet  is vowel or consonant using if  statement
        System.out.println();
        char chr = 'o';
     if(chr =='a' || chr =='e' || chr =='i' || chr =='o' || chr =='u' || chr =='A' || chr =='E' || chr =='I' ||  chr =='O' ||  chr =='U'  ){
         System.out.println(" this is an vowel ");
     }
     else{
         System.out.println(" this is an consonant ");
     }
    }
}

