
public class print {
public static void main(String[] args) {
	int arr[][] = new int[3][3];
	
	int k = 1;
	for(int i= 0;i<3;i++)									// arr�迭�� ���� �ֱ����� �ݺ���
	{
		for(int j = 0;j<3;j++)
		{
			arr[i][j] = 10*k;
			k++;
			System.out.print(arr[i][j]+" ");
		}
	}
	System.out.println();
	
	//���� 1 ��ü �� ���
	int sum = 0;											// �迭�� ���� ���� ����
	for(int i = 0; i<3;i++)
	{
		for(int j = 0; j<3;j++)
		{
			sum += arr[i][j];								// ������ �ݺ����� ���� �ٲ�� arr[][] ���� ����
		}
	}
	System.out.println("sum = "+sum);						// ���
	
	//���� 2 4�� ��� ���
	for(int i = 0; i<3; i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[i][j] %4==0)								// arr�迭�� �����͸� 4�� ���� �������� 0�̶��
			{
				System.out.print(arr[i][j]+" ");			// ������ ���
			}
		}
	}
	
	//���� 3 4�� ����� ��
	System.out.println();
	int sum4 = 0;
	for(int i = 0; i<3; i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[i][j] %4==0)								// ���� ���� ���α׷������� ����� ���� ����ؾ��ϱ� ������
			{
				sum4 += arr[i][j];							// ������ �迭�� �����͸� ����
			}
		}
	}
	System.out.println("sum = "+sum4);
	
	//���� 4 4�� ����� ���� ���
	int count = 0;
	for(int i = 0; i<3; i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[i][j] %4==0)								// �� ������ �Ȱ����� ���� �ϴ� ������ ����ؾ��ϴ� ����
			{
				count++;									// count ������ ����� if���� ���� ������ ����
			}												
		}
	}
	System.out.println("count = "+count);
	
	
}
}
