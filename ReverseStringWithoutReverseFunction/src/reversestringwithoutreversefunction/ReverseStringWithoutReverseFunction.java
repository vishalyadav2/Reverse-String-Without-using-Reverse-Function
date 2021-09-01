
package reversestringwithoutreversefunction;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class ReverseStringWithoutReverseFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        s = sc.next();
        System.out.println("After the Reverse String : ");
        
        for(int i = s.length(); i> 0 ; --i)
        {
            System.out.println(s.charAt(i-1));
        }
    }
    
}
