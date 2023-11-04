package Pro;
import java.util.Scanner;
public class logics {
			    Scanner sc=new Scanner(System.in);
			    int linearSearch(int arr[],int key)
			    {
			        boolean flag=false;
			        for (int i=0;i<=arr.length-1;i++){
			            if (arr[i]==key) {
			                System.out.println("key found at " + i);
			                flag=true;
			                break;
			            }
			        }
			        if(flag==false) {
			            System.out.println("key not found...");
			        }
			        return 0;

			    }


			    int binarySearch(int arr[],int key)

			    {
			        int low=0;
			        int high=arr.length-1;
			        while(low<=high) {
			            int mid=(low+high)/2;
			            if(key==arr[mid]) {
			                System.out.println("Key found at "+mid);
			                return mid;
			            }else if(key>arr[mid]) {
			                low=mid+1;

			            }else {
			                high=mid-1;
			            }
			        }
			        System.out.println("key not found....");
			        return -1;
			    }

			    void bubbleSortAscending(int arr[])
			    {

			        for(int i=0;i<=arr.length-2;i++) {
			            for(int j=0;j<=arr.length-2-i;j++) {
			                if(arr[j]>arr[j+1]) {
			                    int help=arr[j];
			                    arr[j]=arr[j+1];
			                    arr[j+1]=help;
			                }
			            }
			        }
			        System.out.println("the array after sorting are...");
			        for(int i=0;i<=arr.length-1;i++) {
			            System.out.print(arr[i]+" ");
			        }
			    }

			    void bubbleSortDescending(int arr[])

			    {
			        for(int i=0;i<=arr.length-2;i++) {
			            for(int j=0;j<=arr.length-2-i;j++) {
			                if(arr[j]<arr[j+1]) {
			                    int help=arr[j];
			                    arr[j]=arr[j+1];
			                    arr[j+1]=help;
			                }
			            }
			        }
			        System.out.println("the array after sorting are...");
			        for(int i=0;i<=arr.length-1;i++) {
			            System.out.print(arr[i]+" ");
			        }
			    }

			    void selectionSortAscending(int arr[])

			    {
			        for(int i=0;i<=arr.length-2;i++) {
			            int min=arr[i];
			            int pos=i;
			            for(int j=i+1;j<=arr.length-1;j++) {
			                if(arr[j]<min) {
			                    min=arr[j];
			                    pos=j;
			                }
			            }
			            int help=arr[i];
			            arr[i]=arr[pos];
			            arr[pos]=help;
			        }
			        System.out.println("the array after sorting are...");
			        for(int i=0;i<=arr.length-1;i++) {
			            System.out.print(arr[i]+" ");
			        }
			    }

			    void selectionSortDescending(int arr[])

			    {
			        for(int i=0;i<=arr.length-2;i++) {
			            int min=arr[i];
			            int pos=i;
			            for(int j=i+1;j<=arr.length-1;j++) {
			                if(arr[j]>min) {
			                    min=arr[j];
			                    pos=j;
			                }
			            }
			            int help=arr[i];
			            arr[i]=arr[pos];
			            arr[pos]=help;
			        }
			        System.out.println("the array after sorting are...");
			        for(int i=0;i<=arr.length-1;i++) {
			            System.out.print(arr[i]+" ");
			        }
			    }

			    void insertionSortAscending(int arr[])

			    {
			        int item;
			        int j;
			        for(int i=1;i<=arr.length-1;i++) {
			            item=arr[i];
			            j=i-1;
			            while(j>=0&&arr[j]>item) {
			                arr[j+1]=arr[j];
			                j--;
			            }
			            arr[j+1]=item;
			        }
			        System.out.println("the array after sorting are...");
			        for(int i=0;i<=arr.length-1;i++) {
			            System.out.print(arr[i]+" ");
			        }
			    }

			    void insertionSortDescending(int arr[])

			    {
			        int item;
			        int j;
			        for(int i=1;i<=arr.length-1;i++) {
			            item=arr[i];
			            j=i-1;
			            while(j>=0&&arr[j]<item) {
			                arr[j+1]=arr[j];
			                j--;
			            }
			            arr[j+1]=item;
			        }
			        System.out.println("the array after sorting are...");
			        for(int i=0;i<=arr.length-1;i++) {
			            System.out.print(arr[i]+" ");
			        }
			    }

		
			int findMinimum(int arr[])
			    {
			        for(int i=0;i<=arr.length-1;i++){
			            for(int j=i+1;j<=arr.length-1;j++){
			                if(arr[i]>arr[j]){
			                    //swap
			                    int help=arr[i];
			                    arr[i]=arr[j];
			                    arr[j]=help;
			                }
			            }
			        }
			        return arr[0];
			    }


			    int findMax(int arr[])
			    {
			        for(int i=0;i<=arr.length-1;i++){
			            for(int j=i+1;j<=arr.length-1;j++){
			                if(arr[i]>arr[j]){
			                    //swap
			                    int help=arr[i];
			                    arr[i]=arr[j];
			                    arr[j]=help;
			                }
			            }
			        }
			        return arr[arr.length-1];
			       
			        
			    }
			}

