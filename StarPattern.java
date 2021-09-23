//public class StarPattern {
//    public static void main(String[] args) {
        // Number of rows = 5
//        int count = 7;

//        //Outer Loop for number of Rows
//        for(int i=1;i<count;i++)
//        {
//            for(int k=i;k<count;k++)
//                System.out.print(" ");
//
//            // Loop to handle no of columns
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(" * ");
//            }
//
//            System.out.println();
//        }
//        // for F pattern
//        for (int i=1; i<= count ; i++)
//        {
//            for (int j = count; j >= i; j--) {
//                if (j == 5 || i == 1 || i==3) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
        // for A pattern
//

//        int i, j;
//        int count=7 , row = 5 ,col=5;
//        for ( i=0;i<row;i++ )
//        {
//            for ( j=0;j<=col/2 ;j++ )
//            {
//                if (row == 0 || row == 3 || col == 0 || col == 5)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


/*
j=count/2 print pattern
* * * * *
*       *
*       *
*       *
*       *

i=count/2
middle and side
 */

/*
step 1: number of rows we want print =5

step2: outer loop for number of rows
use for loop
i=1; i<5 ; increment
step 3: loop for spacing purpose
k=1;k<5;increment of k

step4: print * for each colm
another loop
j =1 ; j<=1; j++

step 5: print *
 */

/*

                              * * * * *
                              *       *
                              *       *
                              * * * * *
                              *       *
                              *       *
                              *       *
                              i=7 j=5


 */

        // For Z pattern
//        int i, j;
//        for (i = 1; i <= 5; i++) {
//            for (j = 1; j < 5; j++) {
//                if (i == 1 || i == 5 || i + j == 6)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }}


// For N pattern
//        int i, j;
//        for (i = 1; i <= 5; i++) {
//            for (j = 1; j <= 5; j++) {
//                if (j == 1 ||j ==5 || i-j==0)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }}
        /*
         *      *
         *  *   *       j==1  j==5   middle part > cond => i-j=0 (j=1 i=1 ; j=2 i=2 ; j=3 i=3 ; j=4 i=4 ; j=5 i=5)
         *    * *
         *      *

         */

//For W pattern

//        int i, j;
//        for (i = 1; i <= 5; i++) {
//            for (j = 1; j <= 5; j++) {
//                if (j==5 || j==1 ||(i==4 && j==2) || (i==3&&j==3)|| (i==4 &&j==4)|| (i==5 && j==1)|| (i==5 && j==5))    // middle part i=4 j=2 ; i=3 j=3 ; i=4 j=4 ; i=5 j=1 )
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }}

// For K pattern
//        int i, j;
//        for (i = 1; i <= 5; i++) {
//            for (j = 1; j <= 5; j++) {
//                if (j == 1 ||(i==3&&j==2)||(i==2 && j==3)||(i==1&& j==4)||(i==4 && j==3)||(i==5 && j==4))
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }}
/*
*   *
*  *
* *
*  *
*   *

  j==1

  i==3 && j==2
  i==2 && j==3
  i==1 && j==4
  i==4 && j==3
 */

        //For D pattern
//        int i, j;
//        for (i = 1; i <= 5; i++) {
//            for (j = 1; j <= 5; j++) {
//                if (j==1 || (i==1 && j==1) || (i==2 && j==4) || (i==3 && j==5) || (i==4 && j==4) ||(i==1 && j==3) ||(i==5 && j==2))
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }}

/*
*  *
*    *
*      *
*    *
* *
 */

    //for KDW pattern
    public class StarPattern {
        public static void forPatternK() {
            int i, j;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j <= 5; j++) {
                    if (j == 1 || (i == 3 && j == 2) || (i == 2 && j == 3) || (i == 1 && j == 4) || (i == 4 && j == 3) || (i == 5 && j == 4))
                        System.out.print("***");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void forPatternD() {
            int i, j;

            for (i = 1; i <= 5; i++) {
                for (j = 1; j <= 5; j++) {
                    if (j == 1 || (i == 1 && j == 1) || (i == 2 && j == 4) || (i == 3 && j == 5) || (i == 4 && j == 4) || (i == 1 && j == 3) || (i == 5 && j == 2))
                        System.out.print("**");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void forPatternW() {
            int i, j;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j <= 5; j++) {
                    if (j == 5 || j == 1 || (i == 4 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 4) || (i == 5 && j == 2) || (i == 5 && j == 4))    // middle part i=4 j=2 ; i=3 j=3 ; i=4 j=4 ; i=5 j=1 )
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            forPatternK();
            forPatternD();
            forPatternW();
            System.out.println();
            System.out.println("           ******           ***          ***       ***                 ***  ");
            System.out.println("           **    **                  ***                                    ");
            System.out.println("           **     **        ***                    ***                 ***  ");
            System.out.println("           **      **             ***                                        ");
            System.out.println("           **      **       ***                    ***                 ***   ");
            System.out.println("           **      **                ***                     ***               ");
            System.out.println("           **     **        ***         ***        ***   ***      ***  ***    ");
            System.out.println("           **    **                                                            ");
            System.out.println("           *****            ***          ***       ***                 ***");
            System.out.println();
        }
    }