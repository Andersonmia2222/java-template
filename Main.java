public class Main {

   public static void main(String []args) {
     

      

// 10 array is a block of memory that stores a collection
//of data items(elements) of the same type
// under one variable name 


// how to declear an array variable 
String[] apCompSci = new String[13];
double[] prices = new double[5]; 
String[] names = new String[5];
int[] luckyNums = new int[10];
boolean[] yesNo = new boolean[3];//default value 
// how to access a value in an array 
// arrayName[] is the index position 
System.out.println(prices[0] ); // first item 
// Use the same syntax to set a value in an array 
luckyNums[0] = 11;
luckyNums[5] = 14;
System.out.println( luckyNums[0] ); 
System.out.println( luckyNums[5] ); 
System.out.println( luckyNums[3] ); // prints 0 
 // System.out.println( luckyNums[45] ); // index 45 is out of bounds! 
// create an array with values using an initalizer list

String[] table = {"Mia", "Ethan", "Aaniyah"}; 
System.out.println( table[1] ); // gets the 2nd value in array 
System.out.println( table[0] ); // get the first value(index 0) 
// only use intilizer list shortcut when first declearing array 
// i.e. we cant do : apComSci = {"name1", "name2"}
 
 // the .length attribute gets the number of items in array
int lengthOfTableArray = table.length;
System.out.println( lengthOfTableArray );//3 items 
// to get LAST ITEM use: arrayName[arrayName.length - 1]

System.out.println( finalIndex); // 2 is final index 

System.out.println( table[ finalIndex]); // table[2] = "Aaniyah"
System.out.println(table[ table/length -1 ]); // same as above 


// *** 4.4 TRAVERSING ARRAYS***
double[] scores = {45.0, 20.0, 89.5, 97.8};
// look at one item using an index 
System.out.println( score[1] );
// use a STANDARD FOR LOOP to iterate through EVERY item 

for ( int i = 0; i < 4; i++ ){
   System.out.println("Current item:" + scores[i] ); 

   for ( int i =0; i< scores.length; i++) {
      System.out.println("Current item:" + scores[i] );
      // "curve the test scores" = modify array items
scores[i] = scores[i] + 10;
System.out.println("Score after curve:" + scores[i]); 
}

// SHORTCUT if you only want to visit items, not modify
// use an enhanced for each loop
double sum = 0;
//for each individual score in the array of scores 
for ( double score : scores ) {
// dont need [], index is not relevent here 
sum += score; // add current item to the sum 

}
 System.out.println(sum); 
 double avg = sum / scores.length;
 System.out.println(avg);
 



   }//ends main Method

}// end main class 
