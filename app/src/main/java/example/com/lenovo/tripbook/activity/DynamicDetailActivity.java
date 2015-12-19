package example.com.lenovo.tripbook.activity;
//动态社区
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import example.com.lenovo.tripbook.R;
import example.com.lenovo.tripbook.adapter.DynamicPageAdapter;
import example.com.lenovo.tripbook.bean.Dynamic;

public class DynamicDetailActivity extends FragmentActivity{

	ViewPager viewPager;
	DynamicPageAdapter pageAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.yh_dynamic_detail);
		
		viewPager=(ViewPager)findViewById(R.id.dynamic_detail_viewpage);
		ArrayList<Dynamic> list=new ArrayList<Dynamic>();
		for (int i = 0; i < 40; i++) {
			list.add(new Dynamic());
		}
		
		pageAdapter=new DynamicPageAdapter(DynamicDetailActivity.this, list);
		viewPager.setAdapter(pageAdapter);
		
	}
	
}
