import java.util.Scanner;
public class index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][]	= new int [3][3];
		int k = 1;
		for(int i= 0;i<3;i++)								//배열에 데이터를 삽입하기 위한 반복문
		{
			for(int j = 0;j<3;j++)
			{
				arr[i][j] = 10*k;
				k++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
															//문제1 인덱스 2개를 입력받아 값 출력
		System.out.println("문제1) 인덱스 2개를 입력받아 값 출력");
		System.out.println("인덱스1 입력:");
		int iddata = sc.nextInt();
															// 2중 배열이기때문에 인덱스를 2개 입력받고
		System.out.println("인덱스2 입력:");
		int iddata2 = sc.nextInt();
		
		System.out.println(arr[iddata][iddata2]);			// 입력받은 인덱스에 맞는 데이터를 출력함
		
		
															//문제2 값을 입력받아 인덱스 2개 출력
		System.out.println("문제2) 값을 입력받아 인덱스 2개 출력");
		System.out.println("갑 입력:");
		int data = sc.nextInt();
		
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				if(data == arr[i][j])						// 사용자가 입력한 데이터와 반복문을 통해 바뀌는 배열의 값이
				{											// 일치한다면 그 데이터의 인덱스를 출력함
					System.out.println("인덱스1 출력: "+i);
					System.out.println("인덱스2 출력: "+j);
				}
			}
		}
															//문제3 가장 큰 값의 인덱스 출력
		System.out.println("문제3) 가장 큰 값의 인덱스 2개 출력");
		System.out.println();
		int max = 0;										// 큰 값을 찾기 위해 max 변수를 만들어 비교함
		int index1 = 0;
		int index2 = 0;
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				if(max < arr[i][j])							// max에 있는 값보다 arr배열의 데이터가 크다면
				{
					index1 = i;								// 데이터의 인덱스를 저장
					index2 = j;
				}
			}
		}
		System.out.println("인덱스1 : "+index1);
		System.out.println("인덱스2 : "+index2);
		
		
		//문제 4 값교체
		System.out.println();
		System.out.println("문제4) 값 2개를 입력받아 값 교체");
		
		System.out.println("첫번째 값을 입력하시오: ");
		int data1 = sc.nextInt();							// 배열에 있는 값 중 바꿀 첫번째 값을 입력
		System.out.println("두번째 값을 입력하시오: ");
		int data2 = sc.nextInt();							// 두번째 값 입력
		int temp[][]  = new int [3][3];						
		int indexi = 0;
		int indexj = 0;
		int index2i = 0;
		int index2j = 0;
		
		
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				if(data1 == arr[i][j])						// 첫번째 값과 arr배열의 값이 같다면
				{
					indexi = i;								// 일치한 값의 인덱스번호를 변수에 저장함
					indexj = j;
					
 				}
			}
		}
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				if(data2 == arr[i][j])						// 두번째 값과 arr배열의 값이 같다면
				{
					index2i = i;							// 일치한 값의 인덱스 변호를 변수에 저장
					index2j = j;
					
 				}
			}
		}
		
		temp[0][0] = arr[indexi][indexj];					// 사용자가 입력한 첫 값을 temp 배열에 저장
		arr[indexi][indexj] = arr[index2i][index2j];		// 첫 값에는 사용자가 입력한 두번째 값을 저장
		arr[index2i][index2j] = temp[0][0];					// 두번째 값에는 처음 저장해둔 temp 값을 넣어
															// 값을 교체함
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				System.out.print(arr[i][j]+" ");	
			}
		}
		
	}

}
