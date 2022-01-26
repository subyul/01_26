
public class print {
public static void main(String[] args) {
	int arr[][] = new int[3][3];
	
	int k = 1;
	for(int i= 0;i<3;i++)									// arr배열에 값을 넣기위한 반복문
	{
		for(int j = 0;j<3;j++)
		{
			arr[i][j] = 10*k;
			k++;
			System.out.print(arr[i][j]+" ");
		}
	}
	System.out.println();
	
	//문제 1 전체 합 출력
	int sum = 0;											// 배열의 합을 넣을 변수
	for(int i = 0; i<3;i++)
	{
		for(int j = 0; j<3;j++)
		{
			sum += arr[i][j];								// 변수에 반복문을 통해 바뀌는 arr[][] 값을 넣음
		}
	}
	System.out.println("sum = "+sum);						// 출력
	
	//문제 2 4의 배수 출력
	for(int i = 0; i<3; i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[i][j] %4==0)								// arr배열의 데이터를 4로 나눈 나머지가 0이라면
			{
				System.out.print(arr[i][j]+" ");			// 데이터 출력
			}
		}
	}
	
	//문제 3 4의 배수의 합
	System.out.println();
	int sum4 = 0;
	for(int i = 0; i<3; i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[i][j] %4==0)								// 위와 같은 프로그램이지만 배수의 합을 출력해야하기 때문에
			{
				sum4 += arr[i][j];							// 변수에 배열에 데이터를 더함
			}
		}
	}
	System.out.println("sum = "+sum4);
	
	//문제 4 4의 배수의 개수 출력
	int count = 0;
	for(int i = 0; i<3; i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[i][j] %4==0)								// 이 문제도 똑같지만 합이 하닌 개수를 출력해야하는 문제
			{
				count++;									// count 변수를 만들어 if문이 참일 때마다 증가
			}												
		}
	}
	System.out.println("count = "+count);
	
	
}
}
