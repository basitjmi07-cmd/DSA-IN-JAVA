public class method {                 // method declare
    // static void print2katable(){
    //     for(int i=1;i<=10;i++){
    //         int ans=2*i;
    //         System.out.println(">"+ans);
    //     }
    // }
//     static void sum(int x, int y){
// System.out.println("sum="+(x+y));
//     }
//     static void main(){
//         System.out.println("hi");       //method ko call
//         // print2katable();
//              sum(2,3);
//     }
   
    
// static int add(int x,int y){
//    int  sum=x+y;
//    return sum;
    

// }
//  static void main() {
//   int result =add (4, 50);
//   System.out.println(  "result"+result);
    
// }

// static void solve(int num){
//     System.out.println( "inside solve"+num);
//     num=num*10;
//     System.out.println("inside solve"+num);
// }
static  void  main(){                         // call by value
    int num=5;
    System.out.println("inside main"+num);
    solve(num);
    System.out.println("inside main"+num);
}

static void solve(int num){
    System.out.println( "inside solve"+num);
    num=num*10;
    System.out.println("inside solve"+num);
}



























}
