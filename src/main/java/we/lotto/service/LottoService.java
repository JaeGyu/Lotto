package we.lotto.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;

import we.lotto.model.LottoNumbers;

@Service
public class LottoService {

	private static final int NUM_OF_PICK = 6;
	private static final int END_NUMBER = 42;
	public LottoNumbers getNumber() {
		
		// 1 ~ 45 개중에 6개 랜덤 중복된 숫자가 없도록  
		
		//목 테스트를 먼저 
		
		Set<Integer> set = new HashSet<Integer>();
		Random rand = new Random();
		
		while( set.size() < NUM_OF_PICK ) {
			int newPick = rand.nextInt(END_NUMBER) + 1;
			set.add(newPick);
		}
		
		List<Integer> list = new ArrayList<>(set);
		
		return new LottoNumbers(list);
	}
	
	
}
