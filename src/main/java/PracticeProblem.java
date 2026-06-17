/**

        * File: Lesson 5.8 

        * Author: Peter

        * Date Created: June 17, 2026

        * Date Last Modified: June 17, 2026

        */

import java.util.HashMap;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages){

		int size = Math.min(names.length, ages.length);
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < size; i++){
			map.put(names[i], ages[i]);
		}
		return map;
	}
	
	public static void increaseAge(HashMap<String, Integer> map, String name){

		if (map.containsKey(name)){
			int currentAge = map.get(name);

			map.put(name, currentAge + 1);
		}
	}

	public static void replaceName(HashMap<String, Integer> map, String name1, String name2){
		if (map.containsKey(name1)){
			if (name1.equals(name2)){
				return;
			}
			map.put(name2, map.get(name1));
			map.remove(name1);
			
		}
	}

}

