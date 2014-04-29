package com.example.ijob;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import android.app.Application;

/**
 * ��ע�б���Ϣ
 * @author ZipS
 *
 */
public class Follow extends Application {
	private static final long serialVersionUID = -7060210544600464481L;
	private ArrayList<String> followedCityList = new ArrayList<String>();
	private String[] followedCity = {"����","����","�Ϻ�"};
	private String[] cityChoices = {"����","����","�Ϻ�","����","�Ͼ�","����","�人","ŦԼ","�麣","���"};
	private ArrayList<String> cityChoicesList = new ArrayList<String>();
	private String[] followedPost = {"�����������ʦ"};
	private String[] postChoices = {"�����������ʦ","�г�Ӫ��","������Դ","������չ","ϵͳ����","CEO","��ȫר��"};
	public Follow(){
		for (int i = 0; i < followedCity.length; i++) {
			followedCityList.add(followedCity[i]);
		}
		for (int i = 0; i < cityChoices.length; i++) {
			cityChoicesList.add(cityChoices[i]);
		}
		
	}
	public ArrayList<String> getCityChoices(){
		
		return cityChoicesList;
	}
	public void removeCityChoiceFromList(String s){
		cityChoicesList.remove(s);
	}
	public void removeFollowedCityFromList(String s){
		followedCityList.remove(s);
	}
	public void addCityToFollowedList(String s){
		if (!followedCityList.contains(s)) {
			followedCityList.add(s);
		}
		//followedCityList.add(s);
	}
	public String[] getPostChoices(){
		
		return postChoices;
	}
	public ArrayList<String> getFollowedCity(){
		return followedCityList;
	}
	public String[] getFollowedPost(){
		return followedPost;
	}
}
