package com.edu;

import java.util.ArrayList;
import java.util.List;

class Insect{
	private String insectName;
	private int insectWeight;
	
	public Insect(String insectName, int insectWeight) {
		this.insectName=insectName;
		this.insectWeight=insectWeight;
	}

	public String getInsectName() {
		return insectName;
	}

	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}

	public int getInsectWeight() {
		return insectWeight;
	}

	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}

	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
	
}

class Insecticides{
	public List <String> mapInsectName(List<Insect> list){
		List<String> names = new ArrayList<String>();
		for (Insect insObj:list) {
			names.add(insObj.getInsectName());
		}
		return names;
		
	}
	public List<Insect> getWeight (List<Insect> list){
		List<Insect> fltrList = new ArrayList<Insect>();
		for (Insect insObj: list) {
			if(insObj.getInsectWeight()>40 && insObj.getInsectWeight()<=100) {
				fltrList.add(insObj);
			}
		}
		return fltrList;
	}
}

public class Source1 {

	public static void main(String[] args) {
		Insecticides i = new Insecticides();
		List<Insect> list= new ArrayList<Insect>();
		list.add(new Insect("Ant",45));
		list.add(new Insect("Cockroach",65));
		list.add(new Insect("bee",99));
		list.add(new Insect("Paper wasp",11));
//		System.out.println(i.mapInsectName(list));
//		System.out.println(i.getWeight(list));
		
		List<String> listnames =i.mapInsectName(list);
		System.out.println(listnames);
		
		List<Insect> list2 =i.getWeight(list);
		System.out.println(listnames);
		
		System.out.println(list2);
		
		
		

	}

}
