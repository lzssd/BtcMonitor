package com.geniusgithub.bcoinmonitor.adapter;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SubPagerAdapter extends FragmentPagerAdapter{

	private List<Fragment> mFragments = new ArrayList<Fragment>();
	
	public SubPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	
	public void setFragments(List<Fragment> list){
		mFragments = list;
	}
	
	public void addFragment(Fragment fragment){
		mFragments.add(fragment);
	}
	
	public void clear(){
		mFragments = new ArrayList<Fragment>();
	}

	@Override
	public Fragment getItem(int pos) {
		return mFragments.get(pos);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mFragments.size();
	}




}
