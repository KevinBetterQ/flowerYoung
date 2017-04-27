// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FindHairFragment5$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.fragment.FindHairFragment5 target, Object source) {
    View view;
    view = finder.findById(source, 2131165599);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165599' for field 'mWaterList' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mWaterList = (com.lan.nicehair.waterfall.widget.XListView) view;
  }

  public static void reset(com.lan.nicehair.fragment.FindHairFragment5 target) {
    target.mWaterList = null;
  }
}
