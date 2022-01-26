
public class name {
	public static void main(String[] args) {
		String[] name = { "홍길동", "김영", "자바킹", "민병철", "메가맨" };
		int score[] = { 87, 42, 100, 11, 98 };

	

		for (int i = 0; i < score.length; i++) 
		{
			int max = score[i];							
			int index = i;
			
			for (int j = 0; j < score.length; j++) 
			{
				if (max < score[j])							// max변수의 값보다 score배열의 값이 크면
				{
					max = score[j];							// max변수에 배열의 값을 넣음
					index = j;								
				}
			}
			int temp = score[i];							// temp 배열을 만들어서 score[i]의 값을 넣고
			score[i] = score[index];						// score[i]에는 바꿔야할 score[index]를 넣음
			score[index] = temp;							// 그리고 score[index]에는 아까 저장해둔 temp의 값을 넣음
			
			String st = name[i];							// 문자열배열도 위와 같이 실행
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
