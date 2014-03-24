package com.bignerdranch.android.draganddraw;

import android.support.v4.app.Fragment;

public class DragandDrawActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new DragAndDrawFragment();
	}

}
