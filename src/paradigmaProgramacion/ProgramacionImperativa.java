package paradigmaProgramacion;

import java.util.ArrayList;
import java.util.List;

public class ProgramacionImperativa {

	public void main(){
		List<Integer> numbers = List.of(18,6,4,15,55,78,12,9,8);
		int count = 0;
		for (Integer integer : numbers) {
			if(integer >10) {
				count++;
			}
		}
		System.out.println(count);
	}
}
