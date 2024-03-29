package com.pkusz.analyze;

import java.util.ArrayList;
import java.util.List;

import com.example.jinluokb.R;
import com.nineoldandroids.view.ViewHelper;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowList extends FragmentActivity {
	private ViewPager viewPager;
	private List<Fragment> lists;
	private FragmentAdapter fa;
	private TextView tv1;
	private TextView tv2;
	private TextView tv3;
	private TextView tv4;
	private ImageView iv1;
	private ImageView iv2;
	private ImageView iv3;
	private ImageView iv4;
	private TextView tv01;
	private TextView tv02;
	private TextView tv03;
	private TextView tv04;
	private ImageView iv01;
	private ImageView iv02;
	private ImageView iv03;
	private ImageView iv04;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.showlist);
		initView();
	}

	private void initView() {
		viewPager = (ViewPager) findViewById(R.id.view_pager);
		tv1 = (TextView) findViewById(R.id.tv1);
		tv2 = (TextView) findViewById(R.id.tv2);
		tv3 = (TextView) findViewById(R.id.tv3);
		tv4 = (TextView) findViewById(R.id.tv4);

		tv01 = (TextView) findViewById(R.id.tv01);
		tv02 = (TextView) findViewById(R.id.tv02);
		tv03 = (TextView) findViewById(R.id.tv03);
		tv04 = (TextView) findViewById(R.id.tv04);

		iv1 = (ImageView) findViewById(R.id.iv1);
		iv2 = (ImageView) findViewById(R.id.iv2);
		iv3 = (ImageView) findViewById(R.id.iv3);
		iv4 = (ImageView) findViewById(R.id.iv4);

		iv01 = (ImageView) findViewById(R.id.iv01);
		iv02 = (ImageView) findViewById(R.id.iv02);
		iv03 = (ImageView) findViewById(R.id.iv03);
		iv04 = (ImageView) findViewById(R.id.iv04);

		lists = new ArrayList<Fragment>();
		FamilyFragment familyf = new FamilyFragment();
		FriendFragment friendf = new FriendFragment();
		ClientFragment clientf = new ClientFragment();
		ColleagueFragment colleaguef = new ColleagueFragment();
		lists.add(familyf);
		lists.add(friendf);
		lists.add(clientf);
		lists.add(colleaguef);
		
		fa = new FragmentAdapter(getSupportFragmentManager());
		viewPager.setAdapter(fa);

		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			private float apha;

			@Override
			public void onPageSelected(int arg0) {
				switch (arg0) {
				case 0:
					tv1.setVisibility(View.VISIBLE);//tv1 是绿色
					tv01.setVisibility(View.GONE);

					tv2.setVisibility(View.VISIBLE);//tv2 是黑色
					tv02.setVisibility(View.GONE);

					tv3.setVisibility(View.VISIBLE);
					tv03.setVisibility(View.GONE);
					
					tv4.setVisibility(View.VISIBLE);
					tv04.setVisibility(View.GONE);

					iv1.setVisibility(View.VISIBLE);//iv1 是蓝色
					iv01.setVisibility(View.GONE);

					iv2.setVisibility(View.VISIBLE);// iv2 是白色
					iv02.setVisibility(View.GONE);

					iv3.setVisibility(View.VISIBLE);
					iv03.setVisibility(View.GONE);
					
					iv4.setVisibility(View.VISIBLE);
					iv04.setVisibility(View.GONE);
					break;
				case 1:
					tv1.setVisibility(View.GONE);
					tv01.setVisibility(View.VISIBLE);

					tv2.setVisibility(View.GONE);
					tv02.setVisibility(View.VISIBLE);

					tv3.setVisibility(View.VISIBLE);
					tv03.setVisibility(View.GONE);
					
					tv4.setVisibility(View.VISIBLE);
					tv04.setVisibility(View.GONE);

					iv1.setVisibility(View.GONE);
					iv01.setVisibility(View.VISIBLE);

					iv2.setVisibility(View.GONE);
					iv02.setVisibility(View.VISIBLE);

					iv3.setVisibility(View.VISIBLE);
					iv03.setVisibility(View.GONE);
					
					iv4.setVisibility(View.VISIBLE);
					iv04.setVisibility(View.GONE);
				case 2:
					tv1.setVisibility(View.GONE);
					tv01.setVisibility(View.VISIBLE);

					tv2.setVisibility(View.VISIBLE);
					tv02.setVisibility(View.GONE);

					tv3.setVisibility(View.GONE);
					tv03.setVisibility(View.VISIBLE);
					
					tv4.setVisibility(View.VISIBLE);
					tv04.setVisibility(View.GONE);

					iv1.setVisibility(View.GONE);
					iv01.setVisibility(View.VISIBLE);

					iv2.setVisibility(View.VISIBLE);
					iv02.setVisibility(View.GONE);

					iv3.setVisibility(View.GONE);
					iv03.setVisibility(View.VISIBLE);
					
					iv4.setVisibility(View.VISIBLE);
					iv04.setVisibility(View.GONE);

					break;
				case 3:
					tv1.setVisibility(View.GONE);
					tv01.setVisibility(View.VISIBLE);

					tv2.setVisibility(View.VISIBLE);
					tv02.setVisibility(View.GONE);

					tv3.setVisibility(View.VISIBLE);
					tv03.setVisibility(View.GONE);
					
					tv4.setVisibility(View.GONE);
					tv04.setVisibility(View.VISIBLE);

					iv1.setVisibility(View.GONE);
					iv01.setVisibility(View.VISIBLE);

					iv2.setVisibility(View.VISIBLE);
					iv02.setVisibility(View.GONE);

					iv3.setVisibility(View.VISIBLE);
					iv03.setVisibility(View.GONE);
					
					iv4.setVisibility(View.GONE);
					iv04.setVisibility(View.VISIBLE);
					break;
				default:
					break;
				}
			}

			/**
			 * arg0:当前页面，及你点击滑动的页面 arg1:当前页面偏移的百分比 arg2:当前页面偏移的像素位置
			 */
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// arg1 0-1
				switch (arg0) {
				case 0:
					ViewHelper.setAlpha(tv1, 1 - arg1);
					ViewHelper.setAlpha(tv01, arg1);

					ViewHelper.setAlpha(tv2, 1 - arg1);
					ViewHelper.setAlpha(tv02, arg1);

					tv1.setVisibility(View.VISIBLE);
					tv2.setVisibility(View.VISIBLE);
					tv3.setVisibility(View.VISIBLE);
					tv01.setVisibility(View.VISIBLE);
					tv02.setVisibility(View.VISIBLE);
					tv03.setVisibility(View.VISIBLE);
					

					ViewHelper.setAlpha(iv1, 1 - arg1);
					ViewHelper.setAlpha(iv01, arg1);
					ViewHelper.setAlpha(iv2, 1 - arg1);
					ViewHelper.setAlpha(iv02, arg1);
					ViewHelper.setAlpha(iv3, 1 - arg1);
					ViewHelper.setAlpha(iv03, arg1);

					iv01.setVisibility(View.VISIBLE);
					iv02.setVisibility(View.VISIBLE);
					iv03.setVisibility(View.VISIBLE);
					break;
				case 1:
					ViewHelper.setAlpha(tv2, arg1);
					ViewHelper.setAlpha(tv02, 1 - arg1);

					ViewHelper.setAlpha(tv3, 1 - arg1);
					ViewHelper.setAlpha(tv03, arg1);

					tv2.setVisibility(View.VISIBLE);
					tv3.setVisibility(View.VISIBLE);
					tv02.setVisibility(View.VISIBLE);
					tv03.setVisibility(View.VISIBLE);

					ViewHelper.setAlpha(iv2, arg1);
					ViewHelper.setAlpha(iv02, 1 - arg1);
					ViewHelper.setAlpha(iv3, 1 - arg1);
					ViewHelper.setAlpha(iv03, arg1);

					iv02.setVisibility(View.VISIBLE);
					iv03.setVisibility(View.VISIBLE);
					break;
				case 2:
					
					ViewHelper.setAlpha(tv3, arg1);
					ViewHelper.setAlpha(tv03, 1 - arg1);

					ViewHelper.setAlpha(tv4, 1 - arg1);
					ViewHelper.setAlpha(tv04, arg1);

					tv3.setVisibility(View.VISIBLE);
					tv4.setVisibility(View.VISIBLE);
					tv03.setVisibility(View.VISIBLE);
					tv04.setVisibility(View.VISIBLE);

					ViewHelper.setAlpha(iv3, arg1);
					ViewHelper.setAlpha(iv03, 1 - arg1);
					ViewHelper.setAlpha(iv4, 1 - arg1);
					ViewHelper.setAlpha(iv04, arg1);

					iv03.setVisibility(View.VISIBLE);
					iv04.setVisibility(View.VISIBLE);
					break;

				default:
					break;
				}
			}

			// arg0是你当前选中的页面的Position
			@Override
			public void onPageScrollStateChanged(int arg0) {

			}
		});
	}

	class FragmentAdapter extends FragmentPagerAdapter {

		public FragmentAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public int getCount() {
			return lists.size();
		}

		@Override
		public Fragment getItem(int arg0) {
			return lists.get(arg0);
		}
	}
}