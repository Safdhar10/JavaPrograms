import java.util.*;
public class RoyAndProfilePicture {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int L=Integer.parseInt(sc.nextLine());
        int _noOfPhoto=Integer.parseInt(sc.nextLine());

        for(int i=1;i<=_noOfPhoto;i++)
        {
            String[] _getInput=sc.nextLine().split(" ");
            int _width=Integer.parseInt(_getInput[0]);
            int _height=Integer.parseInt(_getInput[1]);
            if(_width==_height && _width>=L)
            {
                System.out.println("ACCEPTED");
            }
            else if(_width<L || _height<L)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                System.out.println("CROP IT");
            }

        }
    }
}
