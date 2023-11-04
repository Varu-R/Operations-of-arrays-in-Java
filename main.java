package Pro;
import java.util.Scanner;
public class main {
			    public static void main(String[] args) {
			        Scanner sc=new Scanner(System.in);
			        System.out.println("===================KODNEST SEARCH-SORT====================");
			        System.out.println();
			        System.out.println("enter the array length..");
			        int arr1[]=new int[sc.nextInt()];
			        System.out.println("enter the array elments...");
			        for(int i=0;i<=arr1.length-1;i++) {
			            arr1[i]=sc.nextInt();
			        }
			        System.out.println("the array elements  are...");
			        for(int i=0;i<=arr1.length-1;i++) {
			            System.out.print(arr1[i]+" ");
			        }

			        System.out.println();

			        System.out.println("press 1 for--------->>>>>> SORT");
			        System.out.println("press 2 for--------->>>>>> SEARCH");
			        System.out.println("press 3 for--------->>>>>> MIN ELEMENT IN ARRAY");
			        System.out.println("press 4 for--------->>>>>> MAX ELEMENT IN ARRAY");
			        int choice=sc.nextInt();
			        switch(choice) {
			            case 1:
			                System.out.println("press 1 for--------->>>>>> BUBBLE SORT");
			                System.out.println("press 2 for--------->>>>>> SELECTION SORT");
			                System.out.println("press 3 for--------->>>>>> INSERTION SORT");
			                int choice1=sc.nextInt();
			                if(choice1==1) {
			                    System.out.println("press 1 for--------->>>>>> BUBBLE SORT IN ASCENDING ORDER ");
			                    System.out.println("press 2 for--------->>>>>> BUBBLE SORT IN DESCENDING ORDER ");
			                    int choice2=sc.nextInt();
			                    if(choice2==1){
			                        logics logic=new logics();
			                        logic.bubbleSortAscending(arr1);
			                    }else if(choice2==2){
			                    	
			                        new logics().bubbleSortDescending(arr1);
			                    }
			                }else if(choice1==2){
			                    System.out.println("press 1 for--------->>>>>> SELECTION SORT IN ASCENDING ORDER ");
			                    System.out.println("press 2 for--------->>>>>> SELECTION SORT IN DESCENDING ORDER ");
			                    int choice3=sc.nextInt();
			                    if (choice3==1){
			                        new logics().selectionSortAscending(arr1);
			                    }else if(choice3==2){
			                        new logics().selectionSortDescending(arr1);
			                    }
			                }else if(choice1==3){
			                    System.out.println("press 1 for--------->>>>>> INSERTION SORT IN ASCENDING ORDER ");
			                    System.out.println("press 2 for--------->>>>>> INSERTION SORT IN DESCENDING ORDER ");
			                    int choice5=sc.nextInt();
			                    if (choice5==1){
			                        new logics().insertionSortAscending(arr1);
			                    }else if (choice5==2){
			                        new logics().insertionSortDescending(arr1);
			                    }
			                }else {
			                    System.out.println(" TATA BYE BYE.....");
			                }
			                break;
			            case 2:
			                System.out.println("press 1 for--------->>>>>> LINEAR SEARCH ");
			                System.out.println("press 2 for--------->>>>>> BINARY SEARCH ");
			                int choice2=sc.nextInt();
			                if (choice2==1){
			                    System.out.println("enter the key to search in array....");
			                    int key=sc.nextInt();
			                    new logics().linearSearch(arr1,key);
			                    if (key<0){
			                        System.out.println("Wash Your Eyes....");
			                    }

			
			                	}else if(choice2==2){
			                    System.out.println("enter the key to search in array....");
			                    int key=sc.nextInt();
			                    new logics().binarySearch(arr1,key);
			                    if (key<0){
			                        System.out.println("Wash Your Eyes....");
			                    }
			                }else {
			                    System.out.println("khatam tata bye bye...");
			                }
			            break;
			            case 3:
			                int res=new logics().findMinimum(arr1);
			                System.out.println("the minimum element in the array is... "+res);
			                break;
			            case 4:
			                int res1=new logics().findMax(arr1);
			                System.out.println("the maximum element in the array is... "+res1);
			                break;
			            default:
			                System.out.println("Goodbye..........");
			        }
			    }
			}
