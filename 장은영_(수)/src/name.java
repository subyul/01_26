
public class name {
	public static void main(String[] args) {
		String[] name = { "ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���" };
		int score[] = { 87, 42, 100, 11, 98 };

	

		for (int i = 0; i < score.length; i++) 
		{
			int max = score[i];							
			int index = i;
			
			for (int j = 0; j < score.length; j++) 
			{
				if (max < score[j])							// max������ ������ score�迭�� ���� ũ��
				{
					max = score[j];							// max������ �迭�� ���� ����
					index = j;								
				}
			}
			int temp = score[i];							// temp �迭�� ���� score[i]�� ���� �ְ�
			score[i] = score[index];						// score[i]���� �ٲ���� score[index]�� ����
			score[index] = temp;							// �׸��� score[index]���� �Ʊ� �����ص� temp�� ���� ����
			
			String st = name[i];							// ���ڿ��迭�� ���� ���� ����
			name[i] = name[index];
			name[index] = st;
		}

		for(int i = 0; i<score.length;i++)
		{
			System.out.print(name[i]+" ");
			System.out.print(score[i]+" ");
			System.out.println();
		}
		
	}
}
