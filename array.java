import java.util.Scanner;

public class array {      //same type of multiple data store in  like container  called array   & work only continuos memory
    static void main(){
        //declaration
        // int arr[];
        // //allocation
        // arr=new int[5];
        // //init                                 //and all goes 0  to n-1
        // int brr[]={10,20,30};
        // int n =brr.length;
        
        // // System.out.println(" value of 0 index=" +brr[0]);
        // //  System.out.println(" value of 1 index=" +brr[1]);

        //                                          //in the form of  for loop  we perform
        // //    for(int index=0;index<=n-1;index++)   {
        // //     System.out.println(brr[index]);

        // //    }                    
        // 
        
                                   // use for each loop
        // for(int val:brr){
        //     System.out.println(val);
        // }
                                       
        
        
        // take input
            //   int arr[]=new int[5];
            //   Scanner S=new Scanner(System.in)  ;    
            //   int n=arr.length;
              
            //   for( int i=0;i<=n-1;i++){
            //     System.out.println("input for index"+i);
            //     arr[i]=S.nextInt();
            //   }
            //    for(int val:arr){
            //     System.out.println( "answer is this"+val);

            //    }                        
                                         // sum in array
            // int arr[]={10,20,30,40,50} ;
            // int sum=0;
            // int n=arr.length;
            // for(int i=0;i<=n-1;i++){
                
            //     int val=arr[i];
            //     sum =sum+val;
               
            // }   
            //     System.out.println(sum);
                                                 //multiple 
        //    int arr[]={1,2,3,4} ;
        //    int multiple=1;
        //    int n=arr.length;
        //    for(int i=0;i<=n-1;i++)    {
        //     int val=arr[i];
        //     multiple=(multiple*val);
        //    }  
        //    System.out.println(multiple);                               
                                    
                                        //find the maximum value in array
        //  int arr[]={2,3,4,5,6,9};
        //  int n=arr.length;
        //  int maxvalue=arr[0];
        //   for (int i=0;i<=n-1;i++){
        //     if(arr[i]>maxvalue){
        //         maxvalue=arr[i];
        //     }
        //   }         
        //   System.out.println(maxvalue);                      

                                           // find the  minimum value inside the array
        //  int arr[]={2,3,4,5,6,-5,1}     ;
        //  int n=arr.length;
        //  int minvalue=arr[0] ;
        //  for( int i=0; i<=n-1;i++){
        //     if(arr[i]<minvalue){
        //         minvalue=arr[i];
        //     }
        //  }
        //  System.out.println(minvalue);

                                             //2d array start
        // int[][]arr;
        // arr=new int [3][4];
        // int [][]brr={{1,2},{2,3,4,5},{3,4,5,6,7,8}}  ; 
        // int rowlength=brr.length;
        // // int collength=brr[0].length;
        // for(int rowindex=0;rowindex<=rowlength-1;rowindex++){
        //     int collength=brr[rowindex].length;                   //
        //     for(int colindex=0;colindex<=collength-1;colindex++){
        //         System.out.print(brr[rowindex][colindex]+" ");

        //     }
        //     System.out.println();
        // }
                                             // input in  2d array
          int arr[][]=new int[3][4] ;
          Scanner sc=new Scanner(System.in);
          for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
             System.out.println("value of row"+i+"and column"+j);
            arr[i][j]=sc.nextInt();
            }
          }


              for(int rowindex=0;rowindex<=arr.length-1;rowindex++){
                for(int colindex=0;colindex<=arr[rowindex].length-1;colindex++){
                    System.out.print(arr[rowindex][colindex]+"");
                }
                System.out.println();

              }




























    }


}
 
 