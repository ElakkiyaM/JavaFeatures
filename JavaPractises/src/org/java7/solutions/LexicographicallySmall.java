package org.java7.solutions;
import java.util.*;

class LexicographicallySmall {
    public static void main(String args[] ) throws Exception {               //declarations
    String charPosition = null;    
    List<String> swapArrayList = new ArrayList<String>();
    List<Integer> tAsciiValueList = new ArrayList<Integer>();
    List<Integer> sAsciiValueList = new ArrayList<Integer>();
    
    //Scanner
        Scanner sc = new Scanner(System.in);
        // Reading input from STDIN
        int testCases = Integer.parseInt(sc.nextLine());  
        int stringLength = sc.nextInt();
        int noOfSwapArrays = sc.nextInt();
        sc.nextLine(); //To move the cursor of scanner to next line
        String S = sc.nextLine();
        String T = sc.nextLine();
        
        while(sc.hasNextLine()){
            charPosition = sc.nextLine();
            swapArrayList.add(charPosition);
        }
        
        char[] sArray = new char[stringLength];
        char[] tArray = new char[stringLength];
       // int[] positions = new int[2];
    // To run only when there is minimum number of testcase available.         
    for(int t=1; t<=testCases; t++) {
    //To check if the input string is of given input length
        if(S.length() == stringLength && T.length() == stringLength){
            sArray = S.toCharArray();
            tArray = T.toCharArray();                    
        } else{
            System.out.println("The given string doesn't match the                   required criteria.");
        }     
        //converting the chars to ascii values for comparison
        for (char c: tArray){
            int v = (int) c;
            tAsciiValueList.add(v);
        }
        for(char e: sArray){
            int a = (int) e;
            sAsciiValueList.add(a);
        }

        for(String p: swapArrayList){
            String[] x = p.split(" ");
            int startPoint = Integer.parseInt(x[0]);
            int endPoint = Integer.parseInt(x[1]);
            int firstElement = tAsciiValueList.get(startPoint);                      
            int secondElement = tAsciiValueList.get(endPoint);            
            if(firstElement > secondElement){
               Collections.swap(tAsciiValueList, startPoint, endPoint);              }              
                      
        }

        for(int i=0; i<sAsciiValueList.size(); i++) {
            for(h: tAsciiValueList){
                if(g > h){

                }
            }
        }
        // Writing output to STDOUT   
         System.out.println(tAsciiValueList);
    }   
    
    
}

}