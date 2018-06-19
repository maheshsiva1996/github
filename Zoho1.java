import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zoho1 {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Max char per line : ");
		int maxCharacterLine = input.nextInt();
		System.out.println("Favorite character : ");
		char favoriteChar = input.next().charAt(0);
		System.out.println("Words : ");
		String wordString = input.next();
		System.out.println(wordString);
		String[] words = wordString.split(",");
		ArrayList<String> wordList = new ArrayList<>();
		ArrayList<Integer> wordLength = new ArrayList<>();
		for(int i=0; i< words.length; i++){
			wordList.add(words[i]);
			int counter=0;
			char word[]=words[i].toCharArray();
			for(int j=0;j<word.length;j++){
				if(Character.toString(word[j]).equalsIgnoreCase(Character.toString(favoriteChar))){
					counter++;
				}
			}
			wordLength.add(words[i].length()-counter);
		}
		
		for(int i=0; i<wordLength.size();i++){
			for(int j=i+1; j<wordLength.size(); j++){
				if(wordLength.get(j)>wordLength.get(i)){
					int maxnum = wordLength.get(i);
					wordLength.set(i, wordLength.get(j));
					wordLength.set(j, maxnum);
					
					String max = wordList.get(i);
					wordList.set(i, wordList.get(j));
					wordList.set(j, max);
					}
			}			
		}
		System.out.println();
		
		
		
		for(int i =0; i<wordLength.size()-1;i++){	
			if(wordLength.get(i)==0){continue;}
			int sum = wordLength.get(i);
			String result=wordList.get(i);
			for(int j=i+1; j<wordLength.size();j++){
				if((sum+wordLength.get(j))<=maxCharacterLine && wordList.get(j)!=null){
					sum=sum+wordLength.get(j);
					result=result+" "+wordList.get(j);
					wordLength.set(j, 0);
					wordList.set(j, null);
				}
			}
			if(result!=null)
			System.out.println(result+"("+sum+")");
		}
		
	
	}
	
	

}
