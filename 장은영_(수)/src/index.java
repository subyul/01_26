import java.util.Scanner;
public class index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][]	= new int [3][3];
		int k = 1;
		for(int i= 0;i<3;i++)								//�迭�� �����͸� �����ϱ� ���� �ݺ���
		{
			for(int j = 0;j<3;j++)
			{
				arr[i][j] = 10*k;
				k++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
															//����1 �ε��� 2���� �Է¹޾� �� ���
		System.out.println("����1) �ε��� 2���� �Է¹޾� �� ���");
		System.out.println("�ε���1 �Է�:");
		int iddata = sc.nextInt();
															// 2�� �迭�̱⶧���� �ε����� 2�� �Է¹ް�
		System.out.println("�ε���2 �Է�:");
		int iddata2 = sc.nextInt();
		
		System.out.println(arr[iddata][iddata2]);			// �Է¹��� �ε����� �´� �����͸� �����
		
		
															//����2 ���� �Է¹޾� �ε��� 2�� ���
		System.out.println("����2) ���� �Է¹޾� �ε��� 2�� ���");
		System.out.println("�� �Է�:");
		int data = sc.nextInt();
		
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				if(data == arr[i][j])						// ����ڰ� �Է��� �����Ϳ� �ݺ����� ���� �ٲ�� �迭�� ����
				{											// ��ġ�Ѵٸ� �� �������� �ε����� �����
					System.out.println("�ε���1 ���: "+i);
					System.out.println("�ε���2 ���: "+j);
				}
			}
		}
															//����3 ���� ū ���� �ε��� ���
		System.out.println("����3) ���� ū ���� �ε��� 2�� ���");
		System.out.println();
		int max = 0;										// ū ���� ã�� ���� max ������ ����� ����
		int index1 = 0;
		int index2 = 0;
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				if(max < arr[i][j])							// max�� �ִ� ������ arr�迭�� �����Ͱ� ũ�ٸ�
				{
					index1 = i;								// �������� �ε����� ����
					index2 = j;
				}
			}
		}
		System.out.println("�ε���1 : "+index1);
		System.out.println("�ε���2 : "+index2);
		
		
		//���� 4 ����ü
		System.out.println();
		System.out.println("����4) �� 2���� �Է¹޾� �� ��ü");
		
		System.out.println("ù��° ���� �Է��Ͻÿ�: ");
		int data1 = sc.nextInt();							// �迭�� �ִ� �� �� �ٲ� ù��° ���� �Է�
		System.out.println("�ι�° ���� �Է��Ͻÿ�: ");
		int data2 = sc.nextInt();							// �ι�° �� �Է�
		int temp[][]  = new int [3][3];						
		int indexi = 0;
		int indexj = 0;
		int index2i = 0;
		int index2j = 0;
		
		
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				if(data1 == arr[i][j])						// ù��° ���� arr�迭�� ���� ���ٸ�
				{
					indexi = i;								// ��ġ�� ���� �ε�����ȣ�� ������ ������
					indexj = j;
					
 				}
			}
		}
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				if(data2 == arr[i][j])						// �ι�° ���� arr�迭�� ���� ���ٸ�
				{
					index2i = i;							// ��ġ�� ���� �ε��� ��ȣ�� ������ ����
					index2j = j;
					
 				}
			}
		}
		
		temp[0][0] = arr[indexi][indexj];					// ����ڰ� �Է��� ù ���� temp �迭�� ����
		arr[indexi][indexj] = arr[index2i][index2j];		// ù ������ ����ڰ� �Է��� �ι�° ���� ����
		arr[index2i][index2j] = temp[0][0];					// �ι�° ������ ó�� �����ص� temp ���� �־�
															// ���� ��ü��
		for(int i = 0; i<3;i++)
		{
			for(int j = 0; j<3;j++)
			{
				System.out.print(arr[i][j]+" ");	
			}
		}
		
	}

}
